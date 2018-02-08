package fundtransfer.test;

import org.junit.runner.RunWith;
import cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@Cucumber.Options(format = {"pretty", "html:target/cucumber-htmlreport", "json-pretty:target/cucumber-report.json"})

//Cambié @Cucumber.Options por @CucumberOptions e importé cucumber.api.CucumberOptions.
//Y reemplacé format por plugin
//@CucumberOptions(plugin= {"pretty","html:target/cucumber-html-report","json-pretty:target/cucumber-report.json"})

//También cambié el formato de las declaraciones pero está deprecated:
/*format="pretty",
features= {"html:target/cucumber-html-report","json-pretty:target/cucumber-report.json"})*/

//Tampoco funciona: @CucumberOptions(features = {"classpath:cucumber", "json:target/cucumber-report.json"}, format = { "pretty","html:target/cucumber-htmlreport", "json:target/cucumber-report.json" })

public class RunCukesTest {

}
