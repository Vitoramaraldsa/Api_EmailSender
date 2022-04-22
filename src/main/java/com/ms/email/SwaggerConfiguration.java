package com.ms.email;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfiguration {
	
	@Bean
	public Docket productApi() {
		return new Docket(DocumentationType.SWAGGER_2)
                .select()                 
                .apis(RequestHandlerSelectors.basePackage("com.ms.email.controllers"))
                .paths(PathSelectors.any())
                .build().apiInfo(MetaInfo());
	}
	

	@Bean
	 public ApiInfo MetaInfo() {
	        return new ApiInfoBuilder().title("Spring Boot REST API - Envio de E-mails")
	            .description("Car Inventory REST API")
	            .contact(new Contact("Vitor Amaral", "+55(11)95647-1243", "vitoramaral2001.bkbd@gmail.com"))
	            .license("MIT")
	            .licenseUrl("https://opensource.org/licenses/MIT")
	            .version("0.0.1")
	            .build();
	    }
}
