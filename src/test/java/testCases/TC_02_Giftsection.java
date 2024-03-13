package testCases;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import pageObjects.GiftPage;
import testBase.BaseClass;

public class TC_02_Giftsection extends BaseClass {

	
	 @Test (priority=10)
	 public void moreClick() {
		 GiftPage gf=new GiftPage(driver);
		 gf.moreC();
		 
		 //logger
		 logger.info("click on giftmenu");
	 }
	 @Test (priority=11)
	 public void giftSelect() throws InterruptedException {
		    GiftPage gf=new GiftPage(driver);	    
		    JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView();",gf.weddingGift());
			Thread.sleep(2000);
			gf.weddingGift().click();
			
			//logger
			 logger.info("click on wedding gift section");
	 }
	 @Test (priority=12)

	 public void deatils() {
		 GiftPage gf=new GiftPage(driver);
		 gf.senderDetail(randomString());
		 gf.mobileN(randomNumber());
		 gf.mailE(randomAlphanumeric());
		// System.out.println(gf.senderDetail(randomString()););
		 
		 //logger
		 logger.info("enter the user details");
	 }
	 @Test (priority=13)

	 public void Buynow() {
		 GiftPage gf=new GiftPage(driver);
		 gf.buyButton();
		 
		 //logger
		 logger.info("click on buy now button");
	 }
	 @Test (priority=14)

	 public void msg() {
		 GiftPage gf=new GiftPage(driver);
		 System.out.println("===================");
		 System.out.println(gf.errormsg1());
		 System.out.println("===================");
		 
		 //logger
		 logger.info("print the error msg");
	 }
}
