package santander.regresion.test;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import santander.regresion.TestBase;

public class IncidentProcessDuplication10 extends TestBase {
    @Test

    public void testIncidentProcessDuplication10() throws Exception{

        app.logInED();
        app.initNewCall();
        app.screenShot();
        app.addCallThema();
        app.screenShot();
        app.saveButton();
        app.screenShot();
        app.initAddNote();
        app.screenShot();
        app.addContentNote();
        app.screenShot();
        app.saveandcloseButton();
        app.screenShot();
        app.initAddAttachment();
        app.screenShot();
        app.addAttachmentName();
        app.screenShot();
        app.addAttachment();
        app.screenShot();
        app.saveandcloseButton();
        app.screenShot();
        app.createNewCall();
        app.screenShot();
        String url = app.zmianaSSnaWD();
        app.screenShot();
        app.logOut();
        app.screenShot();
        app.logInFL();
        app.screenShot();
        app.wprowadzPobranyUrl(url);
        app.screenShot();
        app.initTakeOver();
        app.screenShot();
        app.initEdit();
        app.screenShot();
        app.zgłoszenieOpisEdycja();
        app.screenShot();
        app.saveandcloseButton();
        app.screenShot();
        app.initTransIntoIncident();
        app.screenShot();
        app.collIncydent();
        app.screenShot();
        //driver.findElement(By.xpath(".//*[@id='mainForm-IncidentKolBody']/tr/td[1]")).click();
        //driver.findElement(By.xpath("//tbody[contains(@class, 'listBodyRow pointerCursor listBodyRowActive']/tr/td[1]")).click();
        app.collSelect1stRecord();
        app.screenShot();
        app.initAddNote();
        app.screenShot();
        app.incydentNotatkaRodzaj();
        app.screenShot();
        app.incydentNotatkaRodzajPubliczna();
        app.screenShot();
        app.incydentNotatkaTresc();
        app.screenShot();
        app.saveandcloseButton();
        app.screenShot();
        app.initAddAttachment();
        app.screenShot();
        app.incydentZałącznikTytuł();
        app.screenShot();
        app.incydentZałącznikPlik();
        app.screenShot();
        app.saveandcloseButton();
        app.screenShot();
        app.zgłośIncydent();

        Thread.sleep(10000);


    }

}
