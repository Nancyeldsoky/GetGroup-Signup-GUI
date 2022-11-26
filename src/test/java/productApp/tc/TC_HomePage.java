package productApp.tc;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import productApp.po.PO_HomePage;


public class TC_HomePage {
	
	@BeforeClass
	public void SetUP() {
		System.setProperty("webdriver.chrome.driver", "G:\\eclipse-workspace\\GetGroup\\getgroupautomationtask\\src\\main\\java\\resourses\\chromedriver.exe");
	}
	
	@Test
	public void t_01_validate_form() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://codenboxautomationlab.com/registration-form/");
		/*driver.manage().timeouts().implicitlyWait(200, TimeUnit.MILLISECONDS);*/
		driver.manage().window().maximize();
		
		PO_HomePage obj = PageFactory.initElements(driver, PO_HomePage.class);
		obj.SetFirstName("Nancy");
		obj.SetLastName("Eldsoky");
		obj.SetEmail("Nancyeldsoky66@gmail.com");
		obj.SetPhone("01096607299");
		obj.SetSelectCourse("selenium-automation");
		obj.SetMonth("december");
		obj.SetHearAboutUsCheck();
		obj.SetRegisterButton();		
		
		

	}

}
