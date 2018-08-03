package santander.regresion;

import org.openqa.selenium.By;

import org.testng.annotations.Test;



public class TakeOverCall extends TestBase {

    @Test
    public void testTakeOverCall() throws Exception{

        logInED();
        initNewCall();
        screenShot();
        addCallThema();
        screenShot();
        saveButton();
        screenShot();
        initAddNote();
        screenShot();
        addContentNote();
        screenShot();
        saveandcloseButton();
        screenShot();
        initAddAttachment();
        screenShot();
        addAttachmentName();
        screenShot();
        addAttachment();
        screenShot();
        saveandcloseButton();
        screenShot();
        createNewCall();
        screenShot();
        String url = driver.getCurrentUrl().replaceAll("/ss/", "/wd/");
        screenShot();
        driver.findElement(By.xpath("//div[contains(@title, 'Wyloguj')]")).click();
        screenShot();
        driver.findElement(By.id("Ecom_User_ID")).click();
        driver.findElement(By.id("Ecom_User_ID")).sendKeys("kbednarz@pl.aigcfg.net");
        driver.findElement(By.id("logonButton")).click();
        screenShot();
        driver.get(url);
        screenShot();
        driver.findElement(By.xpath("//li[contains(text(), 'Przejmij')]")).click();
        screenShot();
        driver.findElement(By.xpath("//li[contains(text(), 'Edytuj')]")).click();
        screenShot();
        driver.findElement(By.id("mainForm-Description2_editor")).sendKeys("Opis zedytowany");
        screenShot();
        saveandcloseButton();
        screenShot();
    }

}
