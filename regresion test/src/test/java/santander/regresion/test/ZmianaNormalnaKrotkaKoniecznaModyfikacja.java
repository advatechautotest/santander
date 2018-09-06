package santander.regresion.test;

import org.testng.annotations.Test;
import santander.regresion.TestBase;

public class ZmianaNormalnaKrotkaKoniecznaModyfikacja extends TestBase {
    @Test
    public void testZmianaNormalnaKrotkaKoniecznaModyfikacja() throws Exception{

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
        app.getAkcja().PrzekazDoManageraZmian();
        app.screenShot();
        app.getKolekcja().PobierzNumerZmiany();
        app.screenShot();
        app.logOut();
        app.screenShot();
        app.logInMenadzerZmian();
        app.screenShot();
        app.BiezacaGrupaMenadzerZmian();
        app.screenShot();
        app.getGrupa().Wyszukaj();
        app.screenShot();
        app.getSkrot().Zmiany();
        app.screenShot();
        app.getKolekcja().WstawNumerZmiany();
        app.screenShot();
        app.getKolekcja().PierwszyElementKolekcji();
        app.screenShot();
        app.getAkcja().Przejmij();
        app.screenShot();
        app.getAkcja().KoniecznaModyfikacja();
        app.screenShot();
        app.getZmiana().ZmianaNormalnaKoniecznaModyfikacjaUzupelnij();
        app.screenShot();
        app.saveandcloseButton();
        app.screenShot();
        app.logOut();
        app.screenShot();

    }
}
