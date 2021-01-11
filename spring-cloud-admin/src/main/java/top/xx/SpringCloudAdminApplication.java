package top.xx;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author Administrator
 */
@EnableDiscoveryClient
@EnableAdminServer
@SpringBootApplication
public class SpringCloudAdminApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudAdminApplication.class, args);
	}

}
