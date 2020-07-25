package omg;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class ThirdTest extends base {
	
	@Test
	public void fgrtr() throws IOException {
		driver=startDriver();
		driver.get("https://www.spicejet.com/");
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();
		System.out.println(driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).isSelected());
		Assert.assertTrue(driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).isSelected());
		//Assert.assertEquals( driver.findElement(By.id("divpaxinfo")),"1 Adult");
		driver.close();
	
}
	@Parameters({"srt"})
	@Test
	public void flow(String un)
	{
	System.out.println("ohjsdah");
	System.out.println(un);
	
	}
	
	

}
