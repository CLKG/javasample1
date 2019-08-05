package Sample;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;

public class Sample1 {
	
	@Test
	public void console()
	{
		BasicConfigurator.configure();
		Logger log = Logger.getLogger(this.getClass().getName());
		
		log.info("Info Message");
		log.error("Error Message");
			log.error("Error Message");
		log.warn("Warning Message");
log.warn("Warning Message");
		
	}

}
