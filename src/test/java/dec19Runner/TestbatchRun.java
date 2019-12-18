package dec19Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;




@RunWith(Cucumber .class)
@CucumberOptions(features="demodec1.feature",glue= {"StepDef13dec19"}
,tags= {"@credentials"},plugin= {"json:target\\cucumber.report.json"})

public class TestbatchRun {

}
