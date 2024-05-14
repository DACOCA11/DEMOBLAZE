package co.com.nttdata2.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/Shop.feature",
        glue= "co.com.nttdata2.glue",
        tags="successful"

)

public class RunTest
{
}
