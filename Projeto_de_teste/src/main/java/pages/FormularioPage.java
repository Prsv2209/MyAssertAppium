package pages;

import core.BasePage;
import core.DriverFactory;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

public class FormularioPage extends BasePage {

    public void fillAndValidateTheName (String nome) {
        //Write the name
        writeText(MobileBy.AccessibilityId("nome"), nome);

        //Validate the name
        validateText(MobileBy.AccessibilityId("nome"),nome);
    }

    public void selectCombo (String option) {
        //Click on the combo and select the desired option
        SelectCombo(MobileBy.AccessibilityId("console"),option);

        //Validate the option desired
        validateText(By.xpath("//android.widget.Spinner/android.widget.TextView"),option);
    }

    public void selectCheckbox () {
        //Validate the attribute before to click
        validateAttribute(By.className("android.widget.CheckBox"),"checked", "false");

        //Action the click on element checkbox
        clickToElement(By.className("android.widget.CheckBox"));

        //Validate the attribute after clicked
        validateAttribute(By.className("android.widget.CheckBox"),"checked","true");
    }

    public void selectSwitch () {
        //Validate the attribute before to click
        validateAttribute(MobileBy.AccessibilityId("switch"),"checked", "true");

        //Action the click on element Switch
        clickToElement(MobileBy.AccessibilityId("switch"));

        //Validate the attribute after clicked
        validateAttribute(MobileBy.AccessibilityId("switch"),"checked", "false");
    }

    public void clickButtonSave () {
        clickToText("SALVAR");
    }

    public void clickButtonLongSave () {
        clickToText("SALVAR DEMORADO");

    }

    public void validationNameAfterSave (String name) {
        validateText(By.xpath("//android.widget.TextView[@index='12']"),name);
    }
    public void formValidations () {
        validateAttribute(By.className("android.widget.CheckBox"),"checked","true");
        validateAttribute(MobileBy.AccessibilityId("switch"),"checked", "false");
        validateText(By.xpath("//android.widget.Spinner/android.widget.TextView"),"PS4");
        validateText(By.xpath("//android.widget.TextView[@index='12']"),"Nome: Desafio do Appium");
        validateText(By.xpath("//android.widget.TextView[@index='13']"),"Console: ps4");
        validateText(By.xpath("//android.widget.TextView[@index='15']"),"Switch: Off");
        validateText(By.xpath("//android.widget.TextView[@index='16']"),"Checkbox: Marcado");
    }

    public void alterarData () {
        clickToText("01/01/2000");
        clickToElement(By.id("android:id/date_picker_header_year"));
        clickToText("1998");
        for (int month=0; month<8; month++) {
            clickToElement(By.id("android:id/next"));
        }
        clickToText("22");
        clickToText("OK");
        }

    public void alterarHora () {
        clickToText("12:00");
        clickToElement(By.xpath("//*[@content-desc='15']"));
        clickToElement(By.xpath("//*[@content-desc='30']"));
        clickToText("OK");
    }

    public void validarDataEhora() {
        clickToText("SALVAR");
        validateText(By.xpath("//android.widget.TextView[@index='17']"),"Data: 22/09/1998");
        validateText(By.xpath("//android.widget.TextView[@index='18']"),"Hora: 15:30");
    }

    }


