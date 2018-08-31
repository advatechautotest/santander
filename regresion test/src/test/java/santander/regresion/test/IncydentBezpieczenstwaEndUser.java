package santander.regresion.test;

import org.testng.annotations.Test;
import santander.regresion.TestBase;

public class IncydentBezpieczenstwaEndUser extends TestBase {
    @Test

    public void testIncydentBezpieczenstwaEndUser() throws Exception{

        app.logInEndUser();
        app.screenShot();
        app.procesNowyIncydentBezpieczenstwa();
        app.screenShot();
        app.getZgloszenie().Tytul();
        app.screenShot();
        app.saveButton();
        app.screenShot();
        app.getAkcja().ZglosIncydent();
        //String url = app.zmianaSSnaWD();
        app.logOut();



    }
}
