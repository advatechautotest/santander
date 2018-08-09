package santander.regresion.test;

import org.testng.annotations.Test;
import santander.regresion.TestBase;

public class ZamkniecieZgloszenia extends TestBase {

@Test

    public void testNewCallClose() throws Exception{

    app.logInEndUser();
    app.procesNoweZgloszenie();
    app.screenShot();
    app.getZgloszenie().Tytul();
    app.screenShot();
    app.saveButton();
    app.screenShot();
    app.getAkcja().DodajNotatke();
    app.screenShot();
    app.getZgloszenie().NotatkaTytul();
    app.screenShot();
    app.saveandcloseButton();
    app.screenShot();
    app.getAkcja().DodajZalacznik();
    app.screenShot();
    app.getZgloszenie().ZalacznikTytul();
    app.screenShot();
    app.getZgloszenie().ZalacznikPlik();
    app.screenShot();
    app.saveandcloseButton();
    app.screenShot();
    app.getAkcja().Zamknij();
    app.screenShot();
    app.getZgloszenie().ZamknijTytul();
    app.screenShot();
    app.saveandcloseButton();
    app.screenShot();
}

}
