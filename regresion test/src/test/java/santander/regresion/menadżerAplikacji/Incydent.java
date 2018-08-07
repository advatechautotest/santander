package santander.regresion.menadżerAplikacji;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;

public class Incydent {


    private FirefoxDriver driver;

    public Incydent(FirefoxDriver driver) {
        this.driver = driver;
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
}

