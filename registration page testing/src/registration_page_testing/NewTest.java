package registration_page_testing;

import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;

public class NewTest {

public String base_url = "https://www.phptravels.net/register";
String driver_path = "chromedriver.exe";
public WebDriver driver;

WebElement first_name ;
WebElement last_name ;
WebElement mobile_number; 
WebElement email ;
WebElement password; 
WebElement confirm_password ;
WebElement sign_up_button ;


@BeforeTest
public void init_data() {
	
	System.setProperty("webdriver.chrome.driver","chromedriver.exe");
	driver = new ChromeDriver();
	// find input elements in the page 
	driver.get(base_url);
	first_name = driver.findElement(By.name("firstname"));
	last_name = driver.findElement(By.name("lastname"));
	mobile_number = driver.findElement(By.name("phone"));
	email = driver.findElement(By.name("email"));
	password = driver.findElement(By.name("password"));
	confirm_password = driver.findElement(By.name("confirmpassword"));
	sign_up_button = driver.findElement(By.xpath("/html/body/div[2]/div[1]/section/div/div/div/div/div/div[2]/div/div/div/form/div[9]/button"));		
}

@AfterMethod
private void close_window() {
	// TODO Auto-generated method stub
	driver.close();
}

  @Test (priority = 0)
 public void all_valid_data() throws InterruptedException {
	
	String expected_url = "https://www.phptravels.net/account/";
	// enter all data in it's valid form
	first_name.sendKeys("Test");
	last_name.sendKeys("Name");
	mobile_number.sendKeys("01234567890");
	email.sendKeys("valid_data@test.com");
	password.sendKeys("P@$$W0rd");
	confirm_password.sendKeys("P@$$W0rd");
	sign_up_button.click();
	TimeUnit.SECONDS.sleep(5);
	String actual_url = driver.getCurrentUrl();
	Assert.assertEquals(actual_url, expected_url);
  }

@Test (priority = 1)
public void frist_name() throws InterruptedException {
	init_data();
	first_name.sendKeys("mohamed");
	last_name.sendKeys("Adel");
	mobile_number.sendKeys("01234567890");
	email.sendKeys("firstname@test.com");
	password.sendKeys("P@$$W0rd");
	confirm_password.sendKeys("P@$$W0rd");
	sign_up_button.click();
	TimeUnit.SECONDS.sleep(5);
	String expected_title ="Register";
	String actual_title = driver.getTitle();
	Assert.assertEquals(actual_title, expected_title);
}

@Test (priority = 2)

private void last_name_1() throws InterruptedException {
	init_data();
	first_name.sendKeys("Firstname");
	last_name.sendKeys("lastname");
	mobile_number.sendKeys("01234567890");
	email.sendKeys("lastname@test.com");
	password.sendKeys("P@$$W0rd");
	confirm_password.sendKeys("P@$$W0rd");
	sign_up_button.click();
	TimeUnit.SECONDS.sleep(5);
	String actual_url = driver.getCurrentUrl();
	Assert.assertEquals(actual_url, base_url);
}

@Test (priority = 3)
private void last_name_2() throws InterruptedException {
	init_data();
	first_name.sendKeys("Test");
	last_name.sendKeys("Test");
	mobile_number.sendKeys("01234567890");
	email.sendKeys("lastname0@xyz.com");
	password.sendKeys("P@$$W0rd");
	confirm_password.sendKeys("P@$$W0rd");
	sign_up_button.click();
	TimeUnit.SECONDS.sleep(5);
	String actual_url = driver.getCurrentUrl();
	Assert.assertEquals(actual_url, base_url);
}

@Test (priority = 4)
public void check_email() throws InterruptedException {
	init_data(); 
	first_name.sendKeys("mohamed");
	last_name.sendKeys("adel");
	mobile_number.sendKeys("01234567890");
	email.sendKeys("email");
	password.sendKeys("P@$$W0rd");
	confirm_password.sendKeys("P@$$W0rd");
	sign_up_button.click();
	TimeUnit.SECONDS.sleep(5);
	String actual_url = driver.getCurrentUrl();
	Assert.assertEquals(actual_url, base_url);
  }

@Test (priority = 5)
public void check_password_1() throws InterruptedException {
	init_data();
	first_name.sendKeys("First");
	last_name.sendKeys("Second");
	mobile_number.sendKeys("01234567890");
	email.sendKeys("password@test.com");
	password.sendKeys("123456");
	confirm_password.sendKeys("123456");
	sign_up_button.click();
	TimeUnit.SECONDS.sleep(5);
	String actual_url = driver.getCurrentUrl();
	Assert.assertEquals(actual_url, base_url);
}

@Test (priority = 6)
public void check_password_2() throws InterruptedException {
	init_data();
	first_name.sendKeys("First");
	last_name.sendKeys("Second");
	mobile_number.sendKeys("01234567890");
	email.sendKeys("password2@test.com");
	password.sendKeys("password");
	confirm_password.sendKeys("password");
	sign_up_button.click();
	TimeUnit.SECONDS.sleep(5);
	String actual_url = driver.getCurrentUrl();
	Assert.assertEquals(actual_url, base_url);
}

@Test (priority = 7)
public void check_password_3() throws InterruptedException {
	init_data();
	first_name.sendKeys("First");
	last_name.sendKeys("Second");
	mobile_number.sendKeys("01234567890");
	email.sendKeys("password3@test.com");
	password.sendKeys("123456789");
	confirm_password.sendKeys("123456789");
	sign_up_button.click();
	TimeUnit.SECONDS.sleep(5);
	String actual_url = driver.getCurrentUrl();
	Assert.assertEquals(actual_url, base_url);
}

@Test
public void use_registered_email() throws InterruptedException {
	init_data();
	first_name.sendKeys("Test");
	last_name.sendKeys("Name");
	mobile_number.sendKeys("01234567890");
	email.sendKeys("valid_data@test.com");
	password.sendKeys("P@$$W0rd");
	confirm_password.sendKeys("P@$$W0rd");
	sign_up_button.click();
	TimeUnit.SECONDS.sleep(5);
	String actual_url = driver.getCurrentUrl();
	Assert.assertEquals(actual_url, base_url);
}

@AfterTest                            //Jumbled
public void terminateBrowser(){
    driver.close();
    driver.quit();
}

}
