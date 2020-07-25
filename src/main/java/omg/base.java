package omg;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class base {
	public WebDriver driver;
	public Properties prop;
	
	
	public WebDriver startDriver() throws IOException {
		FileInputStream fis=new FileInputStream("D:\\selenium workspace\\Zeal\\src\\main\\java\\omg\\data.properties");
		prop=new Properties();
		prop.load(fis);
		String text=prop.getProperty("browser");
		
		if(text.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver","D://selenium-java-3.141.59//chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(text.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver","D://selenium-java-3.141.59//geckodriver.exe");
			driver=new FirefoxDriver();
			
		}
		else if(text.equals("ie")) {
			System.setProperty("webdriver.ie.driver","D://selenium-java-3.141.59//IEDriverServer.exe");
			driver=new InternetExplorerDriver();
		}
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		return driver;
		
	}

}
