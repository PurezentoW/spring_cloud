package top.xx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;

/**
 * @author Administrator
 */
@SpringBootApplication
@EnableAuthorizationServer
public class SpringCloudOauth2ServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudOauth2ServerApplication.class, args);
	}

//	@Bean
//	public PasswordEncoder passwordEncoder(){
//		return new BCryptPasswordEncoder();
//	}

}
