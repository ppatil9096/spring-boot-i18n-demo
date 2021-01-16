package com.patjavahere;

import java.util.Locale;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.i18n.AcceptHeaderLocaleResolver;

@SpringBootApplication
public class RestfulBootI18nDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestfulBootI18nDemoApplication.class, args);
	}

	/**
	 * Simple program to demo the session locale's
	 * 
	 *//*
		 * @Bean public LocaleResolver localeResolver() { SessionLocaleResolver
		 * localeResolver = new SessionLocaleResolver();
		 * localeResolver.setDefaultLocale(Locale.US); return localeResolver; }
		 * 
		 * @Bean public ResourceBundleMessageSource messageSource() {
		 * ResourceBundleMessageSource messageSource = new
		 * ResourceBundleMessageSource(); messageSource.setBasename("messages"); return
		 * messageSource; }
		 */

	/**
	 * Advanced locale demo using spring
	 * 
	 */
	@Bean
	public LocaleResolver localeResolver() {
		AcceptHeaderLocaleResolver localeResolver = new AcceptHeaderLocaleResolver();
		localeResolver.setDefaultLocale(Locale.US);
		return localeResolver;
	}
}
