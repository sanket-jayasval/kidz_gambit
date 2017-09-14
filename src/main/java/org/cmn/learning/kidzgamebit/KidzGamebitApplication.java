package org.cmn.learning.kidzgamebit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import static springfox.documentation.builders.PathSelectors.any;

@SpringBootApplication
@ComponentScan
@EnableSwagger2
public class KidzGamebitApplication {

	@Bean
	public Docket api(){
		return new Docket(DocumentationType.SWAGGER_2).groupName("Room").select()
				.apis(RequestHandlerSelectors.basePackage("org.cmn.learning.kidzgamebit.web.service"))
				.paths(any()).build().apiInfo(new ApiInfo("Room Services",
						"A set of services to provide data access to rooms", "1.0.0", null,
						new Contact("User", "https://test.com", null),null, null));
	}

	public static void main(String[] args) {
		SpringApplication.run(KidzGamebitApplication.class, args);
	}
}
