package santander.regresion;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class CallHelper {

    FirefoxDriver driver;


    public void setUp() throws Exception {
        driver = new FirefoxDriver(new FirefoxOptions().setLegacy(true).setBinary("C:/Users/Marek/AppData/Local/Mozilla Firefox/firefox.exe"));
        System.setProperty("webdriver.gecko.driver", "/Users/Marek/AppData/Local/Mozilla Firefox/geckodriver.exe");
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

        driver.get("http://10.0.19.28/upgrade18.WebAccess/wd/Logon/Logon.rails");



    }

    public void tearDown(){
        driver.quit();
    }

    public void logIn(){


        driver.findElement(By.id("Ecom_User_ID")).click();
        driver.findElement(By.id("Ecom_User_ID")).sendKeys("masmiertka@pl.aigcfg.net");
        driver.findElement(By.id("logonButton")).click();
    }


    public void screenShot()throws IOException, InterruptedException{
        File scr=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        File dest= new File("C:/advatech/screenshot_"+timestamp()+".png");
        FileHandler.copy(scr, dest); }
    public String  timestamp() {
        return new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date());}



    public void newCall() {

        //NOWE ZGŁOSZENIE
        driver.findElement(By.id("shortcutItem_a7dbbd84-ffac-4d13-8c99-6f99d281d6f4")).click();
        //TEMAT ZGŁOSZENIA
        driver.findElement(By.id("mainForm-_Tytuledytowalny")).sendKeys("Testowy temat");
        saveButton();
        //DODAWANIE NOTATKI
        driver.findElement(By.xpath("//li[contains(text(), 'Dodaj notatkę')]")).click();
        //UZUPEŁNIANIE NOTATKI
        driver.findElement(By.id("mainForm-Text4_editor")).sendKeys("Testowa notatka");
        saveAndClose();
        //DODAJ ZAŁĄCZNIK
        driver.findElement(By.xpath("//li[contains(text(), 'Dodaj załącznik')]")).click();
        //TYTUŁ ZAŁACZNIKA
        driver.findElement(By.id("mainForm-Title")).sendKeys("Testowa notatka");
        //ZAŁĄCZNIK
        File file = new File("C:/tmp.txt"); if(!file.exists())throw new RuntimeException("file doesn't exist");
        else { driver.findElement(By.id("mainForm-AttachmentDocument")).sendKeys(file.getAbsolutePath()); }



    }


    public void saveButton(){

        //ZAPISANIE
        driver.findElement(By.id("mainForm-ApplyButton")).click();
    }

    public void saveAndClose(){

        //ZAPISZ I ZAMKNIJ
        driver.findElement(By.id("mainForm-SaveButton")).click();
    }
}
