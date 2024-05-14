package co.com.nttdata2.glue;

import co.com.nttdata1.tasks.AddproductPage;
import co.com.nttdata1.tasks.OpenWebSite;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.GivenWhenThen.when;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class LoginGlue {

    private static final String ACTOR="user";

    @Before
    public void setTheStag (){
        OnStage.setTheStage(new OnlineCast());
    }

@Given("user abre el sitio web de pruebas")
public void login(String actor) {
    theActorCalled(actor).attemptsTo(OpenWebSite.loadPage());
}

        @When("selecciono un producto a comprar")
        public void selectproduct(){
            when(OnStage.theActorInTheSpotlight()).attemptsTo(
                    AddproductPage.addProductsToCar()
            );

    }

    @Then("agrego el producto al carrito del usuario")
    public void addproduct()
    {


    }
@And("visualizo el carrito")
    public void viewcar()
{


}
@When("^ingreso datos (.*) (.*) (.*) (.*) (.*) (.*)")
        public void form(String name, String country, String city, String creditCard, String month, String year, Performable PurchaseFormPage)
{
    theActorInTheSpotlight().attemptsTo(co.com.nttdata1.tasks.PurchaseFormPage.withData(name,country,city,creditCard,month,year));

}
@Then("veo formulario")
public void netx()
{}



}
