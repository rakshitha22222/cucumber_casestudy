package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="Feature\\casestudy2.feature",glue= {"casestudy"},plugin= {"html:target/rr.html"})
public class casestudy_runner {

}
