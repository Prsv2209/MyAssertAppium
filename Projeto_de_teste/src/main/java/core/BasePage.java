package core;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import org.junit.Assert;
import org.openqa.selenium.By;

import java.util.List;

import static core.DriverFactory.getDriver;

public class BasePage {

    public void writeText(By by, String texto){
        getDriver().findElement(by).sendKeys(texto);
    }

    public String getText(By by){
        return getDriver().findElement(by).getText();
    }


    public void clickToElement(By by){
        getDriver().findElement(by).click();
    }

    public void clickToText(String texto){
        clickToElement(By.xpath("//*[@text='"+texto+"']"));
    }

    public void SelectCombo(By by, String valor){
        getDriver().findElement(by).click();
        clickToText(valor);
    }

    public void validateText(By by, String valor){
        String element = getText(by);
        Assert.assertEquals(valor, element);
    }

    public boolean existElementWithText (String text) {
        List<MobileElement> elements = getDriver().findElements(By.xpath("//*[@text='"+text+"']"));
        System.out.println(elements);
        return elements.size() > 0;
    }
    public void validateAttribute(By by, String attribute, String value){
        Assert.assertTrue(getDriver().findElement(by).getAttribute(attribute).equals(value));
    }

    public void tap (int x, int y) {
        new TouchAction<>(getDriver()).tap(PointOption.point(x, y)).perform();
    }



}
