package Demo;



import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4j_Demo {

	
	 private static Logger logger= LogManager.getLogger("Log4j_Demo");
	public static void main(String[] args) {
		
		System.out.println("\n Hello word \n");
		
		logger.trace("The trace is completed");
		logger.info("Information");
		logger.error("This is in error");
		logger.warn("This is warn");
		logger.fatal("This is fatal");
		
		System.out.println("The test is completed");
		
		
	}

}
