package santander.regresion.test;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import santander.regresion.TestBase;

public class IncidentProcessDuplication10 extends TestBase {
    @Test

    public void testIncidentProcessDuplication10() throws Exception{

        app.logInEndUser();
        app.procesNoweZgłoszenie();
        app.screenShot();
        app.zgłoszenieTytuł();
        app.screenShot();
        app.saveButton();
        app.screenShot();
        app.akcjaDodajNotatkę();
        app.screenShot();
        app.zgłoszenieNotatkaTytuł();
        app.screenShot();
        app.saveandcloseButton();
        app.screenShot();
        app.akcjaDodajZałącznik();
        app.screenShot();
        app.zgłoszenieZałącznikTytuł();
        app.screenShot();
        app.zgłoszenieZałącznikPlik();
        app.screenShot();
        app.saveandcloseButton();
        app.screenShot();
        app.akcjaZałóżZgłoszenie();
        app.screenShot();
        String url = app.zmianaSSnaWD();
        app.screenShot();
        app.logOut();
        app.screenShot();
        app.logIn1wszaLinia();
        app.screenShot();
        app.wprowadzPobranyUrl(url);
        app.screenShot();
        app.akcjaPrzejmij();
        app.screenShot();
        app.akcjaEdytuj();
        app.screenShot();
        app.zgłoszenieOpisEdycja();
        app.screenShot();
        app.saveandcloseButton();
        app.screenShot();
        app.akcjaPrzekształćwIncydent();
        app.screenShot();
        app.kolekcjaIncydent();
        app.screenShot();
        //driver.findElement(By.xpath(".//*[@id='mainForm-IncidentKolBody']/tr/td[1]")).click();
        //driver.findElement(By.xpath("//tbody[contains(@class, 'listBodyRow pointerCursor listBodyRowActive']/tr/td[1]")).click();
        app.kolekcjaPierwszyElementKolekcji();
        app.screenShot();
        app.akcjaDodajNotatkę();
        app.screenShot();
        app.incydentNotatkaRodzaj();
        app.screenShot();
        app.incydentNotatkaRodzajPubliczna();
        app.screenShot();
        app.incydentNotatkaTytuł();
        app.screenShot();
        app.saveandcloseButton();
        app.screenShot();
        app.akcjaDodajZałącznik();
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
