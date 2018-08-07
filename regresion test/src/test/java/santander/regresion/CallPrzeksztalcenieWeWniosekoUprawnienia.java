package santander.regresion;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class CallPrzeksztalcenieWeWniosekoUprawnienia extends  TestBase {
    @Test

    public void testCallPrzeksztalcenieWeWniosekoUprawnienia() throws Exception{

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
        logOut();
        screenShot();
        logInFL();
        screenShot();
        driver.get(url);
        screenShot();
        initTakeOver();
        screenShot();
        initEdit();
        screenShot();
        driver.findElement(By.id("mainForm-Description2_editor")).sendKeys("Opis zedytowany");
        screenShot();
        saveandcloseButton();
        screenShot();
        initTransIntoPermissionsApplication();
        screenShot();
    }

}
