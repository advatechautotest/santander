package santander.regresion.test;

import org.openqa.selenium.By;

import org.testng.annotations.Test;
import santander.regresion.TestBase;


public class TakeOverCall extends TestBase {

    @Test
    public void testTakeOverCall() throws Exception{

        app.logInEndUser();
        app.procesNoweZgłoszenie();
        app.screenShot();
        app.zgłoszenieTytuł();
        app.screenShot();
        app.saveButton();
        app.screenShot();
        app.akcjaDodajNotatkę();
        app.screenShot();
        app.zgłoszenieNotatkaTytuł();
        app.screenShot();
        app.saveandcloseButton();
        app.screenShot();
        app.akcjaDodajZałącznik();
        app.screenShot();
        app.zgłoszenieZałącznikTytuł();
        app.screenShot();
        app.zgłoszenieZałącznikPlik();
        app.screenShot();
        app.saveandcloseButton();
        app.screenShot();
        app.akcjaZałóżZgłoszenie();
        app.screenShot();
        String url = app.zmianaSSnaWD();
        app.screenShot();
        app.logOut();
        app.screenShot();
        app.logIn1wszaLinia();
        app.screenShot();
        app.wprowadzPobranyUrl(url);
        app.screenShot();
        app.akcjaPrzejmij();
        app.screenShot();
        app.akcjaEdytuj();
        app.screenShot();
        app.zgłoszenieOpisEdycja();
        app.screenShot();
        app.saveandcloseButton();
        app.screenShot();
    }

}
