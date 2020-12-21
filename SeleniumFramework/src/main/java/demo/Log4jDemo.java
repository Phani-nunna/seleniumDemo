package demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4jDemo {
	private static Logger logger = LogManager.getLogger(Log4jDemo.class);

	public static void main(String[] args) {
		System.out.println(" 	Hello world   \n");
		
		logger.trace("Thisis Tracemessage");
		logger.info("This Info Message");
		logger.error("This Error Message");  // initial print
		logger.warn("This Warning Message");
		logger.fatal("This Fatal Message"); // initial print
		
		
		System.out.println("Completed...s");
		

	}

}
