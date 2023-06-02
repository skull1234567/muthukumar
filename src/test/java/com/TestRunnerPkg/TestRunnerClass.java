package com.TestRunnerPkg;



import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.BasePkg.BaseClass;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features="E:\\Muthukumar C\\Storage-D\\Java Code\\IPTWorkSpace\\CucumberScnd\\src\\test\\java\\com\\FeaturePkg\\Lime.feature",
		glue="com.StepDefinitionPkg",
		monochrome=true,
		dryRun=false,
	 //   strict=true,
		tags=("@Tshirt or @Jeans"),
				plugin= {"pretty",
						"html:Report/limereport.html",
						"json:Reports/limereport.json",
						"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}

		)
				
									
public class TestRunnerClass  extends BaseClass
{

@BeforeClass
public static void setup()
{
brwsrlnch();
}
	

}
