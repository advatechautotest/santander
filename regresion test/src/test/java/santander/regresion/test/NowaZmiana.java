package santander.regresion.test;

import org.testng.annotations.Test;
import santander.regresion.TestBase;

public class NowaZmiana extends TestBase {
    @Test
    public void testNowaZmiana() throws Exception{



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

        app.Czekaj();
    }
}
