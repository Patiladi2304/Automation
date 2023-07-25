package TestngScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TitleCompare {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	@Test
	public void titlecomapre() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		String expectedtitle = "Soogle";
		String actualTitle = driver.getTitle();
		SoftAssert s=new SoftAssert();
		s.assertEquals(actualTitle, expectedtitle);
		
		driver.close();
		s.assertAll();
		
		
		
	}

}
