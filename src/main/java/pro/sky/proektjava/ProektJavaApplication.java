package pro.sky.proektjava;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition
public class ProektJavaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProektJavaApplication.class, args);
	}

}
