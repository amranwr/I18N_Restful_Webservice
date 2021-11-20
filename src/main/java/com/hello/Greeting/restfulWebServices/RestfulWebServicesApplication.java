package com.hello.Greeting.restfulWebServices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.web.servlet.i18n.AcceptHeaderLocaleResolver;

import java.util.Locale;

@SpringBootApplication
public class RestfulWebServicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestfulWebServicesApplication.class, args);
	}

	@Bean
	public AcceptHeaderLocaleResolver localResolver(){
		AcceptHeaderLocaleResolver localResolver = new AcceptHeaderLocaleResolver();
		localResolver.setDefaultLocale(Locale.US);
		return localResolver;
	}

}
