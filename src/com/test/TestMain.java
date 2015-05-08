package com.test;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.log4j.Appender;
import org.apache.log4j.FileAppender;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.spi.LoggerFactory;

public class TestMain {

	static Logger log=Logger.getLogger(TestMain.class);
	
	static Logger log1=Logger.getLogger("mylogger1");
	
	public static void main(String[] args) {
		PropertyConfigurator.configure(ClassLoader.getSystemResource("log4j.properties"));
		
		Appender appender = LogManager.getLoggerRepository().getRootLogger().getAppender("ServerDailyRollingFile");  
		if(appender instanceof FileAppender)     
		{   
		      FileAppender fileAppender = (FileAppender)appender;   
		      fileAppender.setFile( "bin/logs/notify." + new SimpleDateFormat("yyyy-MM-dd-HH-mm").format(new Date()) + ".log");   
		      fileAppender.activateOptions();   
		}  
		
		log.warn("123!!!ÖÐÎÄ");
		
		log.debug("log.debug");
		
		log.info("log.info");
		
		log.error("log.error");
		
		
		log.fatal("log.fatal");
		
		
		log1.warn("123!!!ÖÐÎÄ111");
		
		log1.debug("log.debug111");
		
		log1.info("log.info111");
		
		log1.info("log.info1125551");
		
		log1.error("log.error111");
		
		
		log1.fatal("log.fatal111");
		
		log1.fatal("log.fatal777");
		
		//123test ....
		
		//lllll]]]]

	}
	
	private void test()
	{
		
	//啦啦啦啦啦
	}

}
