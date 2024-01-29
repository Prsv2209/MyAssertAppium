package test;

import core.baseTest;
import org.junit.Test;
import pages.abasPage;
import pages.menuPage;

public class AbasTest extends baseTest {
    private menuPage menu = new menuPage();
    private abasPage aba = new abasPage();

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
