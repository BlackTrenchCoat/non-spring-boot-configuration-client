package org.theproject.springBootConfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.Environment;
import org.theproject.springBootConfig.config.ApplicationConfig;

public class ConfigClient {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);


		MessagePrinter messagePrinter = context.getBean(MessagePrinter.class);

		messagePrinter.printMessage();

	}

}
