package santander.regresion;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.io.File;

public class IncidentProcessDuplication10 extends TestBase {
    @Test

    public void testIncidentProcessDuplication10() throws Exception{

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
        initTransIntoIncident();
        screenShot();
        collIncydent();
        screenShot();
        //driver.findElement(By.xpath(".//*[@id='mainForm-IncidentKolBody']/tr/td[1]")).click();
        //driver.findElement(By.xpath("//tbody[contains(@class, 'listBodyRow pointerCursor listBodyRowActive']/tr/td[1]")).click();
        collSelect1stRecord();
        screenShot();
        initAddNote();
        screenShot();
        incydentNotatkaRodzaj();
        screenShot();
        incydentNotatkaRodzajPubliczna();
        screenShot();
        incydentNotatkaTresc();
        screenShot();
        saveandcloseButton();
        screenShot();
        initAddAttachment();
        screenShot();
        incydentZałącznikTytuł();
        screenShot();
        incydentZałącznikPlik();
        screenShot();
        saveandcloseButton();
        screenShot();
        zgłośIncydent();
        Thread.sleep(10000);


    }

    private void zgłośIncydent() {
        driver.findElement(By.xpath("//li[contains(text(), 'Zgłoś incydent')]")).click();
    }

    private void incydentZałącznikPlik() {
        File file = new File("regresion test/attach/santander.txt");
        if(!file.exists())throw new RuntimeException("file doesn't exist");
        else { driver.findElement(By.id("mainForm-AttachmentDocument2")).sendKeys(file.getAbsolutePath());}
    }

    private void incydentZałącznikTytuł() {
        driver.findElement(By.id("mainForm-Title2")).sendKeys("Tytuł załącznika");
    }

    private void incydentNotatkaTresc() {
        driver.findElement(By.id("mainForm-Text2_editor")).sendKeys("Testowa notatka");
    }

    private void incydentNotatkaRodzajPubliczna() {
        driver.findElement(By.xpath("//div[contains(text(), 'Notatka publiczna')]")).click();
    }

    private void incydentNotatkaRodzaj() {
        driver.findElement(By.id("mainForm-_RodzajnotatkiDisplay")).click();
    }

}
