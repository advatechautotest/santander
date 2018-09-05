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
        File file = new File("regresion test/attach/santander.txt");
        if (!file.exists()) throw new RuntimeException("file doesn't exist");
        else {
            driver.findElement(By.id("mainForm-AttachmentDocument2")).sendKeys(file.getAbsolutePath());
        }
    }

    public void ZalacznikTytulFail() {
        driver.findElement(By.id("mainForm-Title2")).sendKeys("Wniosek Tytuł załącznika");
    }
    public void ZalacznikTytul() {
        //driver.findElement(By.xpath("//span[contains(@id, 'mainForm-Title2')]")).click();
        driver.findElement(By.xpath("//input[contains(@id, 'mainForm-Title2')]")).sendKeys("Wniosek Tytuł załącznika");
    }

    public void NotatkaTytul() {
        driver.findElement(By.id("mainForm-Text3_editor")).sendKeys("Wniosek Testowa notatka");
    }

    public void NotatkaEndUserTytul() {
        driver.findElement(By.id("mainForm-Text10_editor")).sendKeys("Odpowiedź użytkownika końcowego");
    }

    public void AnulujTytul() {
        driver.findElement(By.id("mainForm-FormItemTitle")).sendKeys("Wniosek o uprawnienia anulowano");
    }

    public void Odrzuc() {
        driver.findElement(By.id("mainForm-_ClosureCategoryDisplay")).click();
        driver.findElement(By.xpath("//span[contains(text(), 'Inny')]"));
    }

    public void WniosekZrealizowany() {
        driver.findElement(By.xpath("//li[contains(text(), 'Wniosek zrealizowany')]")).click();
    }

    public void ZamkniecieWniosku() {
        driver.findElement(By.xpath("//*[@id='mainForm-Category2Display' or @id='mainForm-_ClosureCategory2Display']")).click();
        driver.findElement(By.xpath("//span[contains(text(), 'Inny')]")).click();
        driver.findElement(By.xpath("//*[@id='mainForm-Title2' or @id='mainForm-_Details2_editor']")).sendKeys("Wniosek Tytuł zamknięcia");
    }

    public void PoprosoWyjasnieniaWypelnienie() {
        driver.findElement(By.id("mainForm-_KategoriaszablonuodpowiedziDisplay")).click();
        driver.findElement(By.xpath("//span[contains(text(), 'SD')]")).click();
        driver.findElement(By.id("mainForm-_SzablonodpowiedziDisplay")).click();
        driver.findElement(By.xpath("//div[contains(text(), 'Czyszczenie cache przeglądarki Internet Explorer')]")).click();
    }

    public void SkopiujProcesListaProcesow() {
        driver.findElement(By.id("mainForm-FormItemListaprocesowDisplay")).click();
    }

    public void SkopiujProcesListaProcesowIncydent() {
        driver.findElement(By.xpath("//div[contains(@value, 'a3adf87f-77ce-486b-a106-a9a80f2b9b8e')]")).click();
    }

    public void SkopiujProcesListaProcesowIncydentBezpieczenstwa() {
        driver.findElement(By.xpath("//div[contains(@value, 'f7398586-642e-4838-ab1d-a8f3be21b5e7')]")).click();
    }

    public void SkopiujProcesListaProcesowWniosek() {
        driver.findElement(By.xpath("//div[contains(@value, '30cde2dc-03d3-4882-9cd8-8dbf4042324f')]")).click();
    }

    public void SkopiujProcesListaProcesowWniosekoUprawnienia() {
        driver.findElement(By.xpath("//div[contains(@value, '91135d83-54e1-4e5b-b02d-529e62a5ce75')]")).click();
    }
    public void SkopiujProcesSzablonWniosku() {
        driver.findElement(By.id("mainForm-_SzablonwnioskuDisplay")).click();
    }
    public void SkopiujProcesSzablonWnioskuUzupelnij() {
        driver.findElement(By.xpath("//div[contains(@value, 'e46acb61-46d9-482f-afd0-f902f6b4aef3')]")).click();
    }
    public void SkopiujProcesPrzyczyna() {
        driver.findElement(By.id("mainForm-FormItemPrzyczynaskopiowaniaDisplay")).click();
    }
    public void SkopiujProcesPrzyczynaInne() {
        driver.findElement(By.xpath("//span[contains(text(), 'Inne')]")).click();
    }

    public void SkopiujProcesUzasadnienie() {
        driver.findElement(By.id("mainForm-FormItemUzasadnienie_editor")).sendKeys("Uzasadnienie skopiowania procesu");
    }
    public void SkopiujProcesZamknacAutomatycznie() {
        driver.findElement(By.id("mainForm-FormItemZamknacautomatycznieDisplay")).click();
    }
    public void SkopiujProcesZamknacAutomatycznieFalsz() {
        driver.findElement(By.xpath("//div[contains(@value, 'False')]")).click();
    }
    public void SkopiujProcesZamknacAutomatyczniePrawda() {
        driver.findElement(By.xpath("//div[contains(@value, 'True')]")).click();
    }
}
