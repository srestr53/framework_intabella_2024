package com.framework_intabella_2024.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "@target/rerun.txt",
        glue = "com/framework_intabella_2024/step_definitions"
)
public class FailedTestRunner {
}


