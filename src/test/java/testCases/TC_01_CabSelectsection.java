package testCases;

import java.io.IOException;
import org.testng.annotations.Test;
import pageObjects.Cabselectpage;
import testBase.BaseClass;
import utilities.Excel_Output;


public class TC_01_CabSelectsection extends BaseClass {
      String carN;
      String carP;
      @Test (priority=0)
      public void popupClick() throws InterruptedException {
    	  Cabselectpage hm=new Cabselectpage(driver);
    	  Thread.sleep(5000);
    	  try {driver.switchTo().frame("webklipper-publisher-widget-container-notification-frame");
    		  hm.popupC().click();
    		  }
    	  catch(Exception e) {
    		  
    	  }
      }
	@Test (priority=1)
	 public void carSelect1() throws InterruptedException {
		//logger
		logger.info(" ******Cab Selection test case satring********** ");
		
		 Cabselectpage hm=new Cabselectpage(driver);
		 hm.carClick();
		 
		 //logger
		 logger.info("click on cab");
	 }
	 
	 @Test (priority=2)
	 public void fromCity1() throws InterruptedException {
		 Cabselectpage hm=new Cabselectpage(driver);
		 hm.fromClick();
		 Thread.sleep(2000);
		 hm.fromcity();
		 
		 //logger
		 logger.info("select from city");
	 }
	 
	 @Test (priority=3)
	 public void tocity1() throws InterruptedException {
		 Cabselectpage hm=new Cabselectpage(driver);
		 hm.toCitySelect("Manali");
		 Thread.sleep(5000);
		 hm.tocitySelect();
		 
		 //logger
		 logger.info("select to city");
	 }
	 
	 @Test (priority=4)
	 public void dateClick() {
		 Cabselectpage hm=new Cabselectpage(driver);
		 hm.dateSelect();
		 
		 //logger
		 logger.info("select date");
	 }
	 
	 @Test (priority=5)
	 public void apply1() {
		 Cabselectpage hm=new Cabselectpage(driver);
		 hm.applyB();
	 }
	 
	 @Test (priority=6)
	 public void search1() {
		 Cabselectpage hm=new Cabselectpage(driver);
		 hm.searchB();
		 
		 //logger
		 logger.info("click on searchbutton");
	 }
	 @Test (priority=7)
	 public void suvSelect1() throws InterruptedException {
		 Cabselectpage hm=new Cabselectpage(driver);
		 hm.suvSelcet();
		 Thread.sleep(5000);
		 
		 //logger
		 logger.info("click on SUV type car");
	 }
	 @Test (priority=8)
	 public  void carDetails(){
		 Cabselectpage hm=new Cabselectpage(driver);
		 carN=hm.carNamep().get(0).getText();
		 System.out.println("Carname="+carN);
		 //logger
		 logger.info("print Carname");
	 }
	 
	 @Test (priority=9)
	 public  void carP1() throws IOException {
		Cabselectpage hm=new Cabselectpage(driver);
		String carP=hm.carpriceP().get(0).getText();
		System.out.println("Lowest Carprice="+ carP);
		
		 //logger
		 logger.info("print the lowest car price");
		
		 Excel_Output.Excel(carN,carP);
		//logger
		 logger.info("print the Carname and lowest car price in excel");
	 }
	 
}
