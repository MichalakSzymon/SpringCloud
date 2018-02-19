package service.tofirstservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.cloud.client.discovery.DiscoveryClient;
@SpringBootApplication

@EnableDiscoverClient
public class ToserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ToserviceApplication.class, args);
	}
}
