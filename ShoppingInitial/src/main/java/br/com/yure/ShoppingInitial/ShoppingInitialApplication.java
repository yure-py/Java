package br.com.yure.ShoppingInitial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = {"Entity"})
public class ShoppingInitialApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShoppingInitialApplication.class, args);
	}

}
