package santander.regresion.test;

import org.testng.annotations.Test;
import santander.regresion.TestBase;

public class ZmianaAwaryjnaWsteczFalsz extends TestBase {
    @Test

    public void testZmianaAwaryjnaWsteczFalsz() throws Exception{

        app.logInAdminAplikacji();
        app.screenShot();
        app.getGrupa().Nowy();
        app.getSkrot().ZmianaAwaryjna();
        app.screenShot();
        app.getZmiana().ZmianaAwaryjnaTytul();
        app.getZmiana().DzialaWstecz();
        app.getZmiana().DzialaWsteczFalsz();
        app.screenShot();
        app.saveButton();
        app.screenShot();
        app.getAkcja().ZmianaPrzygotowana();
        app.screenShot();
        app.getAkcja().DodajNotatke();
        app.getZmiana().NotatkaZadanieTytul();
        app.screenShot();
        app.saveandcloseButton();
        app.screenShot();
        app.getAkcja().DodajZalacznik();
        app.getZmiana().ZalacznikZadanieTytul();
        app.getZmiana().ZalacznikZadaniePlik();
        app.screenShot();
        app.saveandcloseButton();
        app.getAkcja().DodajCzlonkaCAB();
        app.screenShot();
        app.getZadanie().UzupelnienieZadZmianaAwaryjnaAkceptacyjne();
        app.screenShot();
        app.saveButton();
        app.getAkcja().PrzekazDoRealizacji();
        app.screenShot();
        app.getAkcja().Zatwierdz();
        app.screenShot();
        app.getZadanie().PowrotDoZmianyLink();
        app.screenShot();
        app.getAkcja().DodajNotatke();
        app.getZmiana().NotatkaZadanieTytul();
        app.screenShot();
        app.saveandcloseButton();
        app.screenShot();
        app.getAkcja().DodajZalacznik();
        app.getZmiana().ZalacznikZadanieTytul();
        app.getZmiana().ZalacznikZadaniePlik();
        app.screenShot();
        app.saveandcloseButton();
        app.screenShot();
        app.getAkcja().DoWeryfikacji();
        app.screenShot();
        app.getAkcja().ZmianaPowiodlaSie();
        app.getZmiana().ZmianaPowiodlaSieUzupelnij();
        app.screenShot();
        app.saveandcloseButton();
        app.screenShot();


    }
}
