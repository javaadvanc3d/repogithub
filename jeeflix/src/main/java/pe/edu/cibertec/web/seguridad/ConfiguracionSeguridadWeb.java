package pe.edu.cibertec.web.seguridad;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
@EnableWebSecurity
public class ConfiguracionSeguridadWeb extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(HttpSecurity http) throws Exception{

			//->Solo para ambiente de pruebas/aprendizaje - NO PRODUCCION!
		    //http.csrf().disable();//Habilitarlo SI o SI en PROD, solo para pruebas se puede desactivar... Sirve para protegernos del Cross Site Scripting (XSS)
		    //SI SE HABILITA el uso de csrf (muy buena práctica, habilitado por defecto), TODOS MIS FORMULARIOS deberan tener el siguiente token generado por Spring Security:
	
		    /*
			         <form id="un_formulario_de_mi_aplicacion">
			         	<!-- contenido... -->
				        <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
			    	 </form>
	         */	
			
		    //->Configuracion de seguridad por Roles y Accesos
		    http.authorizeRequests()

		    
	        //-> Permitir acceso a cualquier usuario, a paginas publicas y de errores
	        .antMatchers(
	        		"/login.xhtml", "/acceso",
	        		"/index.xhtml",
	        		"/500.xhtml", "/denegado.xhtml")
	        .permitAll()

	        
	        //->Solo se puede ver el listado de Multimedia, si el usuario esta logueado y tiene rol ROOT o ADMIN
	        .antMatchers("/mantenimiento/mantMultimedia.xhtml")
	        .hasAnyRole("ROOT", "ADMIN") // Va cualquiera de los roles mencionados
	        
	        
	        //->Solo se puede crear Multimedia, si el usuario esta logueado y tiene rol ROOT
	        .antMatchers("/mantenimiento/crearMultimedia.xhtml")
	        .hasRole("ROOT") // Va un solo ROL

	        
	        //->En caso que no se haya logueado, mandar a formulario LOGIN
	        .and()
	        .formLogin()
	        .loginPage("/login.xhtml") //Pagina para el formulario del login
	        .loginProcessingUrl("/acceso") // URL deL ACTION que procesa el Login
	        .usernameParameter("usuario")
	        .passwordParameter("contrasenia")
	        .defaultSuccessUrl("/index.xhtml")// Si el login es correcto
	        .and().exceptionHandling().accessDeniedPage("/denegado.xhtml"); // Si el login es incorrecto
		    
		    
	        //->Configuracion de cierre de session:
		    http.logout()
		        .logoutRequestMatcher(new AntPathRequestMatcher("/logout")) //Action
		        .invalidateHttpSession(true)
		        .logoutSuccessUrl("/index.xhtml");
	}

    @Bean
    public UserDetailsService userDetailsService() {
        User.UserBuilder users = User.withDefaultPasswordEncoder();
        InMemoryUserDetailsManager manager = new InMemoryUserDetailsManager();
        manager.createUser(users.username("root").password("123456").roles("ROOT").build());
        manager.createUser(users.username("admin").password("123").roles("ADMIN").build());
        manager.createUser(users.username("rigoberto").password("123").roles("USER").build());
        return manager;
    }
}
