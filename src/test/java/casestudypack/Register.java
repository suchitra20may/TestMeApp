package casestudypack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Register {
	public static WebDriver driver;
	
	@Given("^user open the TestMeApp$")
     public void useropenTestMeApp() {
		System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://10.232.237.143:443/TestMeApp");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
	}
	
	@When("^user click signup$")
    public void userclicksignup() {
		driver.findElement(By.xpath("//a[@href='RegisterUser.htm']")).click();
	}
	
	@And("^Enter username as \"([^\"]*)\"$")
	public void enterusername(String uname) {
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys(uname);
	}
	
	@And("^Enter firstname as \"([^\"]*)\"$")
	public void enterfirtname(String fname) {
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys(fname);
	}
	@And("^Enter lastname as \"([^\"]*)\"$")
	public void enterlastname(String lname) {
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys(lname);
	}
	
	@And("^Enter password as \"([^\"]*)\"$")
	public void password(String pwd) {
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(pwd);
	}
	
	@And("^Enter confirm password as \"([^\"]*)\"$")
	public void conformpassword(String cpwd) {
		driver.findElement(By.xpath("//input[@id='pass_confirmation']")).sendKeys(cpwd);
	}
	
	@And("^user select gender as \"([^\"]*)\"$")
	public void selectgender(String gender) {
		if(gender.equalsIgnoreCase("male")) {
		driver.findElement(By.xpath("//input[@value='Male']")).click();
		} else if(gender.equalsIgnoreCase("female")) {
			driver.findElement(By.xpath("//input[@value='Female']")).click();
		}
	} 
	

	@And("^Enter email as \"([^\"]*)\"$")
	public void email(String e) {
		driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys(e);
	
}
	
	@And("^Enter mobile as \"([^\"]*)\"$")
	public void mobile(String mob) {
		driver.findElement(By.xpath("//input[@name='mobileNumber']")).sendKeys(mob);
	}
	
	@And("^dob as \"([^\"]*)\"$")
	public void dob(String dob) {
		driver.findElement(By.xpath("//input[@name='dob']")).sendKeys(dob);
	}
	

	@And("^address as \"([^\"]*)\"$")
	public void address(String address) {
		driver.findElement(By.xpath("//textarea[@name='address']")).sendKeys(address);
	}
	

	@And("^user select security question as \"([^\"]*)\"$")
	public void securityquestion(String sques) {
		driver.findElement(By.xpath("//select[@name='securityQuestion']")).sendKeys(sques);
	}

	
	@And("^Enter answer as \"([^\"]*)\"$")
	public void eanswer(String ans) { 
		driver.findElement(By.xpath("//input[@name='answer']")).sendKeys(ans);
	}
	
	@Then("^user click  Register$")
	public void userclickregister() {
		driver.findElement(By.xpath("//input[@value='Register']")).click();
	}
	
}
