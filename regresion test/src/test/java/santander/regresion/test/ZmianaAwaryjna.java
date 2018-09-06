package santander.regresion.test;

import org.testng.annotations.Test;
import santander.regresion.TestBase;

public class ZmianaAwaryjna extends TestBase {
    @Test

    public void testZmianaAwaryjna() throws Exception{

        app.logInAdminAplikacji();
        app.screenShot();
        app.BiezacaGrupaAdministratorzyAplikacji();
        app.screenShot();
        app.getGrupa().Nowy();
        app.getSkrot().ZmianaAwaryjna();
        app.screenShot();
        app.getZmiana().ZmianaAwaryjnaTytul();
        app.getZmiana().DzialaWstecz();
        app.getZmiana().DzialaWsteczPrawda();
        app.screenShot();
        app.saveButton();
        app.screenShot();
        app.getAkcja().DodajSzczegolZmiany();
        app.getZmiana().SzczegolZmiany();
        app.screenShot();
        app.saveandcloseButton();
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
        app.getAkcja().ZmianaPrzygotowana();
        app.screenShot();
        app.getAkcja().DodajZadanie();
        app.screenShot();
        app.getZadanie().UzupelnienieZadZmianaAwaryjnaInne();
        app.screenShot();
        app.saveandcloseButton();
        app.screenShot();
        app.getKolekcja().Zadania();
        app.screenShot();
        app.getAkcja().PrzekazDoRealizacji();
        app.screenShot();
        app.getAkcja().Zamknij();
        app.screenShot();
        app.getZadanie().PowrotDoZmianyLink();
        app.screenShot();
        app.getAkcja().ZmianaNiePowiodlaSie();
        app.getZmiana().ZmianaNiePowiodlaSieUzupelnij();
        app.screenShot();
        app.saveandcloseButton();
        app.screenShot();
        app.getAkcja().Edytuj();
        app.getZmiana().OpisEdytuj();
        app.saveandcloseButton();
        app.screenShot();
        app.getAkcja().DodajNotatke();
        app.screenShot();
        app.getZmiana().NotatkaZadanieTytul();
        app.screenShot();
        app.saveandcloseButton();
        app.screenShot();
        app.getAkcja().DodajZalacznik();
        app.screenShot();
        app.getZmiana().ZalacznikZadanieTytul();
        app.getZmiana().ZalacznikZadaniePlik();
        app.screenShot();
        app.saveandcloseButton();
        app.screenShot();
        app.getAkcja().DodajZadanie();
        app.screenShot();
        app.getZadanie().UzupelnienieZadZmianaAwaryjnaInne();
        app.screenShot();
        app.saveandcloseButton();
        app.screenShot();
        app.getKolekcja().Zadanie2();
        app.screenShot();
        app.getAkcja().PrzekazDoRealizacji();
        app.screenShot();
        app.getAkcja().Zamknij();
        app.screenShot();
        app.getZadanie().PowrotDoZmianyLink();
        app.screenShot();
        app.getAkcja().Zamknij();
        app.screenShot();
        app.getZmiana().ZamkniecieZmianyUzupelnij();
        app.screenShot();
        app.saveandcloseButton();
        app.screenShot();
        app.logOut();
        app.screenShot();


    }
}
