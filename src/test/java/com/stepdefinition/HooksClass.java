package com.stepdefinition;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.base.BaseClass;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;

/**
 * 
 * @author Deepan
 * @description Used to close the current window after each testcase
 *
 */
public class HooksClass extends BaseClass {
/**
 * @description Used to peform screenshot on failed scnario and quit the browser
 * @param scenario
 * @param EveryScenario
 */
//	@After()
//	public void screenshot(Scenario scenario, String EveryScenario) {
//
//		if (scenario.isFailed()) {
//			TakesScreenshot screenShot = ((TakesScreenshot) driver);
//			byte[] b = screenShot.getScreenshotAs(OutputType.BYTES);
//			scenario.attach(b, "image.png", EveryScenario);
//		}
//		closeCurrentWindow();
//	}
}
