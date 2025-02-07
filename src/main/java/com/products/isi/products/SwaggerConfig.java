package com.products.isi.products;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("API de Gestion des Produits")
                        .version("1.0")
                        .description("Documentation de l'API pour la gestion des produits")
                        .license(new License().name("Apache 2.0").url("http://springdoc.org")));
    }
}
