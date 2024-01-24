package pages;

import core.BasePage;
import org.openqa.selenium.By;

public class AccordionPage extends BasePage {

    public void cliqueEvalidacaoOpcao1 () {
        clickToText("Opção 1");
        validateText(By.xpath("//android.widget.TextView[@text='Esta é a descrição da opção 1']"),"Esta é a descrição da opção 1");

    }
    public void cliqueEvalidacaoOpcao2 () {
        clickToText("Opção 2");
        validateText(By.xpath("//android.widget.TextView[@text='Esta é a descrição da opção 2']"),"Esta é a descrição da opção 2");
    }

    public void cliqueEvalidacaoOpcao3 () {
        clickToText("Opção 3");
        validateText(By.xpath("//android.widget.TextView[@text='Esta é a descrição da opção 3. Que pode, inclusive ter mais que uma linha']"),"Esta é a descrição da opção 3. Que pode, inclusive ter mais que uma linha");
    }

    public void cliqueEvalidacaoOpcao4 () {
        clickToText("Opção 4");
        validateText(By.xpath("//android.widget.TextView[@text='Esta é a descrição da opção 4']"),"Esta é a descrição da opção 4");
    }

    public void cliqueEvalidacaoOpcao5 () {
        clickToText("Opção 5");
        validateText(By.xpath("//android.widget.TextView[@text='Esta é a descrição da opção 5']"),"Esta é a descrição da opção 5");
    }

    public void cliqueEvalidacaoOpcao6 () {
        clickToText("Opção 6");
        validateText(By.xpath("//android.widget.TextView[@text='Esta é a descrição da opção 6']"),"Esta é a descrição da opção 6");
    }

}
