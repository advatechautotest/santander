package santander.regresion.test;

import org.testng.annotations.Test;
import santander.regresion.TestBase;

public class CloseCallTest extends TestBase {

@Test

    public void testNewCallClose() throws Exception{

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
    app.getAkcja().akcjaZamknij();
    app.screenShot();
    app.getZgłoszenie().zgłoszenieZamknijTytuł();
    app.screenShot();
    app.saveandcloseButton();
    app.screenShot();
}

}
