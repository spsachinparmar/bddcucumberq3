package Runnertest;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		
		features=".//Features/FormA.feature",
		glue="Stepdefinations",
		dryRun=false,
		monochrome = true,
		publish=true
		//tags="@Smoke"
		
		
		
		
		)

public class Runtest {

	
	
}
