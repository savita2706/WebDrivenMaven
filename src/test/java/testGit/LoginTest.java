package testGit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class LoginTest {
public static WebDriver driver;
@BeforeTest	
public void setup()
	{
	System.setProperty("webdriver.gecko.driver","D:\\New Selenium JAR\\Executables\\geckodriver.exe");
	
	driver=new FirefoxDriver();
	}
	@Test
	public void doLogin()
	{
		driver.get("http://www.gmail.com");
		driver.findElement(By.id("identifierId")).sendKeys("pg09raghav@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/div[2]")).click();
		
			WebDriverWait wait= new WebDriverWait(driver, 5);// Explicit Wait
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div[1]/div[1]/div/div/div/div/div[1]/div/div[1]/input"))).sendKeys("abcdef");
	}
	@AfterTest
	public void Close()
	{
		driver.quit();
	}

}



