package testBase;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.*;
import org.testng.annotations.BeforeTest;
 
public class BaseClass {
	
	 public static WebDriver driver;
	 static public Properties p;
	 public Logger logger=LogManager.getLogger(this.getClass());
   
	
	@BeforeTest
	@Parameters({"os","Browser"})
	public void setup(String os,String br) throws IOException {
	
		
 
		//loading properties file
		FileReader file=new FileReader(".//src//test//resources//config.properties");
		p=new Properties();
	    p.load(file);
	  
	    
		if(p.getProperty("execution_env").equalsIgnoreCase("remote"))
	 	{	
		DesiredCapabilities capabilities=new DesiredCapabilities();
		
		if(os.equalsIgnoreCase("windows"))
		{
			capabilities.setPlatform(Platform.WIN11);
		}
		else if(os.equalsIgnoreCase("mac"))
		{
			capabilities.setPlatform(Platform.MAC);
		}
		else
		{
			System.out.println("No matching os..");
			return;
		}
		//browser
		switch(br.toLowerCase())
		{
		case "chrome" : capabilities.setBrowserName("chrome"); break;
		case "edge" : capabilities.setBrowserName("MicrosoftEdge"); break;
		default: System.out.println("No matching browser.."); return;
		}
		driver = new RemoteWebDriver(new URL(" http://10.66.136.44:5555"), capabilities);
	    }
		
	
		else if(p.getProperty("execution_env").equalsIgnoreCase("local")) {
 
		switch(br.toLowerCase()) {
		case "chrome":driver=new ChromeDriver();
		break;
		case "edge":driver=new EdgeDriver();
		break;
		default: System.out.println("No Matching Browser....");
		 return;
		} 
		}
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.get(p.getProperty("appURL"));
		
	}
  
	@AfterTest
	public void teardown() {
		driver.quit();
	}
	
	
	//random String generate
	public String randomString() {
	String generateString=RandomStringUtils.randomAlphabetic(7);
	return generateString;
	}
	
	//random number generate
	public String randomNumber() {
		String generateNumber=RandomStringUtils.randomNumeric(10);
		return generateNumber;
	}
	
	
	//random alphanumeric generate
	public String randomAlphanumeric() {
		String str=RandomStringUtils.randomAlphabetic(7);
		String num=RandomStringUtils.randomNumeric(3);
		return (str+num);
	}
 
}