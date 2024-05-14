package co.com.nttdata1.tasks;

import co.com.nttdata1.ui.ShopPageInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class AddproductPage implements Task {

    public static Task addProductsToCar(){return instrumented(AddproductPage.class);}


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(ShopPageInterface.PRODUCT_1, isVisible()).forNoMoreThan(20).seconds(),
                Click.on(ShopPageInterface.PRODUCT_1),

                        WaitUntil.the(ShopPageInterface.BTN_ADD_1, isVisible()).forNoMoreThan(20).seconds(),
                        Click.on(ShopPageInterface.BTN_ADD_1),

                WaitUntil.the(ShopPageInterface.HOME, isVisible()).forNoMoreThan(20).seconds(),
                Click.on(ShopPageInterface.HOME),
                WaitUntil.the(ShopPageInterface.PRODUCT_2, isVisible()).forNoMoreThan(20).seconds(),
                Click.on(ShopPageInterface.PRODUCT_2),
                WaitUntil.the(ShopPageInterface.BTN_ADD_2, isVisible()).forNoMoreThan(20).seconds(),
                Click.on(ShopPageInterface.BTN_ADD_2),
                WaitUntil.the(ShopPageInterface.BTN_CART, isVisible()).forNoMoreThan(20).seconds(),
                Click.on(ShopPageInterface.BTN_CART),

                WaitUntil.the(ShopPageInterface.BTN_PLACE_ORDER, isVisible()).forNoMoreThan(20).seconds(),
                Click.on(ShopPageInterface.BTN_PLACE_ORDER)

        );



    }
}
