package Sample;

import java.io.IOException;

import org.apache.log4j.Appender;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Category;
import org.apache.log4j.FileAppender;
import org.apache.log4j.Layout;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;
import org.testng.annotations.Test;

public class sample2 {
		
	@Test
	public void report() throws IOException
	{
		Layout layout=new PatternLayout("%d %c %m %n");
		Appender appender= new FileAppender(layout, "./report/rep.log");
		BasicConfigurator.configure(appender);
		
		Logger log = Logger.getLogger(this.getClass().getName());
		
	
		log.info("information");
		log.error("Error message");
		log.warn("Warning messgae");
		
	}

}
