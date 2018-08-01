package santander.regresion;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Call {

    FirefoxDriver driver;


    @BeforeMethod

    public void setUp() throws Exception {
        driver = new FirefoxDriver(new FirefoxOptions().setBinary("C:/Users/Marek/AppData/Local/Mozilla Firefox/firefox.exe"));
        System.setProperty("webdriver.gecko.driver","/Users/Marek/AppData/Local/Mozilla Firefox/geckodriver.exe");
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    }
@Test
    public void NewCall() {
        driver.get("http://10.0.19.28/upgrade18.WebAccess/wd/Logon/Logon.rails");
}

}


