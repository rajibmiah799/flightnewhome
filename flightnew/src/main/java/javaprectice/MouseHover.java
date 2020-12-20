package javaprectice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseHover {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		Actions a = new Actions(driver);

		WebElement from = driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
		WebElement to = driver.findElement(By.xpath("//span[contains(text(),'Your Hearts')]"));
		Thread.sleep(3000);
		a.moveToElement(from).moveToElement(to).click().build().perform();
		//driver.close();

	}

}
