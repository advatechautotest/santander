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

public class MenadżerAplikacji  {
    FirefoxDriver driver;

    public void screenShot()throws IOException, InterruptedException{
    File scr=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
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
    }

    public void akcjaZałóżZgłoszenie() {
        driver.findElement(By.xpath("//li[contains(text(), 'Załóż zgłoszenie')]")).click();
    }

    public void zgłoszenieZałącznikPlik() {
        File file = new File("regresion test/attach/santander.txt");
        if(!file.exists())throw new RuntimeException("file doesn't exist");
        else { driver.findElement(By.id("mainForm-AttachmentDocument")).sendKeys(file.getAbsolutePath()); }
    }

    public void zgłoszenieZałącznikTytuł() {
        driver.findElement(By.id("mainForm-Title")).sendKeys("Tytuł załącznika");
    }

    public void akcjaDodajZałącznik() {
        driver.findElement(By.xpath("//li[contains(text(), 'Dodaj załącznik')]")).click();
    }

    public void saveandcloseButton() {
        driver.findElement(By.id("mainForm-SaveButton")).click();
    }

    public void zgłoszenieNotatkaTytuł() {
        driver.findElement(By.id("mainForm-Text4_editor")).sendKeys("Testowa notatka");
    }

    public void akcjaDodajNotatkę() {
        driver.findElement(By.xpath("//li[contains(text(), 'Dodaj notatkę')]")).click();
    }

    public void saveButton() {
        driver.findElement(By.id("mainForm-ApplyButton")).click();
    }

    public void zgłoszenieTytuł() {
        driver.findElement(By.id("mainForm-_Tytuledytowalny")).sendKeys("Testowy temat");
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

    public void zgłoszenieZamknijTytuł() {
        driver.findElement(By.id("mainForm-Title2")).sendKeys("Testowy tytuł");
    }

    public void akcjaZamknij() {
        driver.findElement(By.xpath("//li[contains(text(), 'Zamknij')]")).click();
    }

    public void akcjaEdytuj() {
        driver.findElement(By.xpath("//li[contains(text(), 'Edytuj')]")).click();
    }

    public void akcjaPrzejmij() {
        driver.findElement(By.xpath("//li[contains(text(), 'Przejmij')]")).click();
    }

    public void logIn1wszaLinia() {
        driver.findElement(By.id("Ecom_User_ID")).click();
        driver.findElement(By.id("Ecom_User_ID")).sendKeys("kbednarz@pl.aigcfg.net");
        driver.findElement(By.id("logonButton")).click();
    }

    public void logOut() {
        driver.findElement(By.xpath("//div[contains(@title, 'Wyloguj')]")).click();
    }

    public void akcjaPrzekształćwIncydentBezpieczeństwa() {
        driver.findElement(By.xpath("//li[contains(text(), 'Przekształć w incydent bezpieczeństwa')]")).click();
    }

    public void akcjaPrzekształćWeWniosekoUprawnienia() {
        driver.findElement(By.xpath("//li[contains(text(), 'Przekształć we wniosek o uprawnienia')]")).click();
    }

    public void akcjaPrzekształćWeWniosek() {
        driver.findElement(By.xpath("//li[contains(text(), 'Przekształć we wniosek')]")).click();
    }

    public void akcjaPrzekształćwIncydent() {
        driver.findElement(By.xpath("//li[contains(text(), 'Przekształć w incydent')]")).click();
    }

    public void kolekcjaPierwszyElementKolekcji() {
        driver.findElement(By.xpath(".//*[@class='listBody']/tr/td[1]")).click();
    }

    public void kolekcjaIncydent() {
        driver.findElement(By.id("_btn_1")).click();
    }

    public void zgłośIncydent() {
        driver.findElement(By.xpath("//li[contains(text(), 'Zgłoś incydent')]")).click();
    }

    public void incydentZałącznikPlik() {
        File file = new File("regresion test/attach/santander.txt");
        if(!file.exists())throw new RuntimeException("file doesn't exist");
        else { driver.findElement(By.id("mainForm-AttachmentDocument2")).sendKeys(file.getAbsolutePath());}
    }

    public void incydentZałącznikTytuł() {
        driver.findElement(By.id("mainForm-Title2")).sendKeys("Tytuł załącznika");
    }

    public void incydentNotatkaTytuł() {
        driver.findElement(By.id("mainForm-Text2_editor")).sendKeys("Testowa notatka");
    }

    public void incydentNotatkaRodzajPubliczna() {
        driver.findElement(By.xpath("//div[contains(text(), 'Notatka publiczna')]")).click();
    }

    public void incydentNotatkaRodzaj() {
        driver.findElement(By.id("mainForm-_RodzajnotatkiDisplay")).click();
    }
    public String zmianaSSnaWD() {
        return driver.getCurrentUrl().replaceAll("/ss/", "/wd/");
    }
    public void wprowadzPobranyUrl(String url) {
        driver.get(url);
    }

    public void zgłoszenieOpisEdycja() {
        driver.findElement(By.id("mainForm-Description2_editor")).sendKeys("Opis zedytowany");
    }
}
