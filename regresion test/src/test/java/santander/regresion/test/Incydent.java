package santander.regresion.test;

import org.testng.annotations.Test;
import santander.regresion.TestBase;

public class Incydent extends TestBase {
    @Test

    public void testIncydent() throws Exception{

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
        app.getAkcja().Edytuj();
        app.screenShot();
        app.getIncydent().Opis();
        app.screenShot();
        app.saveandcloseButton();
        app.getAkcja().SkopiujProces();
        app.screenShot();
        app.getIncydent().SkopiujProcesListaProcesow();
        app.screenShot();
        app.getIncydent().SkopiujProcesListaProcesowIncydent();
        app.getIncydent().SkopiujProcesPrzyczyna();
        app.getIncydent().SkopiujProcesPrzyczynaInne();
        app.getIncydent().SkopiujProcesUzasadnienie();
        app.getIncydent().SkopiujProcesZamknacAutomatycznie();
        app.getIncydent().SkopiujProcesZamknacAutomatyczniePrawda();
        app.screenShot();
        app.saveandcloseButton();
        app.screenShot();
        app.getKolekcja().SkopiowaneIncydenty();
        app.Czekaj();
        app.getKolekcja().PierwszyElementKolekcji();
        app.screenShot();
        app.getAkcja().ZglosIncydent();
        app.screenShot();
        app.getAkcja().Przejmij();
        app.screenShot();
        app.getAkcja().DodajZalacznik();
        app.getIncydent().ZalacznikTytul();
        app.getIncydent().ZalacznikPlik();
        app.screenShot();
        app.saveandcloseButton();
        app.screenShot();
        app.getAkcja().ZarejstrujCzasPracy();
        app.getIncydent().CzasPracyUzupelnienie();
        app.screenShot();
        app.saveandcloseButton();
        app.screenShot();
        app.getAkcja().DodajPowiazanyCI();
        app.getIncydent().DodajCIWypelnienie();
        app.screenShot();
        app.saveandcloseButton();
        app.screenShot();
        app.getAkcja().PoprosoWyjasnienia();
        app.screenShot();
        app.getIncydent().PoprosoWyjasnieniaWypelnienie();
        app.screenShot();
        app.saveandcloseButton();
        app.zmianaWDnaSS();
        //app.getKolekcja().PobierzNumerWniosku();
        app.logOut();
        app.screenShot();
        app.logInEndUser();
        app.screenShot();
        app.wprowadzPobranyUrl(url);
        app.screenShot();
        app.getAkcja().DodajNotatke();
        app.getIncydent().NotatkaTytul();
        app.screenShot();
        app.saveandcloseButton();
        app.getAkcja().DodajZalacznik();
        app.getIncydent().ZalacznikTytul();
        app.getIncydent().ZalacznikPlik();
        app.screenShot();
        app.saveandcloseButton();
        app.getAkcja().WrocDoRealizacji();
        app.saveandcloseButton();
        app.screenShot();
        app.logOut();



    }
}
