package org.brijesh.dockerbasedspringapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DockerBasedSpringApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(DockerBasedSpringApiApplication.class, args);
	}

	@GetMapping(value = "test")
	public String helloWorld() {
		return "Hello World from Spring API " + "test";
	}
}