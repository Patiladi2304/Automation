package qsp;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadDataFromExcelForActitime {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		GenericMethods g=new GenericMethods();
		String URL = g.readDataFromPropertyFile("url");
		driver.get(URL);
		String un = g.readDataFromPropertyFile("username");
		driver.findElement(By.id("username")).sendKeys(un);
		String pw = g.readDataFromPropertyFile("password");
		driver.findElement(By.name("pwd")).sendKeys(pw);
		driver.findElement(By.xpath("//div[.='Login ']")).click()
		;
		driver.findElement(By.xpath("//div[.='Tasks']")).click();
		driver.findElement(By.xpath("//div[.='Add New']")).click();
		driver.findElement(By.xpath("//div[.='+ New Customer']")).click();
		String name = g.readDataFromExcel("Pavan", 4, 1);
		driver.findElement(By.xpath("(//input[@placeholder='Enter Customer Name'])[2]")).sendKeys(name);
	String desp = g.readDataFromExcel("Pavan", 4, 2);
		driver.findElement(By.xpath("//textarea[@placeholder='Enter Customer Description']")).sendKeys(desp);
		driver.findElement(By.xpath("//div[.='Create Customer']")).click();
		Thread.sleep(5000);
		driver.close();
	}

}
