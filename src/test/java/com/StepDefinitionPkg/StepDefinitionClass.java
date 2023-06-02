package com.StepDefinitionPkg;

import com.BasePkg.BaseClass;
import com.BasePkg.PageObjectManager;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class StepDefinitionClass extends BaseClass

{
	
	PageObjectManager pm = new PageObjectManager(driver);

	@When("Launch the url {string}")
	public void launch_the_url(String string) 
	{
		launchURL(string);
		implicitWait();
	}
	
	@When("Click on Shop Men")
	public void click_on_shop_men() 
	{
		expicitWait(pm.getHp().getShopMen());
		clickOnElement(pm.getHp().getShopMen());
	}
	
	@Then("Click on Tshirt option")
	public void click_on_tshirt_option() 
	{
		clickOnElement(pm.getHp().getTshirt());
	}
	
	@Then("go to select particular tshirt department")
	public void go_to_select_particular_tshirt_department() 
	{
		jscriptScrollDown(100, 10);
		expicitWait(pm.getHp().getStepOutInStyle());
		clickOnElement(pm.getHp().getStepOutInStyle());
	}
	
	@Then("Select the product")
	public void select_the_product() 
	{
		jscriptScrollDown(100, 100);
		expicitWait(pm.getHp().getFavouriteTshirt());
		clickOnElement(pm.getHp().getFavouriteTshirt());
	}
	
	@Then("Click on Add to cart")
	public void click_on_add_to_cart() 
	{
		clickOnElement(pm.getHp().getCartButton());
	}
	
//	@Then("Close the browser")
//	public void close_the_browser() 
//	{
//	    browserClose();
//	}

	//jeans

	@When("Click on Men")
	public void click_on_men() 
	{
		clickOnElement(pm.getJp().getShopMen());
	}
	
	@Then("Click on jeans option")
	public void click_on_jeans_option() 
	{
		clickOnElement(pm.getJp().getJeans());
	}
	
	@Then("go to select particular jean department")
	public void go_to_select_particular_jean_department() 
	{
		clickOnElement(pm.getJp().getTrendAlert());
	}
	
	@Then("Select the pant")
	public void select_the_pant() 
	{
		clickOnElement(pm.getJp().getWantedPant());
	}
	
	@Then("Click on cart")
	public void click_on_cart() 
	{
		clickOnElement(pm.getJp().getCartButton());
	}



}

