package santander.regresion.test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import santander.regresion.TestBase;

public class ZmianaNowa extends TestBase {
    @Test
    public void testNowaZmiana() throws Exception{


        //app.set100();
        app.logIn1wszaLinia();
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


        app.Czekaj();
    }
}
