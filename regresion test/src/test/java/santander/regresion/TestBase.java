package santander.regresion;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import santander.regresion.menadżerAplikacji.MenadżerAplikacji;


public class TestBase {

    //protected static final MenadżerAplikacji app = new MenadżerAplikacji();
    protected static final MenadżerAplikacji app = new MenadżerAplikacji();
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

    public MenadżerAplikacji getApp() {
        return app;
    }



}
