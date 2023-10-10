package br.com.artur.apirestspring.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI customOpenApi() {
        return new OpenAPI()
                .info(new Info()
                        .title("Rent a car")
                        .version("1.0")
                        .description("How to use the API")
                        .termsOfService("http://jlgregorio.com")
                        .license(new License()
                                .name("Apache License, Version 2.0")
                                .url("http://www.apache.org/licenses/")));
    }


}


