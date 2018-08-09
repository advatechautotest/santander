package santander.regresion.test;

import org.testng.annotations.Test;
import santander.regresion.TestBase;

public class CloseCallTest extends TestBase {

@Test

    public void testNewCallClose() throws Exception{

    app.logInEndUser();
    app.procesNoweZgłoszenie();
    app.screenShot();
    app.getZgłoszenie().Tytul();
    app.screenShot();
    app.saveButton();
    app.screenShot();
    app.getAkcja().DodajNotatke();
    app.screenShot();
    app.getZgłoszenie().NotatkaTytul();
    app.screenShot();
    app.saveandcloseButton();
    app.screenShot();
    app.getAkcja().DodajZalacznik();
    app.screenShot();
    app.getZgłoszenie().ZalacznikTytul();
    app.screenShot();
    app.getZgłoszenie().ZalacznikPlik();
    app.screenShot();
    app.saveandcloseButton();
    app.screenShot();
    app.getAkcja().Zamknij();
    app.screenShot();
    app.getZgłoszenie().ZamknijTytul();
    app.screenShot();
    app.saveandcloseButton();
    app.screenShot();
}

}
