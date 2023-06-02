package com.PageObjectPkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BasePkg.BaseClass;

public class AccessoryPage extends BaseClass
{
	public AccessoryPage(WebDriver driver1)
	{
		driver=driver1;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//span[text()='SHOP MEN']") private WebElement men;
	@FindBy(xpath="//div[@class='loaderCat vipaccessoriesLdr dIb mA pA r0   h80 b4 l0 t0 ']") private WebElement accessory;
	@FindBy(xpath="//div[contains(text(),'New Releases To Grab')]") private WebElement newReleases;
	@FindBy(xpath="(//img[@class='dB h412 w310 mA pR prdI gtm-p an-ll o0'])[12]") private WebElement favouriteWatch;
	@FindBy(xpath="//div[contains(text(),'ADD TO CART')]") private WebElement cartButton;
	//@FindBy(xpath="") private WebElement accessory;
	

	public WebElement getMen() {
		return men;
	}
	public WebElement getAccessory() {
		return accessory;
	}
	public WebElement getNewReleases() {
		return newReleases;
	}
	public WebElement getFavouriteWatch() {
		return favouriteWatch;
	}
	public WebElement getCartButton() {
		return cartButton;
	}
}
