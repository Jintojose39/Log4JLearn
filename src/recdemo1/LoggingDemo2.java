package recdemo1;

import org.apache.logging.log4j.*;

public class LoggingDemo2 {

	private static Logger demologger = LogManager.getLogger(LoggingDemo2.class.getName());

	public static void main(String[] args) {

		demologger.info("Click is Succesfull2");

		demologger.error("DB connection Failed2");

		demologger.debug("This is debug2");

		demologger.fatal("This is Fatal2");
		demologger.info("Click is Succesfull");

		demologger.error("DB connection Failed");

		demologger.debug("This is debug");

		demologger.fatal("This is Fatal");

		demologger.info("Click is Succesfull");

		demologger.error("DB connection Failed");

		demologger.debug("This is debug");

		demologger.fatal("This is Fatal");

		demologger.info("Click is Succesfull");

		demologger.error("DB connection Failed");

		demologger.debug("This is debug");

		demologger.fatal("This is Fatal");

	}

}
