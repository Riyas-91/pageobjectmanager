package com.BaseClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import com.po_manager.Page_Object_Manager;


public class Test_runner extends Base_Class {

	public static WebDriver driver = getBrowser("chrome");
	
	public static Page_Object_Manager pom = new Page_Object_Manager(driver);
	
	
	
	public static void main(String[] args) {
		
		url("https://adactinhotelapp.com/index.php");
		
		inputValueElement(pom.getInstanceHp().getUsername(), "Riyas1226");
		
		inputValueElement(pom.getInstanceHp().getPwd(), "Chelsea@1226");
		
		clickOnElement(pom.getInstanceHp().getClk());
		
		dropdown("index",pom.getInstanceP2().getLocation(), "8" );
		dropdown("value",pom.getInstanceP2().getHotel(), "Hotel Sunshine");
		dropdown("value",pom.getInstanceP2().getRoomtype(),"Super Deluxe");
		dropdown("index",pom.getInstanceP2().getRoomno(),"2");
		clearall(pom.getInstanceP2().getCheckin());
		inputValueElement(pom.getInstanceP2().getCheckin(), "12/12/2021");
		clearall(pom.getInstanceP2().getCheckout());
		inputValueElement(pom.getInstanceP2().getCheckout(), "14/12/2021");
		dropdown("index", pom.getInstanceP2().getAdults(), "2");
		dropdown("index", pom.getInstanceP2().getChilds(), "2");
		clickOnElement(pom.getInstanceP2().getSubmit());
		
		clickOnElement(pom.getInstanceP3().getRadio());
		clickOnElement(pom.getInstanceP3().getContin());
		
		inputValueElement(pom.getInstanceP4().getFirstname(),"Shahid");
		inputValueElement(pom.getInstanceP4().getLastname(), "Afaan");
		inputValueElement(pom.getInstanceP4().getAdd(), "Arasamaram Street");
		inputValueElement(pom.getInstanceP4().getAdd(), "\n");
		inputValueElement(pom.getInstanceP4().getAdd(), "Vembar Patty");
		inputValueElement(pom.getInstanceP4().getAdd(), "\n");
		inputValueElement(pom.getInstanceP4().getAdd(), "Dindigul");
		inputValueElement(pom.getInstanceP4().getAdd(), "\n");
		
		inputValueElement(pom.getInstanceP4().getCardno(), "8908987643273464");
		dropdown("value", pom.getInstanceP4().getCardtype(), "VISA");
		dropdown("index", pom.getInstanceP4().getExpirym(), "5");
		dropdown("value", pom.getInstanceP4().getExpiryy(), "2022");
		inputValueElement(pom.getInstanceP4().getCvv(), "890");
		
		clickOnElement(pom.getInstanceP4().getBooknow());
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		clickOnElement(pom.getInstanceP5().getMyitenary());
		
		
		
	}
}
