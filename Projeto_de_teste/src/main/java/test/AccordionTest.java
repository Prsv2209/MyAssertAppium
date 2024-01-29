package test;

import core.baseTest;
import org.junit.Test;
import pages.accordionPage;
import pages.menuPage;

public class AccordionTest extends baseTest {
    private menuPage menu = new menuPage();
    private accordionPage accordion = new accordionPage();

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
