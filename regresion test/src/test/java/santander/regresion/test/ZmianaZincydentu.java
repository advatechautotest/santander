package santander.regresion.test;

import org.testng.annotations.Test;
import santander.regresion.TestBase;

public class ZmianaZincydentu extends TestBase {
    @Test

    public void testZmianaZincydentu() throws Exception{

        app.set80();
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
        app.BiezacaGrupa1wszaLinia();
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
       //app.getKolekcja().PierwszyElementKolekcji();
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
        String Url = app.zmianaWDnaSS();
        app.getAkcja().PoprosoWyjasnienia();
        app.screenShot();
        app.getIncydent().PoprosoWyjasnieniaWypelnienie();
        app.screenShot();
        app.saveandcloseButton();
        app.zmianaWDnaSS();
        app.getKolekcja().PobierzNumerIncydentu();
        app.logOut();
        app.screenShot();
        app.logInEndUser();
        app.screenShot();
        app.wprowadzPobranyUrl(Url);
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
        app.logIn1wszaLinia();
        app.screenShot();
        app.przelaczDoWeb();
        app.BiezacaGrupa1wszaLinia();
        app.screenShot();
        app.getGrupa().Wyszukaj();
        app.getSkrot().Incydent();
        app.screenShot();
        app.getKolekcja().WstawNumerIncydentu();
        app.screenShot();
        app.getKolekcja().PierwszyElementKolekcji();
        app.screenShot();
        app.getAkcja().UtworzZmianeZincydentu();
        app.screenShot();
        app.getZmiana().typZmianyStandardowa();
        app.getZmiana().SzablonZmianyDRS_FIX_PILNY_Z3();
        app.screenShot();
        app.saveButton();
        app.screenShot();
        app.getAkcja().AnulujZmiane();
        app.getZmiana().KategoriaZamknieciaZmiany();
        app.screenShot();
        app.saveandcloseButton();
        app.screenShot();
        app.cancelButton();
        app.screenShot();
        app.getAkcja().UtworzZmianeZincydentu();
        app.screenShot();
        app.getZmiana().typZmianyStandardowa();
        app.getZmiana().SzablonZmianyDRS_FIX_PILNY_Z3();
        app.screenShot();
        app.saveButton();
        app.getKolekcja().ZmianaSzczegolyZmianyPrzyczynaZmiany();
        app.getZmiana().SzczegolyZmianyPrzyczynaZmianySzczegolyEdycja();
        app.screenShot();
        app.saveandcloseButton();
        app.getKolekcja().ZmianaSzczegolyZmianyWplywZmiany();
        app.getZmiana().SzczegolyZmianyWplywZmianySzczegolyEdycja();
        app.screenShot();
        app.saveandcloseButton();
        app.getKolekcja().ZmianaSzczegolyZmianySkutkiBrakuRealizacjiZmiany();
        app.getZmiana().SzczegolyZmianySkutkiBrakuRealizacjiZmianySzczegolyEdycja();
        app.screenShot();
        app.saveandcloseButton();
        app.getKolekcja().PobierzNumerZmiany();
        app.getAkcja().ZmianaPrzygotowana();
        app.screenShot();
        app.logOut();
        app.logInDRSZZIP();
        app.getGrupa().Wyszukaj();
        app.getSkrot().Zmiany();
        app.getKolekcja().WstawNumerZmiany();
        app.screenShot();
        app.getKolekcja().PierwszyElementKolekcji();
        app.screenShot();
        app.getAkcja().Przejmij();
        app.screenShot();
        app.logOut();
        app.logInDRSAdmin();
        app.screenShot();
        app.getGrupa().Wyszukaj();
        app.getSkrot().Zmiany();
        app.getKolekcja().WstawNumerZmiany();
        app.screenShot();
        app.getKolekcja().PierwszyElementKolekcji();
        app.screenShot();
        app.getKolekcja().ZadanieZmiany();
        app.screenShot();
        app.getAkcja().DodajNotatke();
        app.screenShot();
        app.getZmiana().NotatkaZadanieTytul();
        app.screenShot();
        app.saveandcloseButton();
        app.screenShot();
        app.getAkcja().DodajZalacznik();
        app.screenShot();
        app.getZmiana().ZalacznikZmianaZadanieTytul();
        app.getZmiana().ZalacznikZmianaZadaniePlik();
        app.screenShot();
        app.saveandcloseButton();
        app.getAkcja().Przyjmij();
        app.screenShot();
        app.getAkcja().DodajNotatke();
        app.screenShot();
        app.getZmiana().NotatkaZadanieTytul();
        app.screenShot();
        app.saveandcloseButton();
        app.screenShot();
        app.getAkcja().DodajZalacznik();
        app.screenShot();
        app.getZmiana().ZalacznikZmianaZadanieTytul();
        app.getZmiana().ZalacznikZmianaZadaniePlik();
        app.screenShot();
        app.saveandcloseButton();
        app.screenShot();
        app.getAkcja().Zamknij();
        app.screenShot();
        app.logOut();
        app.logInDRSZZIP();
        app.getGrupa().Wyszukaj();
        app.getSkrot().Zmiany();
        app.getKolekcja().WstawNumerZmiany();
        app.screenShot();
        app.getKolekcja().PierwszyElementKolekcji();
        app.screenShot();
        app.screenShot();
        app.getAkcja().DodecyzjiCAB();
        app.screenShot();
        app.logOut();
        app.logInAdminAplikacji();
        app.screenShot();
        app.BiezacaGrupaAdministratorzyAplikacji();
        app.screenShot();
        app.getGrupa().Wyszukaj();
        app.getSkrot().Zmiany();
        app.getKolekcja().WstawNumerZmiany();
        app.screenShot();
        app.getKolekcja().PierwszyElementKolekcji();
        app.screenShot();
        app.getKolekcja().ZadanieZmiany2();
        app.screenShot();
        app.getAkcja().Przyjmij();
        app.screenShot();
        app.getAkcja().Zatwierdz();
        app.screenShot();
        app.logOut();
        app.logInDRSw3();
        app.screenShot();
        app.getGrupa().Wyszukaj();
        app.getSkrot().Zmiany();
        app.getKolekcja().WstawNumerZmiany();
        app.screenShot();
        app.getKolekcja().PierwszyElementKolekcji();
        app.screenShot();
        app.getKolekcja().ZadanieZmiany3();
        app.screenShot();
        app.getAkcja().Przyjmij();
        app.screenShot();
        app.getAkcja().Zatwierdz();
        app.screenShot();
        app.logOut();
        app.logInAdminAplikacji();
        app.screenShot();
        app.BiezacaGrupaAdministratorzyAplikacji();
        app.screenShot();
        app.getGrupa().Wyszukaj();
        app.getSkrot().Zmiany();
        app.getKolekcja().WstawNumerZmiany();
        app.screenShot();
        app.getKolekcja().PierwszyElementKolekcji();
        app.screenShot();
        app.getKolekcja().ZadanieZmiany4();
        app.screenShot();
        app.getAkcja().Przyjmij();
        app.screenShot();
        app.getAkcja().Zamknij();
        app.screenShot();
        app.getZadanie().PowrotDoZmianyLink();
        app.getKolekcja().ZadanieZmiany5();
        app.screenShot();
        app.getAkcja().Przyjmij();
        app.screenShot();
        app.getAkcja().Zamknij();
        app.screenShot();
        app.getZadanie().PowrotDoZmianyLink();
        app.getKolekcja().ZadanieZmiany6();
        app.screenShot();
        app.getAkcja().Przyjmij();
        app.screenShot();
        app.getAkcja().Zamknij();
        app.screenShot();
        app.logOut();
        app.logInDRSZZIP();
        app.screenShot();
        app.getGrupa().Wyszukaj();
        app.getSkrot().Zmiany();
        app.getKolekcja().WstawNumerZmiany();
        app.screenShot();
        app.getKolekcja().PierwszyElementKolekcji();
        app.screenShot();
        app.getAkcja().DoWeryfikacji();
        app.screenShot();
        app.getAkcja().ZmianaPowiodlaSie();
        app.screenShot();
        app.getZmiana().ZmianaPowiodlaSieUzupelnij();
        app.screenShot();
        app.saveandcloseButton();
        app.screenShot();
    }
}
