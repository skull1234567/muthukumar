package com.BasePkg;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass 
{
	int a;
	int b;
	
	public static WebDriver driver;
	static Actions action;
	public static  WebDriver brwsrlnch()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		return driver;
		
	}
	
	public static void launchURL(String url)
	{
		driver.get(url);
	}
	
	public static void clickOnElement(WebElement element)
	{
		if(element.isDisplayed())
		{
			element.click();
		}
		else
		{
			System.out.println(element + "Element is Not Displaying");
		}
	}
	
	public static void inputValues(WebElement element, String input)
	{
		if(element.isDisplayed())
		{
			element.sendKeys(input);
		}
		else
		{
			System.out.println(element + "Element is Not Displaying");
			
		}
	}
	
	public static void clearValues(WebElement element)
	{
		element.clear();
	}
	
	public static void elementDisplayed(WebElement element)
	{
		element.isDisplayed();
	}
	
	public static void elementEnabled(WebElement element)
	{
		element.isEnabled();
	}
	
	public static void elementSelected(WebElement element)
	{
		element.isSelected();
	}
	
	public static void dropdownSelect(WebElement element, String option, String selectdata)
	{
		Select s = new Select(element);
		if(option.equalsIgnoreCase("index"))
		{
			int index=Integer.parseInt(selectdata);
			s.selectByIndex(index);
		}
		else if (option.equalsIgnoreCase("value"))
		{
			s.selectByValue(selectdata);
		}
		else if(option.equalsIgnoreCase("visible text"))
		{
			s.selectByVisibleText(selectdata);
		}
	}
	
	public static void getElementText(WebElement element, String getValue)
	{
		if(element.isDisplayed())
		{
			element.getText();
		}
		else
		{
			System.out.println(element + "Element is Not Displaying");
			
		}

	}
	
	public static void getPageTitle()
	{
		driver.getTitle();
	}
	
	public static void implicitWait()
	{
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	}
	
	public static void explicitWaitforVisibleElement(WebElement element)
	{
		WebDriverWait wait=new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	public static void expicitWait(WebElement element)
	{
		WebDriverWait wait=new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	
	public static void mousehover(WebElement element)
	{
		 action=new Actions(driver);
		 action.moveToElement(element).build().perform();
	}
	
	public static void mouseRightClick(WebElement element)
	{
		action=new Actions(driver);
		action.contextClick(element).build().perform();
			}
	
	public static void dragAndDrop(WebElement src, WebElement trgt)
	{
		action=new Actions(driver);
		action.dragAndDrop(src, trgt).build().perform();
	}
	
	public static void simpleAlert()
	{
		driver.switchTo().alert().accept();
	}
	
	public static void confirmAlert(String option)
	{
		if(option.equalsIgnoreCase("accept"))
		{
			driver.switchTo().alert().accept();
		}
		
		else if(option.equalsIgnoreCase("dismiss"))
		{
			driver.switchTo().alert().dismiss();
		}
	}
	
	public static void promptAlert(String input, String option)
	{
		Alert alert=driver.switchTo().alert();
		alert.sendKeys(input);
		
		if(option.equalsIgnoreCase("accept"))
		{
			alert.accept();
		}
		else if(option.equalsIgnoreCase("dismiss"))
		{
			alert.dismiss();
		}
	}
	
	public static void frameIndx(int indx)
	{
		driver.switchTo().frame(indx);
	}
	
	public static void frameID(String id)
	{
		driver.switchTo().frame(id);
	}
	
	public static void framename(WebElement element)
	{
		driver.switchTo().frame(element);
	}
	
	public static void jscriptScrollDown(int x, int y)
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy"+x+","+y);
	}
	
	public static void jscriptClickelement(String string, WebElement element)
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();",element);
		
	}
	
	public static void jscriptSendValue(WebElement element, String inputvalue)
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("document.getElementByXpath"+(element)+".value='+inputvalue+';");
		
	}
	
	public static void windowHandles(int index)
	{
		Set <String> windowsID = driver.getWindowHandles();
		List <String> windowsIDList = new ArrayList(windowsID);
		String windows = windowsIDList.get(index);
		driver.switchTo().window(windows);
		
	}
	
	public static void takeScreenshot(String name) throws IOException
	{
		TakesScreenshot ts = (TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("E:\\Muthukumar C\\Storage-D\\Java Code\\IPTWorkSpace\\MavenScnd"
				+ "\\Screenshots"+name+".png");
		FileUtils.copyFile(source, destination);
	}
	
	public static void browserClose()
	{
		driver.close();
	}


}
