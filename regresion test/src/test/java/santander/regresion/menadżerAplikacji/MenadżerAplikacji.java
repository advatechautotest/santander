package santander.regresion.menadżerAplikacji;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class MenadżerAplikacji {
    private FirefoxDriver driver;

    private Akcja akcja;
    private Incydent incydent;
    private Zgłoszenie zgłoszenie;


    public void screenShot()throws IOException, InterruptedException{
    File scr=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
    File dest= new File("C:/advatech/screenshot_"+timestamp()+".png");
    FileHandler.copy(scr, dest); }

    public String  timestamp() {
    return new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date());}

    public void initTest() {
        driver = new FirefoxDriver(new FirefoxOptions().setLegacy(true));
        System.setProperty("webdriver.gecko.driver","drivers/geckodriver.exe");
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://10.0.19.28/upgrade18.WebAccess/wd/Logon/Logon.rails");
        incydent = new Incydent(driver);
        zgłoszenie = new Zgłoszenie(driver);
        akcja = new Akcja(driver);

    }

    public void saveandcloseButton() {
        driver.findElement(By.id("mainForm-SaveButton")).click();
    }

    public void saveButton() {
        driver.findElement(By.id("mainForm-ApplyButton")).click();
    }

    public void procesNoweZgłoszenie() {
        driver.findElement(By.id("shortcutItem_a7dbbd84-ffac-4d13-8c99-6f99d281d6f4")).click();
    }

    public void quit() {
        driver.quit();
    }

    public void logInEndUser() {
        driver.findElement(By.id("Ecom_User_ID")).click();
        driver.findElement(By.id("Ecom_User_ID")).sendKeys("masmiertka@pl.aigcfg.net");
        driver.findElement(By.id("logonButton")).click();
    }

    public void logIn1wszaLinia() {
        driver.findElement(By.id("Ecom_User_ID")).click();
        driver.findElement(By.id("Ecom_User_ID")).sendKeys("kbednarz@pl.aigcfg.net");
        driver.findElement(By.id("logonButton")).click();
    }

    public void logOut() {
        driver.findElement(By.xpath("//div[contains(@title, 'Wyloguj')]")).click();
    }

    public void kolekcjaPierwszyElementKolekcji() {
        driver.findElement(By.xpath(".//*[@class='listBody']/tr/td[1]")).click();
    }

    public void kolekcjaIncydent() {
        driver.findElement(By.id("_btn_1")).click();
    }




    public String zmianaSSnaWD() {
        return driver.getCurrentUrl().replaceAll("/ss/", "/wd/");
    }
    public void wprowadzPobranyUrl(String url) {
        driver.get(url);
    }

    public Zgłoszenie getZgłoszenie() {
        return zgłoszenie;
    }
    public Incydent getIncydent() {
        return incydent;
    }

    public Akcja getAkcja() {
        return akcja;
    }
}
