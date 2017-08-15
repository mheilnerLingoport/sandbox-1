package com.lingoport;

import java.text.DateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class HelloWorld {

	public static void main(String[] args) {
		String greeting = "Hello World";
		String goodbye = " Goodbye World";

		greeting.equalsIgnoreCase(goodbye);

		DateFormat dateFormatter = DateFormat.getDateInstance(DateFormat.DEFAULT);
		String dateString = dateFormatter.format(new Date());

		Double inputNum = new Double("2.57") + new Double("3.45");

		System.out.println(greeting);
		System.out.println(inputNum);
		System.out.println(dateString);

		Logger logger = Logger.getLogger("Logger");
		String logMessage = "Logging message - Don't translate me."; // $NON-NLS-L$
		logger.log(Level.INFO, logMessage);
	}
}
