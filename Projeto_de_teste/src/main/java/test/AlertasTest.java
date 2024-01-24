package test;

import core.BaseTest;
import org.junit.Before;
import org.junit.Test;
import pages.AlertasPage;
import pages.MenuPage;

public class AlertasTest extends BaseTest {
    private MenuPage menu = new MenuPage();
    private AlertasPage alertas = new AlertasPage();


    @Before public void acessarAlertas(){
        menu.acessarAlertas();
    }

    @Test public void deveConfirmarOAlerta () {
        //Clicar em alerta confirm
        alertas.clicarAlertaConfirm();

        //Verificar os textos
        alertas.verificaTextoDoAlerta();

        //Confirmar o alerta
        alertas.confirmarAlerta();

        //Verificar a mensagem
        alertas.verificaMensagemFinal();

        //sair
        alertas.clicarBtnSair();
    }

    @Test public void deveClicarForaDaCaixa() {
        alertas.clicarAlertaSimples();
        alertas.tap(100,100);
    }



}
