package test;

import core.BaseTest;
import org.junit.Assert;
import org.junit.Test;
import pages.MenuPage;
import pages.SplashPage;

public class SplashTeste extends BaseTest {

    private MenuPage menu = new MenuPage();
    private SplashPage splash = new SplashPage();

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
