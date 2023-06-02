package com.PageObjectPkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BasePkg.BaseClass;

public class JeansPage extends BaseClass
{
	public JeansPage(WebDriver driver1)
	{
		driver=driver1;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//span[text()='SHOP MEN']") private WebElement shopMen;
	@FindBy(xpath="(//img[@class='wp100 hp100 brp50 an-ll o0 mA'])[16]") private WebElement jeans;
	@FindBy(xpath="((//div[@class='bs ls1 bgF _stt c0  fs14  ttU pR t6 lh28 z1 pb6 pt4 p08  wp100 oH toE wsN'])[7]") private WebElement trendAlert;
	@FindBy(xpath="//div[contains(text(),'blue cotton washed jeans')]") private WebElement wantedPant;
	@FindBy(xpath="//div[contains(text(),'ADD TO CART')]") private WebElement cartButton;
	
	public WebElement getShopMen()
	{
		return shopMen;
	}
	
	public WebElement getJeans() {
		return jeans;
	}
	public WebElement getTrendAlert() {
		return trendAlert;
	}
	public WebElement getWantedPant() {
		return wantedPant;
	}
	public WebElement getCartButton() {
		return cartButton;
	}

}
