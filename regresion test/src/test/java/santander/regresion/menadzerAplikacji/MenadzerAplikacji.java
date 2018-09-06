package santander.regresion.menadzerAplikacji;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import static java.util.concurrent.TimeUnit.SECONDS;

public class MenadzerAplikacji {
    private FirefoxDriver driver;
    private Skrot skrot;
    private Grupa grupa;
    private Kolekcja kolekcja;
    private Wniosek wniosek;
    private Akcja akcja;
    private Incydent incydent;
    private Zgloszenie zgloszenie;
    private Zadanie zadanie;
    private Zmiana zmiana;


    public void screenShot()throws IOException, InterruptedException{
    File scr=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
    File dest= new File("C:/advatech/screenshot_"+timestamp()+".png");
    FileHandler.copy(scr, dest); }
//blablahfg
    public String  timestamp() {
    return new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date());}

    public void initTest() {

        driver = new FirefoxDriver(new FirefoxOptions().setLegacy(true));
        System.setProperty("webdriver.gecko.driver","drivers/geckodriver.exe");
        driver.manage().timeouts().implicitlyWait(30, SECONDS);
        driver.manage().timeouts().pageLoadTimeout(30, SECONDS);
        driver.manage().window().maximize();

        driver.get("http://10.0.19.23/test18.WebAccess/wd/Logon/Logon.rails");



        //driver.get("http://10.0.19.28/upgrade18.WebAccess/wd/Logon/Logon.rails");
        //driver.get("http://10.0.19.41/20180801.WebAccess/wd/Logon/Logon.rails");
        incydent = new Incydent(driver);
        zgloszenie = new Zgloszenie(driver);
        akcja = new Akcja(driver);
        wniosek = new Wniosek(driver);
        kolekcja = new Kolekcja(driver);
        grupa = new Grupa(driver);
        skrot = new Skrot(driver);
        zadanie = new Zadanie(driver);
        zmiana = new Zmiana(driver);
    }



    public void saveandcloseButton() {
        driver.findElement(By.id("mainForm-SaveButton")).click();
    }

    public void saveButton() {
        driver.findElement(By.id("mainForm-ApplyButton")).click();
    }

    public void cancelButton() {
        driver.findElement(By.id("mainForm-CancelButton")).click();
    }

    public void procesNoweZgloszenie() {
        driver.findElement(By.id("shortcutItem_a7dbbd84-ffac-4d13-8c99-6f99d281d6f4")).click();
    }
    public void procesNowyIncydentBezpieczenstwa() {
        driver.findElement(By.id("shortcutItem_b5b3414a-1ac8-470e-9ed5-995d4902bc75")).click();
    }

    public void quit() {
        driver.quit();
    }

    public void logInEndUser() {
        if(!driver.findElements(By.id("Ecom_User_ID")).isEmpty()){
            driver.findElement(By.id("Ecom_User_ID")).click();
        }
        else{
            driver.findElement(By.xpath("//div[contains(@title, 'Wyloguj')]")).click();
        }
        driver.findElement(By.id("Ecom_User_ID")).click();
        driver.findElement(By.id("Ecom_User_ID")).sendKeys("masmiertka@pl.aigcfg.net");
        driver.findElement(By.id("logonButton")).click();
    }

    public void logIn1wszaLinia() throws InterruptedException {
        if(!driver.findElements(By.id("Ecom_User_ID")).isEmpty()){
            driver.findElement(By.id("Ecom_User_ID")).click();
        }
        else {
            driver.findElement(By.xpath("//div[contains(@title, 'Wyloguj')]")).click();
        }
        driver.findElement(By.id("Ecom_User_ID")).click();
        driver.findElement(By.id("Ecom_User_ID")).sendKeys("kbednarz@pl.aigcfg.net");
        driver.findElement(By.id("logonButton")).click();

    }

    public void logInUprawnienia() {
        if(!driver.findElements(By.id("Ecom_User_ID")).isEmpty()){
            driver.findElement(By.id("Ecom_User_ID")).click();
        }
        else{
            driver.findElement(By.xpath("//div[contains(@title, 'Wyloguj')]")).click();
    }
        driver.findElement(By.id("Ecom_User_ID")).click();
        driver.findElement(By.id("Ecom_User_ID")).sendKeys("mdopierala@pl.aigcfg.net");
        driver.findElement(By.id("logonButton")).click();
    }
    public void logInAdminAplikacji(){
        if(!driver.findElements(By.id("Ecom_User_ID")).isEmpty()){
            driver.findElement(By.id("Ecom_User_ID")).click();
        }
        else{
            driver.findElement(By.xpath("//div[contains(@title, 'Wyloguj')]")).click();
    }
        driver.findElement(By.id("Ecom_User_ID")).click();
        driver.findElement(By.id("Ecom_User_ID")).sendKeys("pmazurek@pl.aigcfg.net");
        driver.findElement(By.id("logonButton")).click();
    }
    public void logInDRSZZIP(){
        if(!driver.findElements(By.id("Ecom_User_ID")).isEmpty()){
            driver.findElement(By.id("Ecom_User_ID")).click();
        }
        else{
            driver.findElement(By.xpath("//div[contains(@title, 'Wyloguj')]")).click();
    }
        driver.findElement(By.id("Ecom_User_ID")).click();
        driver.findElement(By.id("Ecom_User_ID")).sendKeys("jcalka@pl.aigcfg.net");
        driver.findElement(By.id("logonButton")).click();
    }

    public void logInDRSAdmin(){
        if(!driver.findElements(By.id("Ecom_User_ID")).isEmpty()){
            driver.findElement(By.id("Ecom_User_ID")).click();
        }
        else{
            driver.findElement(By.xpath("//div[contains(@title, 'Wyloguj')]")).click();
    }
        driver.findElement(By.id("Ecom_User_ID")).click();
        driver.findElement(By.id("Ecom_User_ID")).sendKeys("rabednarski@pl.aigcfg.net");
        driver.findElement(By.id("logonButton")).click();
    }
    public void logInDRSw3(){
        if(!driver.findElements(By.id("Ecom_User_ID")).isEmpty()){
            driver.findElement(By.id("Ecom_User_ID")).click();
        }
        else{
            driver.findElement(By.xpath("//div[contains(@title, 'Wyloguj')]")).click();
    }
        driver.findElement(By.id("Ecom_User_ID")).click();
        driver.findElement(By.id("Ecom_User_ID")).sendKeys("rkrawiec@pl.aigcfg.net");
        driver.findElement(By.id("logonButton")).click();
    }
    public void logInMenadzerZmian(){
        if(!driver.findElements(By.id("Ecom_User_ID")).isEmpty()){
            driver.findElement(By.id("Ecom_User_ID")).click();
        }
        else{
            driver.findElement(By.xpath("//div[contains(@title, 'Wyloguj')]")).click();
    }
        driver.findElement(By.id("Ecom_User_ID")).click();
        driver.findElement(By.id("Ecom_User_ID")).sendKeys("pmazurek@pl.aigcfg.net");
        driver.findElement(By.id("logonButton")).click();
    }
    public void logInSOC_L1(){
        if(!driver.findElements(By.id("Ecom_User_ID")).isEmpty()){
            driver.findElement(By.id("Ecom_User_ID")).click();
        }
        else{
            driver.findElement(By.xpath("//div[contains(@title, 'Wyloguj')]")).click();
    }
        driver.findElement(By.id("Ecom_User_ID")).click();
        driver.findElement(By.id("Ecom_User_ID")).sendKeys("mciszek@pl.aigcfg.net");
        driver.findElement(By.id("logonButton")).click();
    }
    public void logInSOC_L2(){
        if(!driver.findElements(By.id("Ecom_User_ID")).isEmpty()){
            driver.findElement(By.id("Ecom_User_ID")).click();
        }
        else{
            driver.findElement(By.xpath("//div[contains(@title, 'Wyloguj')]")).click();
    }
        driver.findElement(By.id("Ecom_User_ID")).click();
        driver.findElement(By.id("Ecom_User_ID")).sendKeys("akurczewski@pl.aigcfg.net");
        driver.findElement(By.id("logonButton")).click();
    }
    public void logInSOC_L3(){
        if(!driver.findElements(By.id("Ecom_User_ID")).isEmpty()){
            driver.findElement(By.id("Ecom_User_ID")).click();
        }
        else{
            driver.findElement(By.xpath("//div[contains(@title, 'Wyloguj')]")).click();
    }
        driver.findElement(By.id("Ecom_User_ID")).click();
        driver.findElement(By.id("Ecom_User_ID")).sendKeys("rpiechal@pl.aigcfg.net");
        driver.findElement(By.id("logonButton")).click();
    }

    public void BiezacaGrupaMenadzerZmian(){
        driver.findElement(By.id("currentGroupBox")).click();
        driver.findElement(By.xpath("//div[contains(@value, '0_managerowiezmian')]")).click();

    }

    public void BiezacaGrupaAdministratorzyAplikacji(){
        driver.findElement(By.id("currentGroupBox")).click();
        driver.findElement(By.xpath("//div[contains(@value, 'adminap')]")).click();

    }

    public void BiezacaGrupaSOC_L3(){
        driver.findElement(By.id("currentGroupBox")).click();
        driver.findElement(By.xpath("//div[contains(@value, '0_soc_l3')]")).click();

    }
    public void BiezacaGrupaSOC_L2(){
        driver.findElement(By.id("currentGroupBox")).click();
        driver.findElement(By.xpath("//div[contains(@value, '0_soc_l2')]")).click();

    }
    public void BiezacaGrupaSOC_L1(){
        driver.findElement(By.id("currentGroupBox")).click();
        driver.findElement(By.xpath("//div[contains(@value, '0_soc_l1')]")).click();

    }
    public void BiezacaGrupa1wszaLinia(){
        driver.findElement(By.id("currentGroupBox")).click();
        driver.findElement(By.xpath("//div[contains(@value, '0_I_linia')]")).click();

    }



    public void logOut() {
        driver.findElement(By.xpath("//div[contains(@title, 'Wyloguj')]")).click();
    }

    public void PrzelaczDoWebDeskLubSS() {
        driver.findElement(By.xpath("//div[contains(@title, 'Przełącz do aplikacji Web Desk')]")).click();
    }



    public String zmianaSSnaWD() {
        return driver.getCurrentUrl().replaceAll("/ss/", "/wd/");
    }
    public String zmianaWDnaSS() {return driver.getCurrentUrl().replaceAll("/wd/", "/ss/");}
    public void wprowadzPobranyUrl(String url) {
        driver.get(url);
    }
    public void przelaczDoWeb(){driver.findElement(By.xpath("//div[contains(@title, 'Przełącz do aplikacji Web Desk')]")).click();}

    public void Czekaj() throws InterruptedException {
        Thread.sleep(5000);
    }

    public void Czekaj50() throws InterruptedException {
        Thread.sleep(50000);
    }

    public void set60(){
        //To set browser to default zoom level 100%
        for(int i=0; i<4; i++) {
            driver.findElement(By.tagName("html")).sendKeys(Keys.chord(Keys.CONTROL, Keys.SUBTRACT));
        }

    }

    public void set80(){
        //To set browser to default zoom level 100%
        for(int i=0; i<8; i++) {
            driver.findElement(By.tagName("html")).sendKeys(Keys.chord(Keys.CONTROL, Keys.SUBTRACT));
        }

    }



    public Zgloszenie getZgloszenie() {
        return zgloszenie;
    }
    public Incydent getIncydent() {
        return incydent;
    }

    public Akcja getAkcja() {
        return akcja;
    }

    public Wniosek getWniosek() {
        return wniosek;
    }

    public Kolekcja getKolekcja() {
        return kolekcja;
    }

    public Grupa getGrupa() {
        return grupa;
    }

    public Skrot getSkrot() {
        return skrot;
    }

    public Zadanie getZadanie() {
        return zadanie;
    }
    public Zmiana getZmiana() {
        return zmiana;
    }
}
