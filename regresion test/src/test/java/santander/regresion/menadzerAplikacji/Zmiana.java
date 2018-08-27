package santander.regresion.menadzerAplikacji;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;

public class Zmiana {
    private FirefoxDriver driver;

    public Zmiana(FirefoxDriver driver) {
        this.driver = driver;
    }

    public void typZmianyStandardowa(){
        driver.findElement(By.id("mainForm-_ChangeType1Display")).click();
        driver.findElement(By.xpath("//div[contains(@value, '1fed8117-0c67-4f52-9b58-2ae8d02a3bc2')]")).click(); }

    public void SzablonZmianyDRS_FIX_PILNY_Z3() {
        driver.findElement(By.id("mainForm-_SzablonzmianyDisplay")).sendKeys("DRS_FIX_PILNY_Z3");
        //driver.findElement(By.id("mainForm-_SzablonzmianyDisplay")).click();
        //driver.findElement(By.id("mainForm-_SzablonzmianyDisplay")).sendKeys(Keys.ENTER);

        driver.findElement(By.xpath("//div[contains(@value, '1c1a18fb-e601-43ef-a111-174f6747f6d1')]")).click();
    }
    public void SzczegolyZmianyPrzyczynaZmianySzczegolyEdycja() {
        driver.findElement(By.id("mainForm-_Details2_editor")).sendKeys(Keys.chord(Keys.LEFT_CONTROL, "a"));
        driver.findElement(By.id("mainForm-_Details2_editor")).sendKeys(Keys.DELETE);
        driver.findElement(By.id("mainForm-_Details2_editor")).sendKeys("edycja przyczyna zmiany");

    }
    public void SzczegolyZmianyWplywZmianySzczegolyEdycja() {
        driver.findElement(By.id("mainForm-_Details2_editor")).sendKeys(Keys.chord(Keys.LEFT_CONTROL, "a"));
        driver.findElement(By.id("mainForm-_Details2_editor")).sendKeys(Keys.DELETE);
        driver.findElement(By.id("mainForm-_Details2_editor")).sendKeys("edycja wplyw zmiany");

    }
    public void SzczegolyZmianySkutkiBrakuRealizacjiZmianySzczegolyEdycja() {
        driver.findElement(By.id("mainForm-_Details2_editor")).sendKeys(Keys.chord(Keys.LEFT_CONTROL, "a"));
        driver.findElement(By.id("mainForm-_Details2_editor")).sendKeys(Keys.DELETE);
        driver.findElement(By.id("mainForm-_Details2_editor")).sendKeys("edycja brak realizacji zmiany");

    }
    public void KategoriaZamknieciaZmiany(){
        driver.findElement(By.id("mainForm-_ChangeClosureCategoryDisplay")).click();
        driver.findElement(By.xpath("//div[contains(@value, '8311f678-e406-429a-94d0-38bfd126ac54')]")).click(); }

    public void NotatkaZadanieTytul() {
        driver.findElement(By.id("mainForm-Text_editor")).sendKeys("Testowa notatka do zadania");
    }
    public void ZalacznikZadanieTytul() {
        driver.findElement(By.id("mainForm-Title2")).sendKeys("Tytuł załącznika");
    }
    public void ZalacznikZadaniePlik() {
        File file = new File("regresion test/attach/santander.txt");
        if(!file.exists())throw new RuntimeException("file doesn't exist");
        else { driver.findElement(By.id("mainForm-AttachmentDocument2")).sendKeys(file.getAbsolutePath()); }
    }
    public void ZalacznikZmianaZadanieTytul() {
        driver.findElement(By.id("mainForm-_Tytul")).sendKeys("Tytuł załącznika");
    }
    public void ZalacznikZmianaZadaniePlik() {
        File file = new File("regresion test/attach/santander.txt");
        if(!file.exists())throw new RuntimeException("file doesn't exist");
        else { driver.findElement(By.id("mainForm-_Plik")).sendKeys(file.getAbsolutePath()); }
    }
    public void ZmianaPowiodlaSieUzupelnij(){
        driver.findElement(By.id("mainForm-Title")).sendKeys("Zmiana powiodła się");
        driver.findElement(By.id("mainForm-CategoryNameDisplay")).click();
        driver.findElement(By.xpath("//span[contains(text(), 'Inne')]")).click();
    }
    public void ZmianaNiePowiodlaSieUzupelnij(){
        driver.findElement(By.id("mainForm-_RollOutFailed")).sendKeys("Zmiana nie powiodła się");

    }
    public void ZamknijZmianeUzupelnij(){
        driver.findElement(By.id("mainForm-Title")).sendKeys("Zamknij Zmianę");
        driver.findElement(By.id("mainForm-CategoryNameDisplay")).click();
        driver.findElement(By.xpath("//span[contains(text(), 'Zmiana nie powiodła się')]")).click();
    }
}

