package co.com.qvision.conduit.pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class AlertPage extends PageObject {
    By MenuAlert = By.xpath("//div[@class='element-group']/span[@class='group-header']/div[@class='header-wrapper']/div[@class='header-text'][contains(text(), 'Alerts')]");
    By SubMenuAlert = By.xpath("//div[@class='element-group']//span[text()='Alerts']");
    By BTN_ALERT1 = By.xpath("//div/button[@id='alertButton']");
    By BTN_ALERT2 = By.id("timerAlertButton");
    By BTN_ALERT3 = By.id("confirmButton");

    By BTN_ALERT4 = By.id("promtButton");

    public By getBTN_ALERT4() {
        return BTN_ALERT4;
    }

    public void setBTN_ALERT4(By BTN_ALERT4) {
        this.BTN_ALERT4 = BTN_ALERT4;
    }

    public By getBTN_ALERT3() {
        return BTN_ALERT3;
    }

    public void setBTN_ALERT3(By BTN_ALERT3) {
        this.BTN_ALERT3 = BTN_ALERT3;
    }

    public By getBTN_ALERT2() {
        return BTN_ALERT2;
    }

    public void setBTN_ALERT2(By BTN_ALERT2) {
        this.BTN_ALERT2 = BTN_ALERT2;
    }

    public By getBTN_ALERT1() {
        return BTN_ALERT1;
    }

    public void setBTN_ALERT1(By BTN_ALERT1) {
        this.BTN_ALERT1 = BTN_ALERT1;
    }

    public By getMenuAlert() {
        return MenuAlert;
    }

    public void setMenuAlert(By menuAlert) {
        MenuAlert = menuAlert;
    }

    public By getSubMenuAlert() {
        return SubMenuAlert;
    }

    public void setSubMenuAlert(By subMenuAlert) {
        SubMenuAlert = subMenuAlert;
    }
}
