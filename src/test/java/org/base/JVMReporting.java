package org.base;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JVMReporting {
	public static void generateJVMReport(String json) {
		File file = new File("C:\\Users\\Dell\\eclipse-workspace\\Cucumber\\target");
		Configuration configuration = new Configuration(file, "Adactin app");
		configuration.addClassifications("platform", "Win10");
		configuration.addClassifications("Browser", "Chrome");
		configuration.addClassifications("Version", "90.23.81");
		configuration.addClassifications("Environment", "QA");
		configuration.addClassifications("Sprint No", "13");
		List<String> li = new ArrayList<String>();
		li.add(json);
		ReportBuilder builder = new ReportBuilder(li, configuration);
		builder.generateReports();
	}
}

