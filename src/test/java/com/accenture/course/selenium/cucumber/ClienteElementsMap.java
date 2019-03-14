package com.accenture.course.selenium.cucumber;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ClienteElementsMap {
	
	protected static WebDriver driver;
	protected WebElement element;
	
	//Link 
	@FindBy(how = How.ID, using = "nav_automobile")
	protected WebElement linkAutomobile;
	
	//Enter Vehicle Data
	protected WebElement make;
	protected WebElement engineperformance;
	protected WebElement dateofmanufacture;		
	protected WebElement numberofseats;
	protected WebElement fuel;
	protected WebElement listprice;
	protected WebElement licenseplatenumber;
	protected WebElement annualmileage;
	
	protected WebElement nextenterinsurantdata;

	
	//Enter Insurant Data
	protected WebElement firstname;
	protected WebElement lastname;
	protected WebElement birthdate;
	
	protected WebElement gendermale;
	protected WebElement streetaddress;
	protected WebElement country;
	protected WebElement zipcode;
	protected WebElement city;
	protected WebElement occupation;
	
	@FindBy(how = How.ID, using = "speeding")
	protected WebElement speeding;
	
	protected WebElement nextenterproductdata;
	
	//Enter Product Data
	protected WebElement startdate;
	protected WebElement insurancesum;
	protected WebElement meritrating;
	protected WebElement damageinsurance;
	protected WebElement EuroProtection;
	
	@FindBy(how = How.ID, using = "LegalDefenseInsurance")
	protected WebElement LegalDefenseInsurance;
	
	protected WebElement courtesycar;
	
	protected WebElement nextselectpriceoption;
	
	//Select Price Option 
	protected WebElement optionSilver;
	protected WebElement optionGold;
	protected WebElement optionPlatinum;
	protected WebElement optionUltimate;
	
	protected WebElement saveFormPriceOption;
	
	//Send Quote
	protected WebElement email;
	protected WebElement phone;
	protected WebElement username;
	protected WebElement password;
	protected WebElement confirmPassword;
	protected WebElement comments;
	
	protected WebElement sendForm;
}
