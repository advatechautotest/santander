package santander.regresion.menadzerAplikacji;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;

public class Wniosek {
    private FirefoxDriver driver;

    public Wniosek(FirefoxDriver driver) {
        this.driver = driver;
    }

    public void ZalacznikPlik() {
        File file = new File("attach/santander.txt");
        if(!file.exists())throw new RuntimeException("file doesn't exist");
        else { driver.findElement(By.id("mainForm-AttachmentDocument2")).sendKeys(file.getAbsolutePath());}
    }

    public void ZalacznikTytul() {
        driver.findElement(By.id("mainForm-Title2")).sendKeys("Wniosek Tytuł załącznika");
    }
    public void NotatkaTytul() {
        driver.findElement(By.id("mainForm-Text3_editor")).sendKeys("Wniosek Testowa notatka");
    }
    public void AnulujTytul() {
        driver.findElement(By.id("mainForm-FormItemTitle")).sendKeys("Wniosek o uprawnienia anulowano");
    }
    public void Odrzuc() {
        driver.findElement(By.id("mainForm-_ClosureCategoryDisplay")).click();
        driver.findElement(By.xpath("//span[contains(text(), 'Inny')]"))
    }
}
