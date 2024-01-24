package test;

import core.BaseTest;
import org.junit.Test;
import pages.AbasPage;
import pages.AccordionPage;
import pages.MenuPage;

public class AccordionTest extends BaseTest {
    private MenuPage menu = new MenuPage();
    private AccordionPage accordion = new AccordionPage();

    @Test
    public void deveVisualizarTodosOsAccordions() {
        //Acessar o menu accordion
        menu.acessarAccordion();

        //Clicar na opção 1 e validar a mensagem da respectiva opção
        accordion.cliqueEvalidacaoOpcao1();

        //Clicar na opção 2 e validar a mensagem da respectiva opção
        accordion.cliqueEvalidacaoOpcao2();

        //Clicar na opção 3 e validar a mensagem da respectiva opção
        accordion.cliqueEvalidacaoOpcao3();

        //Clicar na opção 4 e validar a mensagem da respectiva opção
        accordion.cliqueEvalidacaoOpcao4();

        //Clicar na opção 5 e validar a mensagem da respectiva opção
        accordion.cliqueEvalidacaoOpcao5();

        //Clicar na opção 6 e validar a mensagem da respectiva opção
        accordion.cliqueEvalidacaoOpcao6();
    }



}
