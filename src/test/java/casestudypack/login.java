package casestudypack;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



public class login {

		public static WebDriver driver;
		
		@Given("^user open TestMeApp$")
	     public void useropenTestMeApp() {
			System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("http://10.232.237.143:443/TestMeApp");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		}
		
		@When("^user click signin$")
	    public void userclicksignin() {
			driver.findElement(By.xpath("//a[@href='login.htm']")).click();
		}
		
		@And("^user enter credentials as$")
		
		public void entercredentials(DataTable dt)
		{
		    List<String> cred = dt.asList(String.class);
			driver.findElement(By.name("userName")).sendKeys(cred.get(0));
			driver.findElement(By.name("password")).sendKeys(cred.get(1));
            //driver.findElement(By.name("Login")).click();
		}
		
		@Then("^click login$")
		public void clicklogin() {
			driver.findElement(By.xpath("//a[@type='submit']")).click();
		}
}
