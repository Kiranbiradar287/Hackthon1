package pageObjects;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Hotelbooking extends BasePage{
 
 public Hotelbooking(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
//locators
 @FindBy(xpath="//*[@class= 'menu_Hotels']")
 WebElement hotel;
 
 @FindBy(xpath="//*[@data-cy ='roomGuestCount']")
 WebElement roomadultclick;
 
 @FindBy(xpath="//div[@data-cy='GuestSelect$$_324']")
 List<WebElement> adults; 
 
 @FindBy(xpath="//li[@data-cy='GuestSelect$$_323']")
 List<WebElement> adultlist;
 
 
 //Actions
 public void hotelclick() throws InterruptedException {
	    JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();",hotel);
		Thread.sleep(10000);
		hotel.click();
 }
 public void roomadultClick() {
	 roomadultclick.click();
 }
 public void adults1() {
	 adults.get(1).click();
 }
 
 public List<WebElement> adultsList() {
 return adultlist;
 }
}
