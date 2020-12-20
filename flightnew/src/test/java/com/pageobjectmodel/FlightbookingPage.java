package com.pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlightbookingPage {

	WebDriver driver;

	public FlightbookingPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//a[@class='uitk-tab-anchor'])[2]")
	WebElement flight;

	public void clickFlight() {
		flight.click();
	}

	@FindBy(xpath = "//span[contains(text(),'Roundtrip')]")
	WebElement RoundTrip;

	public void clickround() {
		RoundTrip.click();

	}

	@FindBy(xpath = "//a[@id='preferred-class-input-trigger']")
	WebElement Editclass;
	@FindBy(xpath = "(//a[@class='uitk-list-item'])[2]")
	WebElement Editeco;

	public void ecoClass() {
		Editclass.click();
		Editeco.click();

	}

	@FindBy(xpath = "(//button[@class='uitk-faux-input'])[1]")
	WebElement depAir;
		
	@FindBy(xpath = "(//div[@class='is-subText truncate'])[1]")
	WebElement airde;

	public void enterDepair() {
		depAir.sendKeys("jfk");	
		airde.click();

	}

	@FindBy(xpath = "(//button[@class='uitk-faux-input'])[2]")
	WebElement arriveAir;
	@FindBy(xpath = "//strong[contains(text(),'Dhaka (DAC - Shahjalal Int')]")
	WebElement airArrive;

	public void enterArrive() {
		arriveAir.sendKeys("dh");
		airArrive.click();
	}

	public void enterdepDate() throws InterruptedException {
		driver.findElement(By.xpath("//button[@id='d1-btn']")).click();
		while (true) {

			String month = "December 2020";

			String mon = driver.findElement(By.xpath(
					"//div[@class='uitk-flex uitk-flex-justify-content-space-between uitk-new-date-picker-menu-pagination-container']"))
					.getText();
			if (mon.contentEquals(month)) {
				break;
			} else {
				driver.findElement(By.xpath(
						"(//button[@class='uitk-button uitk-button-small uitk-flex-item uitk-button-paging'])[2]"))
						.click();
				Thread.sleep(1000);
			} // end if
			driver.findElement(By.xpath("(//button[@class='uitk-new-date-picker-day'])[8]")).click();
		} // end of while
	}// end method

}
