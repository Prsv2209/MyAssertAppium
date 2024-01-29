package pages;

import core.BasePage;
import org.openqa.selenium.By;

public class abasPage extends BasePage {
    public void clicarAba2 () {clickToText("Aba 2");}
    public void validarMensagemAba1 () {validateText(By.xpath("//android.widget.TextView[@text='Este é o conteúdo da Aba 1']"),"Este é o conteúdo da Aba 1");}
    public void validarMensagemAba2 () {validateText(By.xpath("//android.widget.TextView[@text='Este é o conteúdo da Aba 2']"),"Este é o conteúdo da Aba 2");}

}
