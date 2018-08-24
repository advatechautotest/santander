package santander.regresion.test;

import org.testng.annotations.Test;
import santander.regresion.TestBase;

public class ZmianaZincydentuZadanie extends TestBase {
    @Test

    public void testZmianaZincydentuZadanie() throws Exception{


        app.logInEndUser();
        app.procesNoweZgloszenie();
        app.screenShot();
        app.getZgloszenie().Tytul();
        app.screenShot();
        app.saveButton();
        app.screenShot();
        app.getAkcja().DodajNotatke();
        app.screenShot();
        app.getZgloszenie().NotatkaTytul();
        app.screenShot();
        app.saveandcloseButton();
        app.screenShot();
        app.getAkcja().DodajZalacznik();
        app.screenShot();
        app.getZgloszenie().ZalacznikTytul();
        app.screenShot();
        app.getZgloszenie().ZalacznikPlik();
        app.screenShot();
        app.saveandcloseButton();
        app.screenShot();
        app.getAkcja().ZalozZgloszenie();
        app.screenShot();
        String url = app.zmianaSSnaWD();
        app.screenShot();
        app.logOut();
        app.screenShot();
        app.logIn1wszaLinia();
        app.screenShot();
        app.wprowadzPobranyUrl(url);
        app.screenShot();
        app.getAkcja().Przejmij();
        app.screenShot();
        app.getAkcja().Edytuj();
        app.screenShot();
        app.getZgloszenie().Opis();
        app.screenShot();
        app.saveandcloseButton();
        app.screenShot();
        app.getAkcja().PrzeksztalcwIncydent();
        app.screenShot();
        app.getKolekcja().Incydent();
        app.screenShot();
        //driver.findElement(By.xpath(".//*[@id='mainForm-IncidentKolBody']/tr/td[1]")).click();
        //driver.findElement(By.xpath("//tbody[contains(@class, 'listBodyRow pointerCursor listBodyRowActive']/tr/td[1]")).click();
        app.Czekaj();
        app.getKolekcja().PierwszyElementKolekcji();
        app.screenShot();
        app.getAkcja().DodajNotatke();
        app.screenShot();
        app.getIncydent().NotatkaRodzaj();
        app.screenShot();
        app.getIncydent().NotatkaRodzajPubliczna();
        app.screenShot();
        app.getIncydent().NotatkaTytul();
        app.screenShot();
        app.saveandcloseButton();
        app.screenShot();
        app.getAkcja().DodajZalacznik();
        app.screenShot();
        app.getIncydent().ZalacznikTytul();
        app.screenShot();
        app.getIncydent().ZalacznikPlik();
        app.screenShot();
        app.saveandcloseButton();
        app.screenShot();
        app.getAkcja().ZglosIncydent();
        app.screenShot();
        app.getAkcja().Przejmij();
        app.screenShot();

    }
}
