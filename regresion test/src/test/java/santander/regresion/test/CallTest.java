package santander.regresion.test;


import org.testng.annotations.Test;
import santander.regresion.TestBase;


public class CallTest extends TestBase {

    @Test
    public void testNewCall() throws Exception{

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





}

}


