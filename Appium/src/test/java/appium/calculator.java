package appium;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class calculator {

	static AppiumDriver<MobileElement> driver;

	public static void main(String[] args) throws Exception {

		System.out.println("wow");
		openCalculator();

	}

	public static void openCalculator() throws Exception {
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("deviceName", "vivo 1907");
		cap.setCapability("udid", "GMSKU4YP5P5XUCRK");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "10");
		cap.setCapability("appPackage", "com.android.bbkcalculator");
		//cap.setCapability("appPackage", "tranquil.bs.hrms");

		//cap.setCapability("appActivity", "tranquil.bs.hrms.activity.SplashActivity");
		cap.setCapability("appActivity", "com.android.bbkcalculator.Calculator");

		URL url = new URL("http://127.0.0.1:4723/wd/hub");

		driver = new AppiumDriver<MobileElement>(url, cap);

		System.out.println("Started.....");
		
		MobileElement two = driver.findElementById("com.android.bbkcalculator:id/digit2");

		MobileElement three = driver.findElementById("com.android.bbkcalculator:id/digit3");
		
		MobileElement plus = driver.findElementById("com.android.bbkcalculator:id/plus");
		
		MobileElement equal = driver.findElementById("com.android.bbkcalculator:id/equal");
		
		two.click();
		plus.click();
		three.click();
		equal.click();
		
	System.out.println("Calculated");
		
		
		
		
		

	}

}
