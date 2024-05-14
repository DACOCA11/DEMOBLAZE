package co.com.nttdata1.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class OpenWebSite implements Task {

    private final String url;


    public OpenWebSite(String url) {this.url = url; }

    public static Task loadPage(){
        String url="www.demoblaze.com/index.html";
        return instrumented(OpenWebSite.class,url);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Open.url(url));

    }
}
