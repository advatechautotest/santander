package santander.regresion.test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import santander.regresion.TestBase;

public class ZmianaNowa extends TestBase {
    @Test
    public void testNowaZmiana() throws Exception{


        //app.set60();
        app.logIn1wszaLinia();
        app.screenShot();
        app.BiezacaGrupa1wszaLinia();
        app.screenShot();
        app.getGrupa().Nowy();
        app.screenShot();
        app.getSkrot().ZmianaStandardowa();
        app.screenShot();
        app.getZmiana().SzablonZmianyDRS_FIX_PILNY_Z3();
        app.screenShot();
        app.saveButton();
        app.screenShot();
        app.getKolekcja().ZmianaSzczegolyZmianyPrzyczynaZmiany();
        app.screenShot();
        app.getZmiana().SzczegolyZmianyPrzyczynaZmianySzczegolyEdycja();
        app.screenShot();
        app.saveandcloseButton();
        app.screenShot();
        app.getKolekcja().ZmianaSzczegolyZmianyWplywZmiany();
        app.screenShot();
        app.getZmiana().SzczegolyZmianyWplywZmianySzczegolyEdycja();
        app.screenShot();
        app.saveandcloseButton();
        app.screenShot();
        app.getKolekcja().ZmianaSzczegolyZmianySkutkiBrakuRealizacjiZmiany();
        app.screenShot();
        app.getZmiana().SzczegolyZmianySkutkiBrakuRealizacjiZmianySzczegolyEdycja();
        app.screenShot();
        app.saveandcloseButton();
        app.screenShot();
        app.getKolekcja().PobierzNumerZmiany();
        app.getAkcja().ZmianaPrzygotowana();
        app.screenShot();
        app.logOut();
        app.screenShot();
        app.logInDRSZZIP();
        app.screenShot();
        app.getGrupa().Wyszukaj();
        app.screenShot();
        app.getSkrot().Zmiany();
        app.screenShot();
        app.getKolekcja().WstawNumerZmiany();
        app.screenShot();
        app.getKolekcja().PierwszyElementKolekcji();
        app.getAkcja().Przejmij();
        app.screenShot();
        app.logOut();
        app.screenShot();
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
        app.screenShot();
        app.logInDRSZZIP();
        app.screenShot();
        app.getGrupa().Wyszukaj();
        app.screenShot();
        app.getSkrot().Zmiany();
        app.screenShot();
        app.getKolekcja().WstawNumerZmiany();
        app.screenShot();
        app.getKolekcja().PierwszyElementKolekcji();
        app.screenShot();
        app.getAkcja().DodecyzjiCAB();
        app.screenShot();
        app.logOut();
        app.screenShot();
        app.logInAdminAplikacji();
        app.screenShot();
        app.BiezacaGrupaAdministratorzyAplikacji();
        app.screenShot();
        app.getGrupa().Wyszukaj();
        app.screenShot();
        app.getSkrot().Zmiany();
        app.screenShot();
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

        app.screenShot();
        app.logInDRSw3();
        app.screenShot();
        app.getGrupa().Wyszukaj();
        app.screenShot();
        app.getSkrot().Zmiany();
        app.screenShot();
        app.getKolekcja().WstawNumerZmiany();
        app.screenShot();
        app.getKolekcja().PierwszyElementKolekcji();
        app.screenShot();
        app.getKolekcja().ZadanieZmiany3();
        app.screenShot();
        app.getAkcja().Przyjmij();
        app.screenShot();
        app.getAkcja().ZwrocDoModyfikacji();
        app.screenShot();
        app.saveandcloseButton();
        app.screenShot();
        app.logOut();
        app.screenShot();

        app.logInDRSZZIP();
        app.screenShot();
        app.getGrupa().Wyszukaj();
        app.screenShot();
        app.getSkrot().Zmiany();
        app.screenShot();
        app.getKolekcja().WstawNumerZmiany();
        app.screenShot();
        app.getKolekcja().PierwszyElementKolekcji();
        app.screenShot();
        app.getAkcja().DodajZadanie();
        app.screenShot();
        app.getZadanie().UzupelnienieZadZmianaDRSZZIP();
        app.screenShot();
        app.saveandcloseButton();
        app.screenShot();
        app.getKolekcja().ZadanieZmiany4();
        app.screenShot();
        app.getAkcja().PrzekazDoRealizacji();
        app.screenShot();
        app.getAkcja().Zamknij();
        app.screenShot();
        app.getZadanie().PowrotDoZmianyLink();
        app.screenShot();
        app.getAkcja().DoPonownejAkceptacji();
        app.screenShot();
        app.logOut();
        app.screenShot();

        app.logInAdminAplikacji();
        app.screenShot();
        app.getGrupa().Wyszukaj();
        app.screenShot();
        app.getSkrot().Zmiany();
        app.screenShot();
        app.getKolekcja().WstawNumerZmiany();
        app.screenShot();
        app.getKolekcja().PierwszyElementKolekcji();
        app.screenShot();
        app.getKolekcja().ZadanieZmiany5();
        app.screenShot();

        app.getAkcja().Przyjmij();
        app.screenShot();
        app.getAkcja().Zatwierdz();
        app.screenShot();
        app.logOut();

        app.logInDRSw3();
        app.screenShot();
        app.getGrupa().Wyszukaj();
        app.screenShot();
        app.getSkrot().Zmiany();
        app.screenShot();
        app.getKolekcja().WstawNumerZmiany();
        app.screenShot();
        app.getKolekcja().PierwszyElementKolekcji();
        app.screenShot();
        app.getKolekcja().ZadanieZmiany6();
        app.screenShot();
        app.getAkcja().Przyjmij();
        app.screenShot();
        app.getAkcja().Zatwierdz();
        app.screenShot();
        app.logOut();
        app.screenShot();

        app.logInAdminAplikacji();
        app.screenShot();
        app.getGrupa().Wyszukaj();
        app.getSkrot().Zmiany();
        app.getKolekcja().WstawNumerZmiany();
        app.screenShot();
        app.getKolekcja().PierwszyElementKolekcji();
        app.screenShot();
        app.getKolekcja().ZadanieZmiany7();
        app.screenShot();
        app.getAkcja().Przyjmij();
        app.screenShot();
        app.getAkcja().Zamknij();
        app.screenShot();
        app.getZadanie().PowrotDoZmianyLink();
        app.getKolekcja().ZadanieZmiany8();
        app.screenShot();
        app.getAkcja().Przyjmij();
        app.screenShot();
        app.getAkcja().Zamknij();
        app.screenShot();
        app.getZadanie().PowrotDoZmianyLink();
        app.getKolekcja().ZadanieZmiany9();
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
        app.getAkcja().ZmianaNiePowiodlaSie();
        app.screenShot();
        app.getZmiana().ZmianaNiePowiodlaSieUzupelnij();
        app.screenShot();
        app.saveandcloseButton();
        app.screenShot();
        app.getAkcja().DodajZadanie();
        app.screenShot();
        app.getZadanie().UzupelnienieZadZmianaDRSZZIP();
        app.screenShot();
        app.saveButton();
        app.screenShot();
        app.getAkcja().PrzekazDoRealizacji();
        app.saveButton();
        app.screenShot();
        app.getAkcja().Zamknij();
        app.screenShot();
        app.getZadanie().PowrotDoZmianyLink();
        app.screenShot();
        app.getAkcja().ZamknijZmiane();
        app.screenShot();
        app.getZmiana().ZamknijZmianeUzupelnij();
        app.screenShot();
        app.saveandcloseButton();
        app.screenShot();
        app.logOut();
        app.screenShot();

    }
}
