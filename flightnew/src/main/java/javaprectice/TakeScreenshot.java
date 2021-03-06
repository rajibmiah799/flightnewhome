package javaprectice;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class TakeScreenshot {

	public static void Screens(WebDriver driver, String ss) throws IOException {
		TakesScreenshot tkss = (TakesScreenshot)driver;// TakesScreenshot is selenium interface
		File fl = tkss.getScreenshotAs(OutputType.FILE);
		//File fl = tkss.getScreenshotAs(OutputType.FILE);
		// getScreenshrotAs is a TakesScreenshot method
		FileUtils.copyFile(fl, new File(ss+".png"));//
        //FileUtils.copyFile(fl, destFile);
	}

}
