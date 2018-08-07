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

public class TestBase {
    FirefoxDriver driver;

    public void screenShot()throws IOException, InterruptedException{
    File scr=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    File dest= new File("C:/advatech/screenshot_"+timestamp()+".png");
    FileHandler.copy(scr, dest); }

    public String  timestamp() {
    return new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date());}

    @BeforeMethod

    public void setUp() throws Exception {

        //
        //File FirefoxDriver = new File("drivers/geckodriver.exe");
        //System.setProperty("webdriver.gecko.driver", FirefoxDriver.getAbsolutePath());
        driver = new FirefoxDriver(new FirefoxOptions().setLegacy(true));
        System.setProperty("webdriver.gecko.driver","drivers/geckodriver.exe");
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://10.0.19.28/upgrade18.WebAccess/wd/Logon/Logon.rails");
        //LOGOWANIE
        //logIn("masmiertka@pl.aigcfg.net");

    }

   /* private void logIn(String username) {
        driver.findElement(By.id("Ecom_User_ID")).click();
        driver.findElement(By.id("Ecom_User_ID")).sendKeys(username);
        driver.findElement(By.id("logonButton")).click();
    }*/


    protected void createNewCall() {
        driver.findElement(By.xpath("//li[contains(text(), 'Załóż zgłoszenie')]")).click();
    }

    protected void addAttachment() {
        File file = new File("regresion test/attach/santander.txt");
        if(!file.exists())throw new RuntimeException("file doesn't exist");
        else { driver.findElement(By.id("mainForm-AttachmentDocument")).sendKeys(file.getAbsolutePath()); }
    }

    protected void addAttachmentName() {
        driver.findElement(By.id("mainForm-Title")).sendKeys("Tytuł załącznika");
    }

    protected void initAddAttachment() {
        driver.findElement(By.xpath("//li[contains(text(), 'Dodaj załącznik')]")).click();
    }

    protected void saveandcloseButton() {
        driver.findElement(By.id("mainForm-SaveButton")).click();
    }

    protected void addContentNote() {
        driver.findElement(By.id("mainForm-Text4_editor")).sendKeys("Testowa notatka");
    }

    protected void initAddNote() {
        driver.findElement(By.xpath("//li[contains(text(), 'Dodaj notatkę')]")).click();
    }

    protected void saveButton() {
        driver.findElement(By.id("mainForm-ApplyButton")).click();
    }

    protected void addCallThema() {
        driver.findElement(By.id("mainForm-_Tytuledytowalny")).sendKeys("Testowy temat");
    }

    protected void initNewCall() {
        driver.findElement(By.id("shortcutItem_a7dbbd84-ffac-4d13-8c99-6f99d281d6f4")).click();
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
}

    protected void logInED() {
        driver.findElement(By.id("Ecom_User_ID")).click();
        driver.findElement(By.id("Ecom_User_ID")).sendKeys("masmiertka@pl.aigcfg.net");
        driver.findElement(By.id("logonButton")).click();
    }

    protected void addCloseCallThema() {
        driver.findElement(By.id("mainForm-Title2")).sendKeys("Testowy tytuł");
    }

    protected void initCloseCall() {
        driver.findElement(By.xpath("//li[contains(text(), 'Zamknij')]")).click();
    }

    protected void initEdit() {
        driver.findElement(By.xpath("//li[contains(text(), 'Edytuj')]")).click();
    }

    protected void initTakeOver() {
        driver.findElement(By.xpath("//li[contains(text(), 'Przejmij')]")).click();
    }

    protected void logInFL() {
        driver.findElement(By.id("Ecom_User_ID")).click();
        driver.findElement(By.id("Ecom_User_ID")).sendKeys("kbednarz@pl.aigcfg.net");
        driver.findElement(By.id("logonButton")).click();
    }

    protected void logOut() {
        driver.findElement(By.xpath("//div[contains(@title, 'Wyloguj')]")).click();
    }

    protected void initTransIntoSecurityIncident() {
        driver.findElement(By.xpath("//li[contains(text(), 'Przekształć w incydent bezpieczeństwa')]")).click();
    }

    protected void initTransIntoPermissionsApplication() {
        driver.findElement(By.xpath("//li[contains(text(), 'Przekształć we wniosek o uprawnienia')]")).click();
    }

    protected void initTransIntoApplication() {
        driver.findElement(By.xpath("//li[contains(text(), 'Przekształć we wniosek')]")).click();
    }

    protected void initTransIntoIncident() {
        driver.findElement(By.xpath("//li[contains(text(), 'Przekształć w incydent')]")).click();
    }

    protected void collSelect1stRecord() {
        driver.findElement(By.xpath(".//*[@class='listBody']/tr/td[1]")).click();
    }

    protected void collIncydent() {
        driver.findElement(By.id("_btn_1")).click();
    }
}