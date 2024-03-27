package tests;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.testng.annotations.BeforeClass;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import org.testng.annotations.AfterClass;

/***
 * 
 * @author alex_
 *
 */

public class Base {
	
	 AndroidDriver driver;
 
	 @BeforeClass
	  public void beforeClass() throws MalformedURLException {
		  
		  UiAutomator2Options options = new UiAutomator2Options();
		  options
		  		.setPlatformName("Android")
		  		.setPlatformVersion("11")
		  		.setAutomationName("UiAutomator2")
		  		.setDeviceName("emulator-5554")
		  		.setApp("C:\\AppiumDemo\\com.fivemobile.thescore_24.5.0-24050_minAPI24(arm64-v8a,armeabi-v7a,x86,x86_64)(nodpi)_apkmirror.com.apk")
		  		.setNoReset(false);
		  
		  driver = new AndroidDriver(new URL("http://127.0.0.1:4723/"), options);
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  }
	  
	  @AfterClass
	  public void tearDown() {
		  driver.quit();
	  }


}
