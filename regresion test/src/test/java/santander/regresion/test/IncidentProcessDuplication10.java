package santander.regresion.test;

import org.testng.annotations.Test;
import santander.regresion.TestBase;

public class IncidentProcessDuplication10 extends TestBase {
    @Test

    public void testIncidentProcessDuplication10() throws Exception{

        app.logInEndUser();
        app.procesNoweZgłoszenie();
        app.screenShot();
        app.getZgłoszenie().Tytul();
        app.screenShot();
        app.saveButton();
        app.screenShot();
        app.getAkcja().DodajNotatke();
        app.screenShot();
        app.getZgłoszenie().NotatkaTytul();
        app.screenShot();
        app.saveandcloseButton();
        app.screenShot();
        app.getAkcja().DodajZalacznik();
        app.screenShot();
        app.getZgłoszenie().ZalacznikTytul();
        app.screenShot();
        app.getZgłoszenie().ZalacznikPlik();
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
        app.getZgłoszenie().Opis();
        app.screenShot();
        app.saveandcloseButton();
        app.screenShot();
        app.getAkcja().PrzeksztalcwIncydent();
        app.screenShot();
        app.kolekcjaIncydent();
        app.screenShot();
        //driver.findElement(By.xpath(".//*[@id='mainForm-IncidentKolBody']/tr/td[1]")).click();
        //driver.findElement(By.xpath("//tbody[contains(@class, 'listBodyRow pointerCursor listBodyRowActive']/tr/td[1]")).click();
        app.kolekcjaPierwszyElementKolekcji();
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
        app.getAkcja().Edytuj();
        app.screenShot();
        app.getIncydent().Opis();
        app.screenShot();
        app.saveandcloseButton();
        app.getAkcja().SkopiujProces();
        app.screenShot();
        app.getIncydent().SkopiujProcesListaProcesow();
        app.screenShot();
        app.getIncydent().SkopiujProcesListaProcesowIncydentBezpieczenstwa();
        app.screenShot();
        app.getIncydent().SkopiujProcesPrzyczyna();
        app.screenShot();
        app.getIncydent().SkopiujProcesPrzyczynaInne();
        app.screenShot();
        app.getIncydent().SkopiujProcesUzasadnienie();
        app.screenShot();
        app.getIncydent().SkopiujProcesZamknacAutomatycznie();
        app.screenShot();
        app.getIncydent().SkopiujProcesZamknacAutomatycznieFalsz();
        app.screenShot();
        app.saveandcloseButton();
        app.screenShot();

        Thread.sleep(10000);


    }

}
