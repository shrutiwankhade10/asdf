package omg;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Fourthtest extends base {
	
	@Test(dataProvider="getdata")
	public void opi(String un,String pwd) throws IOException {
	
		System.out.println(un);
		System.out.println(pwd);
		
		
	}
	
	
	@DataProvider
	public Object[][] getdata() {
		Object [][] data=new Object[3][2];
		data[0][0]="hwedfh";
		data[0][1]="shruti";
		data[1][0]="lewkjfwkefj";
		data[1][1]="wankhade";
		data[2][0]="eodoej";
		data[2][1]="lpopo";
		
		return data;
		
	}

}
