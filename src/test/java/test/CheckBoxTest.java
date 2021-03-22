package test;

import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


import page.CheckAllCheckBox;
import util.BrowserFactory;

public class CheckBoxTest {
	WebDriver driver;
	
	@Test
	public void CheckAllCheckedBox() throws InterruptedException {
		driver = BrowserFactory.startBrowser();
		
		CheckAllCheckBox checkOnAllBox = PageFactory.initElements(driver,CheckAllCheckBox.class);
		checkOnAllBox.clickOnAllBox();
		Thread.sleep(2000);
		checkOnAllBox.clickOnAllBox();
		Thread.sleep(2000);
		checkOnAllBox.selectNAme();
        Thread.sleep(2000);
		checkOnAllBox.removeButton();
		Thread.sleep(2000);
		checkOnAllBox.clickOnAllBox();
		Thread.sleep(2000);
		checkOnAllBox.removeButton();
		
	}
	@After
	
	public void tearDown() {
		driver.close();
		driver.quit();
	}

}
