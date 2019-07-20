package pe.edu.cibertec.repositorio.configuracion;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.zaxxer.hikari.HikariDataSource;


@PropertySource("classpath:config-mysql.properties")
@Configuration
public class ConfiguracionDB {
	
	@Value("${database.jdbc.driverClass}")
	private String driverClassName;
	
	@Value("${database.jdbc.url}")
	private String jdbcUrl;
	
	@Value("${database.jdbc.usuario}")
	private String username;
	
	@Value("${database.jdbc.contrasena}")
	private String password;
	
	@Value("${database.jdbc.tamanioMaximoConexiones}")
	private int maxPoolSize;
	
	
	@Bean
	public DataSource dataSource() {
		HikariDataSource ds = new HikariDataSource();
		ds.setDriverClassName(driverClassName);
		ds.setJdbcUrl(jdbcUrl);
		ds.setUsername(username);
		ds.setPassword(password);
		ds.setMaximumPoolSize(maxPoolSize);
		
		return ds;
	}

}
