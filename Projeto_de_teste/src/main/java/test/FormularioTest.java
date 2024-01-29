package test;

import core.baseTest;
import org.junit.Before;
import org.junit.Test;
import pages.*;

public class FormularioTest extends baseTest {
    private menuPage menu = new menuPage();
    private formularioPage formulario = new formularioPage();

    @Before
    public void inicializarAppium() {
        menu.acessarFormulario();
    }

    @Test
    public void devePreencherOcampoTexto() {
        formulario.fillAndValidateTheName("Pedro HCL Gomes");
    }

    @Test
    public void deveSalvarDemorado() {

        formulario.fillAndValidateTheName("Pedro HCL Gomes");
        formulario.clickButtonLongSave();

        //esperar(3000); //Espera explicita: Este comando espera fixamente ao tempo determinado (3 segundos), podem o elemento estar presente na tela, ou não.

        /*
        WebDriverWait wait = new WebDriverWait(DriverFactory.getDriver(),10); Nesse comando estamos deixando claro por default a espera de qualquer elemento por até 10 segundos
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@text='Nome: Pedro HCL Gomes']"))); Nesse comando estamos deixando uma condição de que, se o elemento estiver visivel em tela, a condição de 10 segundos pode parar.
        */

        formulario.validationNameAfterSave("Nome: Pedro HCL Gomes");
    }

    @Test
    public void deveInteragirCombo() {
            formulario.selectCombo("Nintendo Switch");
        }

    @Test
    public void deveInteragirSwitchEcheckbox() {
            formulario.selectCheckbox();
            formulario.selectSwitch();
        }

    @Test
    public void desafioDoFormulario() {
        formulario.fillAndValidateTheName("Desafio do Appium");
        formulario.selectCombo("PS4");
        formulario.selectCheckbox();
        formulario.selectSwitch();
        formulario.clickButtonSave();
        formulario.formValidations();
    }

    @Test
    public void deveAlterarDataEhora() {
        formulario.alterarData();
        formulario.alterarHora();
        formulario.validarDataEhora();
    }

}
