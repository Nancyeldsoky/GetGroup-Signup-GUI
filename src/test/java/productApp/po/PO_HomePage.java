package productApp.po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class PO_HomePage {
	
	WebDriver driver;
	
	public PO_HomePage(WebDriver d) {
		this.driver = d ;
	}
	
	@FindBy(how = How.ID , using = "nf-field-17") 
	public WebElement firstname;
	
	@FindBy(how = How.ID , using = "nf-field-18") 
	public WebElement lastname;
	
	@FindBy(how = How.ID , using = "nf-field-19") 
	public WebElement email;

	@FindBy(how = How.ID , using = "nf-field-20") 
	public WebElement phone;
	
	@FindBy(how = How.ID , using = "nf-field-22") 
	public WebElement select_course;
	
	@FindBy(how = How.ID , using = "nf-field-24") 
	public WebElement select_month;
	
	@FindBy(how = How.ID , using = "nf-label-class-field-23-1") 
	public WebElement radioBtn;
	
	@FindBy(how = How.ID , using = "nf-field-15") 
	public WebElement registerBtn;
	
	public void SetFirstName(String arg) {
		firstname.sendKeys(arg);
	}
	
	public void SetLastName(String arg) {
		lastname.sendKeys(arg);
	}
	
	public void SetEmail(String arg) {
		email.sendKeys(arg);
	}
	
	public void SetPhone(String arg) {
		phone.sendKeys(arg);
	}

    public void SetSelectCourse(String arg) {
    	Select dropDown =new Select(select_course);
    	dropDown.selectByValue(arg);
    }
    
    public void SetMonth(String arg) {
    	Select dropDown =new Select(select_month);
    	dropDown.selectByValue(arg);
    }    
    
    public void SetHearAboutUsCheck() {
    	radioBtn.click();
    }
    
    public void SetRegisterButton() {
    	registerBtn.click();
    } 
}
