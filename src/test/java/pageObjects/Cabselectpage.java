package pageObjects;
import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Cabselectpage extends BasePage {
 
 
 public Cabselectpage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

//locator
 @FindBy(xpath="//a[@id='webklipper-publisher-widget-container-notification-close-div']")
 WebElement popup;
 @FindBy(xpath="//*[@class = 'menu_Cabs']")
 WebElement carSelect;
 
 @FindBy(xpath="//*[contains(@for, 'fromCity')]/span")
 WebElement from;
 
 @FindBy(xpath="//*[@data-suggestion-index = '1']")
 WebElement city;
 
 @FindBy(xpath="//*[@title = 'To']")
 WebElement to;
 
 @FindBy(xpath="//span[contains (text(), 'Manali, Himachal Pradesh, India')]")
 WebElement tocity;
 
 @FindBy(xpath="//div[@aria-label='Wed Mar 20 2024']")
 WebElement date;
 
 @FindBy(xpath="//span[@class='applyBtnText']")
 WebElement apply;
 
 @FindBy(xpath="//a[@class='primaryBtn font24 latoBold widgetSearchBtn']")
 WebElement search;
 
 @FindBy(xpath="//label[normalize-space()='SUV']")
 WebElement suv;
 
 @FindBy(xpath="//span[@class='latoBlack font20 appendRight5']")
 List<WebElement> carname;
  
 
 @FindBy(xpath="//p[@class='font28 latoBlack blackText ']")
 List<WebElement> carprice;
 
 //Actions
 
 public WebElement popupC() {
	return popup;
 }
 
 public void carClick() throws InterruptedException {
	 Thread.sleep(3000);
	 carSelect.click();
 }
 
 public void fromClick() {
	 from.click();	 
 }
 
 
 public void fromcity() {
	 city.click();
 }
 
 
 public void toCitySelect(String mana){
	 to.sendKeys(mana);	 
 }
 
 public void tocitySelect() {
	 tocity.click();
 }
 
 public void dateSelect() {
	 date.click();
 }
 public void applyB() {
	 apply.click();
 }
 
 
 public void searchB() {
	 search.click();
 }
 
 public void suvSelcet() {
	 suv.click();
 }
 
 public List<WebElement> carNamep() {
	 return carname;
 }
 
 
 public List<WebElement> carpriceP() {
	 return carprice;
 }
 

}
