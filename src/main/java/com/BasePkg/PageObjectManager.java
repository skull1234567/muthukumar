package com.BasePkg;

import org.openqa.selenium.WebDriver;

import com.PageObjectPkg.AccessoryPage;
import com.PageObjectPkg.HomePage;
import com.PageObjectPkg.JeansPage;

public class PageObjectManager
{
	
	public static WebDriver driver;
	
	public PageObjectManager(WebDriver driver) 
	{
		this.driver=driver;
	}
	
	public HomePage hp;
	public JeansPage jp;
	public AccessoryPage ap;

	/*public static WebDriver getDriver() {
		return driver;
	}*/


	public AccessoryPage getAp() {
		ap=new AccessoryPage(driver);
		return ap;
	}


	public JeansPage getJp() 
	{
		jp=new JeansPage(driver);
		return jp;
	}

	
	public HomePage getHp()
	{
		hp=new HomePage(driver);
		return hp;
	}



}
