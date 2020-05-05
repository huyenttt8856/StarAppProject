import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import biz.common.AppiumServerController;

@RunWith(Cucumbepackage biz.acceptancetests;

imporWithSerenity.class)
@CucumberOptions(features="src/test/resources/features", glue="biz", tags="@test")
public class AcceptanceTestSuite {
	@BeforeClass
	public static void beforeScenario()
	{
		System.out.println("Before action scenario");
		AppiumServerController.startAppiumServer();
	}
	@AfterClass
	public static void afterScenario()
	{
		AppiumServerController.stopAppiumServer();
	}
	
}
