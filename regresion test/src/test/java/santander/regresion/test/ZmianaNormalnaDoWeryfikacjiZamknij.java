package santander.regresion.test;

import org.testng.annotations.Test;
import santander.regresion.TestBase;

public class ZmianaNormalnaDoWeryfikacjiZamknij extends TestBase {
    @Test
    public void testZmianaNormalnaDoWeryfikacjiZamknij() throws Exception{

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

        app.getAkcja().DodecyzjiCAB();
        app.screenShot();

        app.getAkcja().DodajCzlonkaCAB();
        app.screenShot();
        app.getZadanie().UzupelnienieZadZmianaDodajCzlonkaCAB();
        app.screenShot();
        app.saveButton();
        app.screenShot();
        app.getZadanie().PowrotDoZmianyLink();
        app.screenShot();
        app.getAkcja().WyslijDoCzlonkowCAB();
        app.screenShot();
        app.getKolekcja().Zadania();
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
        app.screenShot();
        app.getZmiana().ZalacznikZmianaZadaniePlik();
        app.screenShot();
        app.saveandcloseButton();
        app.screenShot();
        app.getAkcja().Przyjmij();
        app.screenShot();
        app.getAkcja().Zatwierdz();
        app.screenShot();
        app.getZadanie().PowrotDoZmianyLink();
        app.screenShot();
        app.getAkcja().Zatwierdz();
        app.screenShot();
        app.getAkcja().DoWdrozenia();
        app.screenShot();
        app.getAkcja().DoWeryfikacji();
        app.screenShot();
        app.getAkcja().Zamknij();
        app.screenShot();
        app.getZmiana().ZamknijZmianeUzupelnij();
        app.screenShot();
        app.saveandcloseButton();
        app.screenShot();


    }
}
