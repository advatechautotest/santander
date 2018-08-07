package santander.regresion.test;

import org.testng.annotations.Test;
import santander.regresion.TestBase;


public class TakeOverCall extends TestBase {

    @Test
    public void testTakeOverCall() throws Exception{

        app.logInEndUser();
        app.procesNoweZgłoszenie();
        app.screenShot();
        app.getZgłoszenie().zgłoszenieTytuł();
        app.screenShot();
        app.saveButton();
        app.screenShot();
        app.getAkcja().akcjaDodajNotatkę();
        app.screenShot();
        app.getZgłoszenie().zgłoszenieNotatkaTytuł();
        app.screenShot();
        app.saveandcloseButton();
        app.screenShot();
        app.getAkcja().akcjaDodajZałącznik();
        app.screenShot();
        app.getZgłoszenie().zgłoszenieZałącznikTytuł();
        app.screenShot();
        app.getZgłoszenie().zgłoszenieZałącznikPlik();
        app.screenShot();
        app.saveandcloseButton();
        app.screenShot();
        app.getAkcja().akcjaZałóżZgłoszenie();
        app.screenShot();
        String url = app.zmianaSSnaWD();
        app.screenShot();
        app.logOut();
        app.screenShot();
        app.logIn1wszaLinia();
        app.screenShot();
        app.wprowadzPobranyUrl(url);
        app.screenShot();
        app.getAkcja().akcjaPrzejmij();
        app.screenShot();
        app.getAkcja().akcjaEdytuj();
        app.screenShot();
        app.getZgłoszenie().zgłoszenieOpisEdycja();
        app.screenShot();
        app.saveandcloseButton();
        app.screenShot();
    }

}
