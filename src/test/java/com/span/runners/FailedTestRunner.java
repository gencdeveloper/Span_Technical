package com.span.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


//for build cucumber Runners so we need @Runwith tags
@RunWith(Cucumber.class)
//we are declare to our plugin and implementing with @cucumberOptions
@CucumberOptions(
        plugin = {"html:target/failed-html-report"},
        features = "@target/rerun.txt",
        glue = "com/vytrack/step_definitions"
)

public class FailedTestRunner {
}
