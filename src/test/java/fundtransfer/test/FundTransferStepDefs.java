package fundtransfer.test;//The type org.openqa.selenium.remote.RemoteWebDriver cannot be resolved. It is indirectly referenced from required .class files -> Se resuelve añadiendo la dependencia de selenium-remote-driver

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

import cucumber.annotation.*;
import cucumber.annotation.en.*;

import static org.junit.Assert.assertEquals;

public class FundTransferStepDefs {
	protected WebDriver driver;
	
@Before
public void setUp() {
	System.setProperty("webdriver.chrome.driver", "C:\\WebDrivers\\chromedriver.exe");
	driver= new ChromeDriver();
}
@Given("the user is on Fund Transfer Page")
public void The_user_is_on_fund_transfer_page() {
	driver.get("http://cookbook.seleniumacademy.com/fundTransfer.html");
}
@When("he enters \"([^\"]*)\" as payee name")
public void He_enters_payeeName(String payeeName) {
	driver.findElement(By.id("payee")).sendKeys(payeeName);
}
@And("he enters as amount")
public void He_enters_amount(String amount) {
	driver.findElement(By.id("amount")).sendKeys(amount);
}
@And("he Submits request for Fund Transfer")
public void He_submits_request_for_fund_transfer() {
	driver.findElement(By.id("transfer")).click();
}
@Then("ensure the fund transfer is complete with \"([^\"]*)\" message")
public void Ensure_the_fund_transfer_is_complete(String msg) {
	WebElement message=driver.findElement(By.id("message"));
	assertEquals(message.getText(),msg);
}
@Then("ensure a transaction failure message \"([^\"]*)\" is displayed")
public void Ensure_a_transaction_failure_message(String msg) {
	WebElement message=driver.findElement(By.id("message"));
	assertEquals(message.getText(),msg);
}
@After
public void tearDown() {
	driver.close();
}

}
