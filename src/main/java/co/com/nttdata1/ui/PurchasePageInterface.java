package co.com.nttdata1.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PurchasePageInterface {

    public static final net.serenitybdd.screenplay.targets.Target INP_NAME= Target.the("Input name")
            .located(By.xpath ("//div[@id='orderModal']/div/div/div[2]/form/div/input"));

    public static final net.serenitybdd.screenplay.targets.Target INP_COUNTRY= Target.the("Input country")
            .located(By.xpath ("//div[@id='orderModal']/div/div/div[2]/form/div[2]/input"));

    public static final net.serenitybdd.screenplay.targets.Target INP_CITY= Target.the("Input city ")
            .located(By.xpath ("//div[@id='orderModal']/div/div/div[2]/form/div[3]/input"));

    public static final net.serenitybdd.screenplay.targets.Target INP_CREDIT= Target.the("Input creditcard")
            .located(By.xpath ("//div[@id='orderModal']/div/div/div[2]/form/div[4]/input"));

    public static final net.serenitybdd.screenplay.targets.Target INP_MONTH= Target.the("Input month")
            .located(By.xpath ("//div[@id='orderModal']/div/div/div[2]/form/div[5]/input"));

    public static final net.serenitybdd.screenplay.targets.Target INP_YEAR= Target.the("Input year")
            .located(By.xpath ("//div[@id='orderModal']/div/div/div[2]/form/div[6]/input"));

    public static final net.serenitybdd.screenplay.targets.Target BTN_PURCHASE= Target.the("Button Purchase")
            .located(By.xpath ("//div[@id='orderModal']/div/div/div[3]/button[2]"));



}
