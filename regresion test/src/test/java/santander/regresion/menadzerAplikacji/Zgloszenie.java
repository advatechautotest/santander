package santander.regresion.menadzerAplikacji;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;

public class Zgloszenie {
   private FirefoxDriver driver;

    public Zgloszenie(FirefoxDriver driver) {
        this.driver = driver;
    }

    public void ZalacznikPlik() {
        File file = new File("attach/santander.txt");
        if(!file.exists())throw new RuntimeException("file doesn't exist");
        else { driver.findElement(By.id("mainForm-AttachmentDocument")).sendKeys(file.getAbsolutePath()); }
    }

    public void ZalacznikTytul() {
        driver.findElement(By.id("mainForm-Title")).sendKeys("Tytuł załącznika");
    }

    public void NotatkaTytul() {
        driver.findElement(By.id("mainForm-Text4_editor")).sendKeys("Testowa notatka");
    }

    public void Tytul() {
        driver.findElement(By.id("mainForm-_Tytuledytowalny")).sendKeys("Testowy temat");
    }

    public void ZamknijTytul() {
        driver.findElement(By.id("mainForm-Title2")).sendKeys("Testowy tytuł");
    }

    public void Opis() {
        driver.findElement(By.id("mainForm-Description2_editor")).sendKeys("Opis zedytowany");
    }
}
