package santander.regresion.test;

import org.testng.annotations.Test;
import santander.regresion.TestBase;

public class IncidentProcessDuplication10 extends TestBase {
    @Test

    public void testIncidentProcessDuplication10() throws Exception{

        app.logInEndUser();
        app.procesNoweZgłoszenie();
        app.screenShot();
        app.getZgłoszenie().zgłoszenieTytuł();
        app.screenShot();
        app.saveButton();
        app.screenShot();
        app.getAkcja().akcjaDodajNotatkę();
        app.screenShot();
        app.getZgłoszenie().zgłoszenieNotatkaTytuł();
        app.screenShot();
        app.saveandcloseButton();
        app.screenShot();
        app.getAkcja().akcjaDodajZałącznik();
        app.screenShot();
        app.getZgłoszenie().zgłoszenieZałącznikTytuł();
        app.screenShot();
        app.getZgłoszenie().zgłoszenieZałącznikPlik();
        app.screenShot();
        app.saveandcloseButton();
        app.screenShot();
        app.getAkcja().akcjaZałóżZgłoszenie();
        app.screenShot();
        String url = app.zmianaSSnaWD();
        app.screenShot();
        app.logOut();
        app.screenShot();
        app.logIn1wszaLinia();
        app.screenShot();
        app.wprowadzPobranyUrl(url);
        app.screenShot();
        app.getAkcja().akcjaPrzejmij();
        app.screenShot();
        app.getAkcja().akcjaEdytuj();
        app.screenShot();
        app.getZgłoszenie().zgłoszenieOpisEdycja();
        app.screenShot();
        app.saveandcloseButton();
        app.screenShot();
        app.getAkcja().akcjaPrzekształćwIncydent();
        app.screenShot();
        app.kolekcjaIncydent();
        app.screenShot();
        //driver.findElement(By.xpath(".//*[@id='mainForm-IncidentKolBody']/tr/td[1]")).click();
        //driver.findElement(By.xpath("//tbody[contains(@class, 'listBodyRow pointerCursor listBodyRowActive']/tr/td[1]")).click();
        app.kolekcjaPierwszyElementKolekcji();
        app.screenShot();
        app.getAkcja().akcjaDodajNotatkę();
        app.screenShot();
        app.getIncydent().incydentNotatkaRodzaj();
        app.screenShot();
        app.getIncydent().incydentNotatkaRodzajPubliczna();
        app.screenShot();
        app.getIncydent().incydentNotatkaTytuł();
        app.screenShot();
        app.saveandcloseButton();
        app.screenShot();
        app.getAkcja().akcjaDodajZałącznik();
        app.screenShot();
        app.getIncydent().incydentZałącznikTytuł();
        app.screenShot();
        app.getIncydent().incydentZałącznikPlik();
        app.screenShot();
        app.saveandcloseButton();
        app.screenShot();
        app.getAkcja().akcjaZgłośIncydent();


        Thread.sleep(10000);


    }

}
