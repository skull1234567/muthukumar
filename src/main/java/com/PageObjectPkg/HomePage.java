package com.PageObjectPkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BasePkg.BaseClass;

public class HomePage extends BaseClass
{
	public HomePage(WebDriver driver1)
	{
		driver=driver1;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//span[text()='SHOP MEN']") private WebElement shopMen;
	@FindBy(xpath="//div[@class='loaderCat viptshirtLdr dIb mA pA r0   h80 b4 l0 t0 ']") private WebElement tshirt;
	@FindBy(xpath="//div[contains(text(),'Step Out In Style')]") private WebElement stepOutInStyle;
	@FindBy(xpath="//img[@id='19698804']") private WebElement favouriteTshirt;	
	@FindBy(xpath="//div[text()='ADD TO CART']") private WebElement cartButton;
	
	public WebElement getShopMen() {
		return shopMen;
	}
	public WebElement getTshirt() {
		return tshirt;
	}
	public WebElement getStepOutInStyle() {
		return stepOutInStyle;
	}
	public WebElement getFavouriteTshirt() {
		return favouriteTshirt;
	}
	public WebElement getCartButton() {
		return cartButton;
	}



}
