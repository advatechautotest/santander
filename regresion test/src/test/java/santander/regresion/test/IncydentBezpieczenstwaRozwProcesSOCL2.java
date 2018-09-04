package santander.regresion.test;

import org.testng.annotations.Test;
import santander.regresion.TestBase;

public class IncydentBezpieczenstwaRozwProcesSOCL2 extends TestBase {
    @Test

    public void testIncydentBezpieczenstwaRozwProcesSOCL2() throws Exception{

        app.logInEndUser();
        app.screenShot();
        app.procesNowyIncydentBezpieczenstwa();
        app.screenShot();
        app.getZgloszenie().Tytul();
        app.screenShot();
        app.saveButton();
        app.screenShot();
        app.getAkcja().ZglosIncydent();
        String url = app.zmianaSSnaWD();
        app.logOut();
        app.logInSOC_L2();
        app.wprowadzPobranyUrl(url);
        app.screenShot();
        app.BiezacaGrupaSOC_L2();
        app.screenShot();
        app.getAkcja().Przejmij();
        app.screenShot();
        app.getAkcja().DodajNotatke();
        app.screenShot();
        app.getIncydent().NotatkaTytul();
        app.screenShot();
        app.saveandcloseButton();
        app.screenShot();
        app.getAkcja().DodajZalacznik();
        app.screenShot();
        app.getIncydent().ZalacznikTytul();
        app.getIncydent().ZalacznikPlik();
        app.screenShot();
        app.saveandcloseButton();
        app.screenShot();
        app.getAkcja().ZadeklarujPowaznyIncydent();
        app.screenShot();
        app.getAkcja().ZarejstrujCzasPracy();
        app.screenShot();
        app.getIncydent().CzasPracyUzupelnienie();
        app.screenShot();
        app.saveandcloseButton();
        app.screenShot();
    }
}
