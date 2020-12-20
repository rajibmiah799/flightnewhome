package javaprectice;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.javaprectice.ScreenShort;

import io.github.bonigarcia.wdm.WebDriverManager;


public class ScrollDwon {

	

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Thread.sleep(3000);// 3 second
	    JavascriptExecutor js = (JavascriptExecutor)driver;
	    // down cast JavascriptExecutor
	    js.executeScript("window.scroll(0,600)");
	    Thread.sleep(2000);
	   
	    js.executeScript("window.scroll(0,-200)");
	    //ScreenShot.s
	    ScreenShort.Screens(driver, "raj");

	    driver.close();
	    
	}

}
