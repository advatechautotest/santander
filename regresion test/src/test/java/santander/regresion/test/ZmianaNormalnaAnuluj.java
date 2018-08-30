package santander.regresion.test;

import org.testng.annotations.Test;
import santander.regresion.TestBase;

public class ZmianaNormalnaAnuluj extends TestBase {
    @Test
    public void testZmianaNormalnaAnuluj() throws Exception{

        app.logInAdminAplikacji();
        app.screenShot();
        app.BiezacaGrupaMenadzerZmian();
        app.screenShot();
        app.getGrupa().Nowy();
        app.screenShot();
        app.getSkrot().ZmianaNormalna();
        app.screenShot();
        app.getZmiana().ZmianaNormalnaUzupelnij();
        app.screenShot();
        app.saveButton();
        app.screenShot();
        app.getAkcja().AnulujZmiane();
        app.screenShot();
        app.getZmiana().ZmianaNormalnaAnuluj();
        app.screenShot();
        app.saveandcloseButton();
        app.screenShot();

    }
}
