package santander.regresion;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import santander.regresion.menadzerAplikacji.MenadzerAplikacji;


public class TestBase {


    protected static final MenadzerAplikacji app = new MenadzerAplikacji();
    @BeforeMethod

    public void setUp() throws Exception {


        //File FirefoxDriver = new File("drivers/geckodriver.exe");
        //System.setProperty("webdriver.gecko.driver", FirefoxDriver.getAbsolutePath());
        app.initTest();


    }


    @AfterMethod
    public void tearDown(){
        app.quit();
}

    public MenadzerAplikacji getApp() {
        return app;
    }



}
