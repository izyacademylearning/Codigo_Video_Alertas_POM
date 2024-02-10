package co.com.qvision.conduit.steps;

import co.com.qvision.conduit.pages.AlertPage;
import co.com.qvision.conduit.pages.HomeDemoQa;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class AlertsStep {

    HomeDemoQa ObjHomeDemoQa = new HomeDemoQa();
    AlertPage OBJAlertpage = new AlertPage();

    @Step
    public void openBrowser() {
        ObjHomeDemoQa.open();

    }

    @Step
    public void deleteAdd() {


        WebElement elemento = ObjHomeDemoQa.getDriver().findElement(ObjHomeDemoQa.getOB_ADD());

        // Elimina el elemento
        JavascriptExecutor jsExecutor = (JavascriptExecutor) ObjHomeDemoQa.getDriver();
        jsExecutor.executeScript("var element = arguments[0]; element.parentNode.removeChild(element);", elemento);


    }

    @Step
    public void clickCardAlert() {
        // Busca el elemento "Alerts"
        WebElement cardAlert = ObjHomeDemoQa.getDriver().findElement(ObjHomeDemoQa.getCard_Alerts());

        // Obtiene el controlador de JavaScript
        JavascriptExecutor jsExecutor = (JavascriptExecutor) ObjHomeDemoQa.getDriver();

        // Realiza un scroll hasta el elemento
        jsExecutor.executeScript("arguments[0].scrollIntoView(true);", cardAlert);

        // Hace clic en el elemento
        cardAlert.click();
    }

    @Step
    public void goAlertSection() {
        // OBJAlertpage.getDriver().findElement(OBJAlertpage.getMenuAlert()).click();

        // Busca el elemento "Alerts"
        WebElement submenoAlert = OBJAlertpage.getDriver().findElement(OBJAlertpage.getSubMenuAlert());

        // Obtiene el controlador de JavaScript
        JavascriptExecutor jsExecutor = (JavascriptExecutor) ObjHomeDemoQa.getDriver();

        // Realiza un scroll hasta el elemento
        jsExecutor.executeScript("arguments[0].scrollIntoView(true);", submenoAlert);

        // Hace clic en el elemento
        submenoAlert.click();



    }

    @Step
    public void acceptPrimeraAlerta() {
        OBJAlertpage.getDriver().findElement(OBJAlertpage.getBTN_ALERT1()).click();

        OBJAlertpage.getDriver().switchTo().alert().accept();



    }

    @Step
    public void acceptSeguindaAlerta() {
        OBJAlertpage.getDriver().findElement(OBJAlertpage.getBTN_ALERT2()).click();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        OBJAlertpage.getDriver().switchTo().alert().accept();




    }
    @Step
    public void acceptTerceraAlerta() {
        OBJAlertpage.getDriver().findElement(OBJAlertpage.getBTN_ALERT3()).click();




    }
    @Step
    public void acceptCuataAlerta() {
        OBJAlertpage.getDriver().findElement(OBJAlertpage.getBTN_ALERT4()).click();
      /*  try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/



    }
}
