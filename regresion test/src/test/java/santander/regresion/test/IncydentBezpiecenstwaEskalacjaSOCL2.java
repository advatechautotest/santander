package santander.regresion.test;

import org.testng.annotations.Test;
import santander.regresion.TestBase;

public class IncydentBezpiecenstwaEskalacjaSOCL2 extends TestBase {
    @Test

    public void testIncydentBezpiecenstwaEskalacjaSOCL2() throws Exception{

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
        app.logInSOC_L1();
        app.wprowadzPobranyUrl(url);
        app.screenShot();
        app.getAkcja().Przejmij();
        app.screenShot();
        app.getAkcja().DodajPrzypisanie();
        app.screenShot();
        app.getIncydent().IncydentAwaryjnyPrzypisanieSOC_L2();
        app.screenShot();
        app.saveandcloseButton();
        app.screenShot();
    }
}
