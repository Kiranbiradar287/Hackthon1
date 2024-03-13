package testCases;


import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import pageObjects.Hotelbooking;
import testBase.BaseClass;

public class TC_03_Hotelbookingsection extends BaseClass{
	 List<String>li2=new ArrayList<String>();
	 TC_01_CabSelectsection cb= new TC_01_CabSelectsection();


	@Test (priority=15)

	 public void hotel1() throws InterruptedException {
		//logger
		 logger.info("*****HotelBooking section start*****");
		 Hotelbooking ht=new Hotelbooking(driver);
		 ht.hotelclick();
		 
		 //logger
		 logger.info("click on hotel menu");
	 }
	 @Test (priority=16)

	 public void roomadultClick1() {
		 Hotelbooking ht=new Hotelbooking(driver);
		 ht.roomadultClick();
		 
		 //logger
		 logger.info("click on room info");
	 }
	 @Test (priority=17)

	 public void adult1() {
		 Hotelbooking ht=new Hotelbooking(driver);
		 ht.adults1();
		 
		 //logger
		 logger.info("click on adult list");
	 }
	 @Test (priority=18)

	 public void adultlist1() {
		 Hotelbooking ht=new Hotelbooking(driver);
		 System.out.println("**************");
		 System.out.println("Adult list");
		 for(WebElement li1:ht.adultsList()) {
			li2.add(li1.getText());
		}
		 for(String li3:li2) {
       System.out.println(li3);
	 }
		 System.out.println("**************");
		
		 }
	 
	
	 }
	 
	

