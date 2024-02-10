package co.com.qvision.conduit.pages;


import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;


@DefaultUrl("https://demoqa.com/")
public class HomeDemoQa extends PageObject {

//    By BTN_SIGNIN = By.xpath("//a[text()=' Sign in ']");




    By OB_ADD = By.xpath("//div[@id='adplus-anchor']");

    By Card_Alerts = By.xpath("//div[@class='card-body']//h5[text()='Alerts, Frame & Windows']");

    public By getCard_Alerts() {
        return Card_Alerts;
    }

    public void setCard_Alerts(By card_Alerts) {
        Card_Alerts = card_Alerts;
    }

    public By getOB_ADD() {
        return OB_ADD;
    }
    public void setOB_ADD(By OB_ADD) {
        this.OB_ADD = OB_ADD;
    }

}
