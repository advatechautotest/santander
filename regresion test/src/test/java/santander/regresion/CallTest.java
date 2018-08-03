package santander.regresion;


import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import java.util.Date;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.concurrent.TimeUnit;

public class CallTest {

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
        driver.get("http://10.0.19.28/upgrade18.WebAccess/wd/Logon/Logon.rails");
        //LOGOWANIE
        logIn("masmiertka@pl.aigcfg.net");
    }

    private void logIn(String username) {
        driver.findElement(By.id("Ecom_User_ID")).click();
        driver.findElement(By.id("Ecom_User_ID")).sendKeys(username);
        driver.findElement(By.id("logonButton")).click();
    }

    @Test
    public void testNewCall() throws Exception{

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

    private void createNewCall() {
        driver.findElement(By.xpath("//li[contains(text(), 'Załóż zgłoszenie')]")).click();
    }

    private void addAttachment() {
        File file = new File("C:/tmp.txt");
        if(!file.exists())throw new RuntimeException("file doesn't exist");
        else { driver.findElement(By.id("mainForm-AttachmentDocument")).sendKeys(file.getAbsolutePath()); }
    }

    private void addAttachmentName() {
        driver.findElement(By.id("mainForm-Title")).sendKeys("Testowa notatka");
    }

    private void initAddAttachment() {
        driver.findElement(By.xpath("//li[contains(text(), 'Dodaj załącznik')]")).click();
    }

    private void saveandcloseButton() {
        driver.findElement(By.id("mainForm-SaveButton")).click();
    }

    private void addContentNote() {
        driver.findElement(By.id("mainForm-Text4_editor")).sendKeys("Testowa notatka");
    }

    private void initAddNote() {
        driver.findElement(By.xpath("//li[contains(text(), 'Dodaj notatkę')]")).click();
    }

    private void saveButton() {
        driver.findElement(By.id("mainForm-ApplyButton")).click();
    }

    private void addCallThema() {
        driver.findElement(By.id("mainForm-_Tytuledytowalny")).sendKeys("Testowy temat");
    }

    private void initNewCall() {
        driver.findElement(By.id("shortcutItem_a7dbbd84-ffac-4d13-8c99-6f99d281d6f4")).click();
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
}

}


