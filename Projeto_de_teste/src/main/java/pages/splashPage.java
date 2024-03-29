package pages;

import core.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

import static core.DriverFactory.getDriver;

public class splashPage extends BasePage {

    public void validaMensagemDoSplash () {
        existElementWithText("Splash!");
    }

    public void aguardarSplashSumir(){
        getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        WebDriverWait wait = new WebDriverWait(getDriver(), 10);
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@text='Splash!']")));
    }
}
