package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest {
  @Test
  public void validLogin() {
	  WebDriver driver = new ChromeDriver();
	  driver.get("http://the-internet.herokuapp.com/login");
	  driver.findElement(By.id("username")).sendKeys("tomsmith");
	  driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
	  driver.findElement(By.className("radius")).click();
	  boolean isDisp = driver.findElement(By.cssSelector("div.flash.success"))
			  .isDisplayed();
	  Assert.assertTrue(isDisp);
	    
  }
}
