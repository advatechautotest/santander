package santander.regresion.test;

import org.testng.annotations.Test;
import santander.regresion.TestBase;

public class ZmianaAwaryjnaAnuluj1 extends TestBase {
    @Test

    public void testZmianaAwaryjnaAnuluj1() throws Exception{

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
        app.getAkcja().AnulujZmiane();
        app.getZmiana().KategoriaZamknieciaZmiany();
        app.screenShot();
        app.saveandcloseButton();
        app.screenShot();
    }
}
