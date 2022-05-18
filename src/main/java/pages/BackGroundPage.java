package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class BackGroundPage {
    WebDriver driver;
    
    public BackGroundPage(WebDriver driver) {
		this.driver = driver;
	}
    
    @FindBy(how = How.XPATH, using = "//button[contains( text(), 'Set SkyBlue Background')]")
	WebElement SET_BLUE_BUTTON_ELEMENT;
    @FindBy(how = How.XPATH, using = "//button[contains( text(), 'Set White Background')]")
    WebElement SET_WHITE_BUTTON_ELEMENT;
 
    public void clickBlueButton() {
    	SET_BLUE_BUTTON_ELEMENT.click();
	}
    
    public void clickWhiteButton() {
    	SET_WHITE_BUTTON_ELEMENT.click();
	}
 
}
