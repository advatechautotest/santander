package santander.regresion.test;

import org.testng.annotations.Test;
import santander.regresion.TestBase;

public class CloseCallTest extends TestBase {

@Test

    public void testNewCallClose() throws Exception{

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
    app.initCloseCall();
    app.screenShot();
    app.addCloseCallThema();
    app.screenShot();
    app.saveandcloseButton();
    app.screenShot();
}

}
