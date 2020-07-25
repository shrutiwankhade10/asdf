package omg;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class SecondTest extends base {

	
	@Test(timeOut=3000)
	public void fgrt() throws IOException {
		driver=startDriver();
		driver.get("https://www.spicejet.com/");
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@text='Ahmedabad (AMD)']")).click();
		driver.findElement(By.xpath("//li[contains(@class,'city_selected')]//a[@text='Ajmer (KQH)'][contains(text(),'Ajmer (KQH)')]")).click();
		
		while(!driver.findElement(By.className("ui-datepicker-month")).getText().contains("September")) {
			driver.findElement(By.cssSelector("span[class='ui-icon ui-icon-circle-triangle-e']")).click();
		}
		int count=driver.findElements(By.className("ui-state-default")).size();
		System.out.println(count);
		for(int i=0;i<count;i++) {
			String text=driver.findElements(By.className("ui-state-default")).get(i).getText();
			if(text.equalsIgnoreCase("16")) {
				driver.findElements(By.className("ui-state-default")).get(i).click();
				
			}
		}
		driver.findElement(By.id("divpaxinfo")).click();
		driver.findElement(By.id("ctl00_mainContent_ddl_Adult")).click();
		driver.findElement(By.id("ctl00_mainContent_ddl_Adult")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.id("ctl00_mainContent_ddl_Adult")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.id("ctl00_mainContent_ddl_Adult")).sendKeys(Keys.ENTER);
		driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")).click();
		Select s=new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
		s.selectByIndex(2);
		driver.findElement(By.name("ctl00$mainContent$btn_FindFlights")).click();
		
		
		
		driver.close();
		}
	
	@Test
	public void boil() throws IOException {
		driver=startDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement table=driver.findElement(By.id("gf-BIG"));
		System.out.println(table.findElements(By.tagName("a")).size());
		WebElement column=table.findElement(By.xpath("//div[@id='gf-BIG']//td[1]"));
		System.out.println(column.findElements(By.tagName("a")).size());
		int count=column.findElements(By.tagName("a")).size();
		for(int i=0;i<count;i++) {
			String next=Keys.chord(Keys.CONTROL,Keys.ENTER);
			column.findElements(By.tagName("a")).get(i).sendKeys(next);
		}
		
		Set<String> b=driver.getWindowHandles();
		Iterator<String>it=b.iterator();
		while(it.hasNext()) {
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
		}
		driver.close();
		}
	
	@Test(groups= {"asdf"})
	public void huio() throws IOException {
		driver=startDriver();
		driver.get("https://jqueryui.com/");
		driver.findElement(By.xpath("//*[@id=\"sidebar\"]/aside[1]/ul/li[2]/a")).click();
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[class='demo-frame']")));
		WebElement source=driver.findElement(By.id("draggable"));
		WebElement target=driver.findElement(By.id("droppable"));
		Actions a=new Actions(driver);
		a.dragAndDrop(source, target).build().perform();
		driver.close();
		}
	
	@Test
	public void frt() throws IOException {
		driver=startDriver();
		driver.get("https://accounts.google.com/ServiceLogin/signinchooser?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		driver.findElement(By.xpath("//a[contains(text(),'Privacy')]")).click();
		Set<String> ab=driver.getWindowHandles();
		Iterator<String>it=ab.iterator();
		String parentid=it.next();
		String childid=it.next();
		driver.switchTo().window(parentid);
		System.out.println(driver.getTitle());
		driver.switchTo().window(childid);
		System.out.println(driver.getTitle());
		driver.close();
		}
	@Test
	public void fgtry() throws IOException {
		driver=startDriver();
		//driver.manage().timeouts().implicitlyWait(13, TimeUnit.SECONDS);
		//WebDriverWait w=new WebDriverWait(driver,15);
		//w.until(ExpectedConditions.visibilityOfElementLocated(By.id("jshdj")));
		driver.get("https://www.amazon.in/");
		Actions a=new Actions(driver);
		a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().sendKeys("shruti").doubleClick().build().perform();
		driver.close();
		
	}
	
	@Test
	public void ouil() throws IOException {
		driver=startDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("name")).click();
		driver.findElement(By.id("name")).sendKeys("shruti");
		driver.findElement(By.id("alertbtn")).click();
		driver.switchTo().alert().accept();
		
		driver.findElement(By.id("name")).click();
		driver.findElement(By.id("name")).sendKeys("shruti");
		driver.findElement(By.id("confirmbtn")).click();
		driver.switchTo().alert().dismiss();
		driver.close();
		
	}
	
}
