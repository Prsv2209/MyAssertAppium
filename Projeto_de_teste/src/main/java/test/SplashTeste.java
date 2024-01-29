package test;

import core.baseTest;
import org.junit.Assert;
import org.junit.Test;
import pages.menuPage;
import pages.splashPage;

public class SplashTeste extends baseTest {

    private menuPage menu = new menuPage();
    private splashPage splash = new splashPage();

    @Test
    public void deveAguardarSlashSumir () {
        //Acessar o menu splash
        menu.acessarSplash();

        //Verficar que o splash foi exibido
        splash.validaMensagemDoSplash();

        //Aguardar a saída do splash
        splash.aguardarSplashSumir();

        //Verificar que o formulario está aparecendo
        Assert.assertTrue(splash.existElementWithText("Formulário"));
    }
}
