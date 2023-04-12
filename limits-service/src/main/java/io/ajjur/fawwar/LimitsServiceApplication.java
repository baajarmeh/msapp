package io.ajjur.fawwar.limitsservice;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@EnableHystrix
@SpringBootApplication
public class LimitsServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(LimitsServiceApplication.class, args);
	}
}
