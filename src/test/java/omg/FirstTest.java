package omg;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class FirstTest extends base {
	
	@Test(enabled=false)
	public void screen() throws IOException{
		driver=startDriver();
		driver.get("https://www.google.com/");
		TakesScreenshot js=(TakesScreenshot)driver;
		File src=js.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src,new File("D:\\screenshot\\screensht.png"));
		driver.close();
		}
	
	@Test(groups= {"asdf"})
	public void win() throws IOException {
		driver=startDriver();
		driver.get("https://www.google.com/");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.close();
		
	}
	
	@Test(enabled=false)
	public void certi() throws IOException {
		driver=startDriver();
		DesiredCapabilities ch= DesiredCapabilities.chrome();
		ch.acceptInsecureCerts();
		ch.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		ch.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		
		ChromeOptions c=new ChromeOptions();
		c.merge(ch);
		WebDriver driver=new ChromeDriver(c);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		//String text="return document.getElementById("fromplace").value;";
		
		//String text=(String)js.executeScript(script)
		
		
	}
	
	
	@Test(enabled=false)
	public void guio() throws IOException {
		driver=startDriver();
		driver.get("http://demo.automationtesting.in/WebTable.html");
		int count=driver.findElements(By.cssSelector("div[class='ui-grid-cell-contents ng-binding ng-scope']")).size();
		for(int i=0;i<count;i++) {
			System.out.println(driver.findElements(By.cssSelector("div[class='ui-grid-cell-contents ng-binding ng-scope']")).get(i).getText());
		}
		driver.close();
		
	}
	@Test
	public void oil() throws IOException {
		int sum=0;
		driver=startDriver();
		
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/29054/eng-vs-wi-2nd-test-west-indies-tour-of-england-2020");
		int count=driver.findElements(By.cssSelector("div[class='cb-col cb-col-8 text-right text-bold']")).size();
		for(int i=1;i<6;i++) {
			String t=driver.findElements(By.cssSelector("div[class='cb-col cb-col-8 text-right text-bold']")).get(i).getText();
			System.out.println(t);
			int a=Integer.parseInt(t);
			sum=sum+a;
		}
		System.out.println(sum);
	}
	
	
	
	

}
