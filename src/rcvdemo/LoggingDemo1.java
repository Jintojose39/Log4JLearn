package rcvdemo;

import org.apache.logging.log4j.*;

public class LoggingDemo1 {

	private static Logger demologger = LogManager.getLogger(LoggingDemo1.class.getName());

	public static void main(String[] args) {

		demologger.info("Click is Succesfull");

		demologger.error("DB connection Failed");

		demologger.debug("This is debug");

		demologger.fatal("This is Fatal");

	}

}
