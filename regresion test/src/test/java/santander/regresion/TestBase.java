package santander.regresion;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import santander.regresion.menadżerAplikacji.MenadżerAplikacji;


public class TestBase {

    protected final MenadżerAplikacji app = new MenadżerAplikacji();

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
