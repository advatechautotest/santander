package santander.regresion.test;


import org.testng.annotations.Test;
import santander.regresion.TestBase;


public class CallTest extends TestBase {

    @Test
    public void testNewCall() throws Exception{

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





}

}


