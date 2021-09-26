package org.Argos.RunnerClass;

import cucumber.api.CucumberOptions;
import cucumber.api.java.Before;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
      features =  "\\src\\test\\java\\org\\Argos\\FeaturFile\\CartCycle.feature"

)

public class RunnterClass {

}
