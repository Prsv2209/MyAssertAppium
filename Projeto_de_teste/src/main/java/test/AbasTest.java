package test;

import core.BaseTest;
import org.junit.Test;
import pages.AbasPage;
import pages.AlertasPage;
import pages.MenuPage;

public class AbasTest extends BaseTest {
    private MenuPage menu = new MenuPage();
    private AbasPage aba = new AbasPage();

    @Test
    public void deveVisualizarAbas() {
        //Acessar o menu abas
        menu.acessarAbas();

        //Validar que está na aba 1
        aba.validarMensagemAba1();

        //Clicar na aba 2
        aba.clicarAba2();

        //Validar que está na aba 2
        aba.validarMensagemAba2();
    }



}
