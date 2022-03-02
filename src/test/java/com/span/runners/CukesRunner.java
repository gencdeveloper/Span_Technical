package com.span.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

//we are using for running cucumber framework therefore we will not code inside to CukesRunner
@RunWith(Cucumber.class)

//we are integrate to our cucumber features with this class
@CucumberOptions(
        plugin = {"json:target/cucumber.json",
                "html:target/default-html-reports",
                "rerun:target/rerun.txt"},
        features = "src/test/resources/features",
        //The glue is a part of Cucumber options that describes the location and path of the step definition file.
        //Provide the glue code for the english like scenario so that it finds something to execute.
        glue = "com/vytrack/step_definitions",
        dryRun = false,
        //Tags are a feature in cucumber that allows you to categorize tests.
        // That way you can organize your feature and scenarios better.
        tags = "@wip"
)
public class CukesRunner {

}
