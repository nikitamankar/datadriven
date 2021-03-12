import org.apache.log4j.Logger;

public class TestLog4j {

		// TODO Auto-generated method stub
/*
 * Generating logs in 4ways
 * 1. Console based logs
 * 2.File(.logs file)
 * 3.Mail the logs
 * 4. HTML logs
 */
	static Logger log=Logger.getLogger(TestLog4j.class);
		public static void main(String[] args) {
			
			log.debug("This is a Debug Log");
			log.info("This is a Info Log");
			log.error("Error in a project");

	}

}
