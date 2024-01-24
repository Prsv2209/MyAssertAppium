package test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.MalformedURLException;
import java.net.URL;


public class CalculadoraTest {

    @Test
    public void deveMultiplicarDoisValores() throws MalformedURLException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("platformName", "Android");
        desiredCapabilities.setCapability("deviceName", "emulator-5554");
        desiredCapabilities.setCapability("automationName", "uiautomator2");
        desiredCapabilities.setCapability("appPackage", "com.android.calculator2");
        desiredCapabilities.setCapability("appActivity", "com.android.calculator2.Calculator");

        AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), desiredCapabilities);

        MobileElement el6 = (MobileElement) driver.findElementById("com.android.calculator2:id/digit_2");
        el6.click();
        MobileElement el7 = (MobileElement) driver.findElementByAccessibilityId("multiply");
        el7.click();
        MobileElement el8 = (MobileElement) driver.findElementById("com.android.calculator2:id/digit_6");
        el8.click();
        MobileElement el9 = (MobileElement) driver.findElementByAccessibilityId("equals");
        el9.click();
        MobileElement el10 = (MobileElement) driver.findElementById("com.android.calculator2:id/result");
        //el9.click();
        Assert.assertEquals("12", el10.getText());
        System.out.println(el10.getText());

        driver.quit();
    }
}
