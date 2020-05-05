package biz.steps;

import biz.steps.serenity.lanchAppEndUserStep;
import cucumber.api.java.en.Given;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import net.thucydides.core.annotations.Steps;

public class launchAppDefStep {
	AppiumDriverLocalService service;
	
	@Steps
	lanchAppEndUserStep launchApp;
	
	@Given("launch app on device using appium")
	public void launch_app_on_device_using_appium() {
			}
	
}
