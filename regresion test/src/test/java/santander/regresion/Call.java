package santander.regresion;


import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import java.util.Date;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.concurrent.TimeUnit;

public class Call {

    FirefoxDriver driver;

    public void screenShot()throws IOException, InterruptedException{
    File scr=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    File dest= new File("C:/advatech/screenshot_"+timestamp()+".png");
    FileHandler.copy(scr, dest); }
    public String  timestamp() {
    return new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date());}

    @BeforeMethod

    public void setUp() throws Exception {
        driver = new FirefoxDriver(new FirefoxOptions().setLegacy(true).setBinary("C:/Users/Marek/AppData/Local/Mozilla Firefox/firefox.exe"));
        System.setProperty("webdriver.gecko.driver","/Users/Marek/AppData/Local/Mozilla Firefox/geckodriver.exe");
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    }
@Test
    public void NewCall() throws Exception{

        driver.get("http://10.0.19.28/upgrade18.WebAccess/wd/Logon/Logon.rails");
        //driver.findElement(By.xpath(".//*[@id='body']")).clear();
        //LOGOWANIE
        driver.findElement(By.id("Ecom_User_ID")).click();
        driver.findElement(By.id("Ecom_User_ID")).sendKeys("masmiertka@pl.aigcfg.net");
        screenShot();
        driver.findElement(By.id("logonButton")).click();
        //NOWE ZGŁOSZENIE
        driver.findElement(By.id("shortcutItem_a7dbbd84-ffac-4d13-8c99-6f99d281d6f4")).click();
         screenShot();
        //TEMAT ZGŁOSZENIA
        driver.findElement(By.id("mainForm-_Tytuledytowalny")).sendKeys("Testowy temat");
        screenShot();
        //ZAPISANIE
        driver.findElement(By.id("mainForm-ApplyButton")).click();
        screenShot();
        //DODAWANIE NOTATKI
        driver.findElement(By.xpath("//li[contains(text(), 'Dodaj notatkę')]")).click();
        screenShot();
        //UZUPEŁNIANIE NOTATKI
        driver.findElement(By.id("mainForm-Text4_editor")).sendKeys("Testowa notatka");
        screenShot();
        //ZAPISZ I ZAMKNIJ
        driver.findElement(By.id("mainForm-SaveButton")).click();
        screenShot();
        //DODAJ ZAŁĄCZNIK
        driver.findElement(By.xpath("//li[contains(text(), 'Dodaj załącznik')]")).click();
        screenShot();
        //TYTUŁ ZAŁACZNIKA
        driver.findElement(By.id("mainForm-Title")).sendKeys("Testowa notatka");
        screenShot();
        //ZAŁĄCZNIK
        File file = new File("C:/tmp.txt"); if(!file.exists())throw new RuntimeException("file doesn't exist");
        else { driver.findElement(By.id("mainForm-AttachmentDocument")).sendKeys(file.getAbsolutePath()); }
        screenShot();
        //ZAPISZ ZAMKNIJ
        driver.findElement(By.id("mainForm-SaveButton")).click();
        screenShot();
         //ZAŁÓŻ ZGŁOSZENIE
        driver.findElement(By.xpath("//li[contains(text(), 'Załóż zgłoszenie')]")).click();
        screenShot();





}

@AfterMethod
    public void tearDown(){
        driver.quit();
}

}


