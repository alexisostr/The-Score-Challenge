package tests;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.testng.Assert;

/***
 * 
 * @author alex_
 * 
 */

public class TheScoreTest extends Base {
	
	
  @Parameters({"name","email","password"})
  @Test(description= "The Score Test", enabled =true)
  public void theScoreTest01(String name, String email, String password){
	  
	  // Open Application and select "NHL Hockey"
	  driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.fivemobile.thescore:id/action_button_text']")).click();
	  driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.fivemobile.thescore:id/txt_name' and @text='NHL Hockey']")).click();
	  driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.fivemobile.thescore:id/action_button_text']")).click();
	
	  //*** Click "May be Later" link and select "Toronto Maple Leafs"
	  driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.fivemobile.thescore:id/btn_disallow']")).click();
	  driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"com.fivemobile.thescore:id/txt_name\" and @text=\"Toronto Maple Leafs\"]")).click();
	  driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.fivemobile.thescore:id/action_button_text']")).click();
	  driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"com.fivemobile.thescore:id/action_button_text\"]")).click();
	  
	  
	  //*** Select "Email Sign Up" and Populate all mandatory fields 
	  driver.findElement(AppiumBy.id("com.fivemobile.thescore:id/action_button_text")).click();
	  driver.findElement(AppiumBy.id("com.fivemobile.thescore:id/first_name_input_edittext")).sendKeys(name);
	  driver.findElement(AppiumBy.id("com.fivemobile.thescore:id/last_name_input_edittext")).sendKeys(name);
	  driver.findElement(AppiumBy.id("com.fivemobile.thescore:id/email_input_edittext")).sendKeys(email);
	  driver.findElement(AppiumBy.id("com.fivemobile.thescore:id/password_input_edittext")).sendKeys(password);
	  
	  //*** Go back
	  driver.navigate().back();	 
	  driver.navigate().back();	  
	  driver.navigate().back();	 
	  
	  //*** Verify NHL Hockey teams page ***
	  Assert.assertTrue(driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"com.fivemobile.thescore:id/txt_name\" and @text=\"Toronto Maple Leafs\"]")).isDisplayed());
	  driver.navigate().back();
	  
	  // *** Verify Favorite Leagues page
	  Assert.assertTrue(driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.fivemobile.thescore:id/txt_name' and @text='NHL Hockey']")).isDisplayed());
	  driver.navigate().back();
  }
  
 
}
