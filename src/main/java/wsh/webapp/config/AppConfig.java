package wsh.webapp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import wsh.webapp.beans.KBean;

@Configuration
@ComponentScan("wsh.webapp.beans")
public class AppConfig {
	
	@Bean
	public KBean getKBean() {
		System.out.println("initializing kbean~~~~");
		return new KBean();
	}
}
