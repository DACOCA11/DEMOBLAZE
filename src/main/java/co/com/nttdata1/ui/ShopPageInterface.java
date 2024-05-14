package co.com.nttdata1.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ShopPageInterface {

    public static final Target PRODUCT_1= Target.the("Product one").located(By.xpath("//div[@id='tbodyid']/div/div/div/h4/a"));
    public static final Target BTN_ADD_1= Target.the("Button Add").located(By.xpath("//div[@id='tbodyid']/div[2]/div/a"));
    public static final Target HOME= Target.the("Option Home").located(By.xpath("//div[@id='navbarExample']/ul/li/a"));
    public static final Target PRODUCT_2= Target.the("Product two").located(By.xpath("//div[@id='tbodyid']/div[2]/div/div/h4/a"));
    public static final Target BTN_ADD_2= Target.the("Button Add").located(By.xpath("//div[@id='tbodyid']/div[2]/div/a"));
    public static final Target BTN_CART= Target.the("Button Cart").located(By.xpath("//a[@id='cartur']"));
    public static final Target BTN_PLACE_ORDER= Target.the("Button Place Order").located(By.xpath("//a[@id='cartur']"));


}
