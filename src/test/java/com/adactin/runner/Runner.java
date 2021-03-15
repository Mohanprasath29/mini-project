package com.adactin.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.adactin.helper.FileReaderManager;

import base_class.Base_Class;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src//test//java//com//adactin//features"
,glue="com.adactin.step_defenition"
,monochrome=false
,dryRun=false,
strict=true
,plugin = {"com.cucumber.listener.ExtentCucumberFormatter:Report/report1.html","junit:Report/junit_file.xml",
"rerun:target/rerun.text"}
)




//tags also an option can run specific tests
//it is given in step definition page wit annotations

public class Runner {

	public static WebDriver driver;

	@BeforeClass
	public static void Set_up() throws Throwable {


		String browser = FileReaderManager.getInstance().getInstanceCR().getBrowser();
		driver=Base_Class.getBrowser(browser);


	}


	@AfterClass
	public static void tear_Down() {
		driver.close();
	}
}
