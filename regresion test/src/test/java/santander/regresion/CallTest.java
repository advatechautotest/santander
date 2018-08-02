package santander.regresion;

import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.annotations.Test;




public class CallTest extends CallHelper{



    @Test

        public void testCall() throws  Exception {

        setUp();
        logIn();
        screenShot();
        newCall();
        saveAndClose();
        tearDown();


    }




}
