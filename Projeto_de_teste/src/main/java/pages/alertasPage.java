package pages;

import core.BasePage;
import org.openqa.selenium.By;

public class alertasPage extends BasePage {

    public void clicarAlertaConfirm() {
        clickToText("ALERTA CONFIRM");
    }

    public void clicarAlertaSimples() {
        clickToText("ALERTA SIMPLES");
    }

    public void verificaTextoDoAlerta() {
    validateText(By.id("android:id/alertTitle"),"Info");
    validateText(By.id("android:id/message"),"Confirma a operação?");
    }

    public void verificaMensagemFinal() {
        validateText(By.id("android:id/alertTitle"),"Info");
        validateText(By.id("android:id/message"),"Confirmado");
    }

    public void confirmarAlerta() {
     clickToElement(By.id("android:id/button2"));
    }

    public void clicarBtnSair() {
        clickToElement(By.id("android:id/button1"));
    }



}
