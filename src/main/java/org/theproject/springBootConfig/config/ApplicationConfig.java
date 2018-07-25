package org.theproject.springBootConfig.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.theproject.springBootConfig.MessagePrinter;

@Configuration
@PropertySource("http://localhost:8888/a-bootiful-client/default")
public class ApplicationConfig {

	@Bean
	public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
		PropertySourcesPlaceholderConfigurer result = new PropertySourcesPlaceholderConfigurer();
		result.setIgnoreUnresolvablePlaceholders(false);
		
		return result;
	}
	
	@Value("${message}")
	private String message;
	
	@Bean
	public MessagePrinter getMessagePrinter() {
		return new MessagePrinter(message);
	}

}
