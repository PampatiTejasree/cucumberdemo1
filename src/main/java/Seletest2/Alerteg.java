package Seletest2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Alerteg {
	static{
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\training_C2d.02.11\\chromedriv\\chromedriver.exe");
		}
 
  @Test
  public void f() {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.toolsqa.com/iframe-practice-page/");
	  //driver.switchTo.frame(e1);
	  WebElement e1=driver.findElement(By.linkText("Skip to content")); 
	// WebElement element=driver.findElement(By.xpath("//body/div/form/input"));
     // e1.click();
      //Alert al=driver.switchTo().alert();
     // al.getText();
    // al.accept();
     // al.dismiss();
  }
}
