package javaprectice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FBsign {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[@id='u_0_2']")).click();

		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement first = driver.findElement(By.name("firstname"));
		js.executeScript("arguments[0].value='MD'", first);
		
		WebElement male = driver.findElement(By.xpath("//input[@id='u_1_5']"));
		male.click();
		boolean m = male.isSelected();
		System.out.println(m);
		//driver.close();

	}

}
