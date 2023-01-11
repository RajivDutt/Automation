package Cucumber.feature.Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/java/Cucumber/feature"},glue = {"Cucumber/feature/Steps"})
public class PostRunner {
}
