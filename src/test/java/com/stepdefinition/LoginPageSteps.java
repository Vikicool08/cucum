package com.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginPageSteps {
	WebDriver driver;

	@Given("User is on the adactin page")
	public void user_is_on_the_adactin_page() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Dell\\eclipse-workspace\\Cucumber\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
	}

	@When("Login into the adactin hotel homepage using {string} and {string}")
	public void login_into_the_adactin_hotel_homepage_using_and(String userName, String password) {
		driver.findElement(By.id("username")).sendKeys(userName);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.id("login")).click();
	}

	@When("Search hotel by selecting {string},{string},{string} and search")
	public void search_hotel_by_selecting_and_search(String Location, String Hotels, String RoomType) {
		driver.findElement(By.id("location")).sendKeys(Location);
		driver.findElement(By.id("hotels")).sendKeys(Hotels);
		driver.findElement(By.id("room_type")).sendKeys(RoomType);
		driver.findElement(By.id("Submit")).click();
	}

	@Then("Select hotel using select")
	public void select_hotel_using_select() {
		driver.findElement(By.id("radiobutton_0")).click();
		driver.findElement(By.id("continue")).click();
	}

	@Then("Book the hotel using {string},{string},{string},{string},selectCreditCardType,{string},{string},{string}and Book Now")
	public void book_the_hotel_using_selectCreditCardType_and_Book_Now(String FirstName, String LastName,
			String BillingAddress, String CreditCardNo, String Month, String Year, String CVVNumber)
			throws InterruptedException {
		driver.findElement(By.id("first_name")).sendKeys(FirstName);
		driver.findElement(By.id("last_name")).sendKeys(LastName);
		driver.findElement(By.id("address")).sendKeys(BillingAddress);
		driver.findElement(By.id("cc_num")).sendKeys(CreditCardNo);
		WebElement btnType = driver.findElement(By.id("cc_type"));
		Select sel = new Select(btnType);
		sel.selectByVisibleText("VISA");
		driver.findElement(By.id("cc_exp_month")).sendKeys(Month);
		driver.findElement(By.id("cc_exp_year")).sendKeys(Year);
		driver.findElement(By.id("cc_cvv")).sendKeys(CVVNumber);
		driver.findElement(By.id("book_now")).click();
		Thread.sleep(9000);
		WebElement txtOrder = driver.findElement(By.id("order_no"));
		String attribute = txtOrder.getAttribute("value");
		System.out.println(attribute);
	}

	@Then("User should verify success message")
	public void user_should_verify_success_message() {
		driver.quit();
	}

}
