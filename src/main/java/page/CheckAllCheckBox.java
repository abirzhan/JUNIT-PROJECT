package page;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
public class CheckAllCheckBox extends BasePage{
	WebDriver driver;

	public    CheckAllCheckBox (WebDriver driver) {
		this.driver = driver;
	}
	//Element library
	@FindBy(how = How.NAME, using = "allbox")
	 WebElement CHECKBOX_FIELD_LOCATOR;
	@FindBy(how=How.NAME, using="submit")
	WebElement REMOVE_FIELD_lOCATOR;
	@FindBy(how=How.NAME, using="todo[4]")
	WebElement Select_One_Name;

	




//Interactive methods
    public void clickOnAllBox() {
    	
    	CHECKBOX_FIELD_LOCATOR.click();
    	
    	}
    public void removeButton() {
    	REMOVE_FIELD_lOCATOR.click();
    	
    }
    public void selectNAme() {
    	
    	Select_One_Name.click();
    	
    }

    	
    }
   
   
    
    
   
    
    