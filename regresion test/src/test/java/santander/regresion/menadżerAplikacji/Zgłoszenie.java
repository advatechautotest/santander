package santander.regresion.menadżerAplikacji;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;

public class Zgłoszenie {
   private FirefoxDriver driver;

    public Zgłoszenie(FirefoxDriver driver) {
        this.driver = driver;
    }

    public void zgłoszenieZałącznikPlik() {
        File file = new File("regresion test/attach/santander.txt");
        if(!file.exists())throw new RuntimeException("file doesn't exist");
        else { driver.findElement(By.id("mainForm-AttachmentDocument")).sendKeys(file.getAbsolutePath()); }
    }

    public void zgłoszenieZałącznikTytuł() {
        driver.findElement(By.id("mainForm-Title")).sendKeys("Tytuł załącznika");
    }

    public void zgłoszenieNotatkaTytuł() {
        driver.findElement(By.id("mainForm-Text4_editor")).sendKeys("Testowa notatka");
    }

    public void zgłoszenieTytuł() {
        driver.findElement(By.id("mainForm-_Tytuledytowalny")).sendKeys("Testowy temat");
    }

    public void zgłoszenieZamknijTytuł() {
        driver.findElement(By.id("mainForm-Title2")).sendKeys("Testowy tytuł");
    }

    public void zgłoszenieOpisEdycja() {
        driver.findElement(By.id("mainForm-Description2_editor")).sendKeys("Opis zedytowany");
    }
}
