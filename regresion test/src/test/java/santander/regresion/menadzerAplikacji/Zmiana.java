package santander.regresion.menadzerAplikacji;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Zmiana {
    private FirefoxDriver driver;

    public Zmiana(FirefoxDriver driver) {
        this.driver = driver;
    }

    public void typZmianyStandardowa(){
        driver.findElement(By.id("mainForm-_ChangeType1Display")).click();
        driver.findElement(By.xpath("//div[contains(@value, '1fed8117-0c67-4f52-9b58-2ae8d02a3bc2')]")).click();
    }

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
        driver.findElement(By.xpath("//div[contains(@value, '8311f678-e406-429a-94d0-38bfd126ac54')]")).click();
    }
}

