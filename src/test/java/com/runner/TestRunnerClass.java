package com.runner;

import org.base.JVMReporting;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources",glue= {"com.stepdefinition"},monochrome=true,snippets = SnippetType.CAMELCASE,
plugin= {"pretty","html:C:\\Users\\Dell\\eclipse-workspace\\Cucumber\\target",
		"json:C:\\Users\\Dell\\eclipse-workspace\\Cucumber\\target\\sample.json",
		"junit:C:\\Users\\Dell\\eclipse-workspace\\Cucumber\\target\\samplefb.xml","json:C:\\Users\\Dell\\eclipse-workspace\\Cucumber\\target\\adactin.json"})
public class TestRunnerClass {
	@AfterClass
	public static void afterExecution() {
		JVMReporting.generateJVMReport("C:\\Users\\Dell\\eclipse-workspace\\Cucumber\\target\\adactin.json");

	}
}
