package test;

import core.baseTest;
import pages.alertasPage;
import pages.menuPage;
import org.junit.Before;
import org.junit.Test;


public class AlertasTest extends baseTest {
    private menuPage menu = new menuPage();
    private alertasPage alertas = new alertasPage();


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
