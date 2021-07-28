package CucumberOptions;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/features", // here we have to give path of particular feature to excecute or we cane excecute every feature
        glue = "stepDefinitions"       // here we have to give the stepdefinitions package name
)
public class testRunner {

}
