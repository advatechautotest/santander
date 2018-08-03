package santander.regresion;


import org.testng.annotations.Test;



public class CallTest extends TestBase {

    @Test
    public void testNewCall() throws Exception{

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
        createNewCall();
        screenShot();





}

}


