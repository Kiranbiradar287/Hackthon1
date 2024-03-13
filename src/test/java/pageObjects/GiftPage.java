package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class GiftPage extends BasePage {
  
  public GiftPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

//locators
  @FindBy(xpath="//span[@class='arrow arrowDown']")
  WebElement more;
  
  //@FindBy(xpath="//span[normalize-space()='Gift Cards']")
  //WebElement giftcard;
  @FindBy(xpath="//a[@data-cy='submenu_Giftcards']")
  WebElement giftcard;
  
  
  @FindBy(xpath="(//img[@alt='giftcard'])[1]")   //h3[contains (text(), 'Wedding Gift Card')]
	 WebElement welcomegiftcard;
  
  @FindBy(xpath="//h2[@class='heading-text lato-black append-bottom20']")
  WebElement whatsapp;
  
  @FindBy(xpath="//input[@name='senderName']")
  WebElement sendername;
  
  @FindBy(xpath="//input[@name='senderMobileNo']")
  WebElement mobile;
  
  @FindBy(xpath="//input[@name='senderEmailId']")
  WebElement email;
  
  @FindBy(xpath="//button[normalize-space()='BUY NOW']")
  WebElement buynowbutton;
  
  @FindBy(xpath="//p[@class='red-text font11 append-top5']")
  WebElement errormsg;
  
  
  //Actions
  
  public void moreC() {
	  Actions ac = new Actions(driver);
	  ac.moveToElement(more).build().perform();
	  giftcard.click();
  }
  public WebElement weddingGift(){
	  return welcomegiftcard;
  }
  public void senderDetail(String name) {
	  JavascriptExecutor js = (JavascriptExecutor)driver;
	  js.executeScript("arguments[0].scrollIntoView();",whatsapp);
	  sendername.sendKeys(name);
  }
  
  public void mobileN(String number) {
	  mobile.sendKeys(number);
  }
  public void mailE(String mail1) {
	  email.sendKeys(mail1);
  }
  public void buyButton() {
	  buynowbutton.click();
  }
  
  public String errormsg1() {
	 return  errormsg.getText();
  }
  
  
}
