package com.supermarket.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
@OpenAPIDefinition(
    info = @Info(
        title = "SUPERMARKET",
        version = "1.1.2",
        description = "Supermarket Management",
        contact = @Contact(
            name = "Sandhya A",
            email = "727821tuec209@skct.edu.in"
        )
    )
)
public class SupermarketApplication extends SpringBootServletInitializer {

    // Required when deploying as WAR
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(SupermarketApplication.class);
    }

    // Still needed for running as standalone JAR
    public static void main(String[] args) {
        SpringApplication.run(SupermarketApplication.class, args);
    }
}
