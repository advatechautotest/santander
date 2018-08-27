package santander.regresion.test;

import org.testng.annotations.Test;
import santander.regresion.TestBase;

public class ZmianaAwaryjnaAnuluj2 extends TestBase {
    @Test

    public void testZmianaAwaryjnaAnuluj2() throws Exception{

        app.logInAdminAplikacji();
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
        app.getAkcja().AnulujZmiane();
        app.getZmiana().KategoriaZamknieciaZmiany();
        app.screenShot();
        app.saveandcloseButton();
        app.screenShot();
    }
}
