package santander.regresion.test;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import santander.regresion.TestBase;

public class CallToApplication8 extends TestBase {
    @Test

    public void testCallToApplication8() throws Exception{

        app.logInED();
        app.initNewCall();
        app.screenShot();
        app.addCallThema();
        app.screenShot();
        app.saveButton();
        app.screenShot();
        app.initAddNote();
        app.screenShot();
        app.addContentNote();
        app.screenShot();
        app.saveandcloseButton();
        app.screenShot();
        app.initAddAttachment();
        app.screenShot();
        app.addAttachmentName();
        app.screenShot();
        app.addAttachment();
        app.screenShot();
        app.saveandcloseButton();
        app.screenShot();
        app.createNewCall();
        app.screenShot();
        String url = app.zmianaSSnaWD();
        app.screenShot();
        app.logOut();
        app.screenShot();
        app.logInFL();
        app.screenShot();
        app.wprowadzPobranyUrl(url);
        app.screenShot();
        app.initTakeOver();
        app.screenShot();
        app.initEdit();
        app.screenShot();
        app.zgłoszenieOpisEdycja();
        app.screenShot();
        app.saveandcloseButton();
        app.screenShot();
        app.initTransIntoApplication();
    }

}
