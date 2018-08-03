package santander.regresion;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class CloseCallTest extends TestBase {

@Test

    public void testNewCallClose() throws Exception{

    logInED();
    initNewCall();
    screenShot();
    addCallThema();
    screenShot();
    saveButton();
    screenShot();
    initAddNote();
    screenShot();
    addContentNote();
    screenShot();
    saveandcloseButton();
    screenShot();
    initAddAttachment();
    screenShot();
    addAttachmentName();
    screenShot();
    addAttachment();
    screenShot();
    saveandcloseButton();
    screenShot();
    initCloseCall();
    screenShot();
    addCloseCallThema();
    screenShot();
    saveandcloseButton();
    screenShot();
}

}
