package santander.regresion.menadżerAplikacji;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
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
    public void incydentOpisEdycja() {
        driver.findElement(By.id("mainForm-Description_editor")).sendKeys(Keys.chord(Keys.LEFT_CONTROL, "a"));
        driver.findElement(By.id("mainForm-Description_editor")).sendKeys(Keys.DELETE);
        driver.findElement(By.id("mainForm-Description_editor")).sendKeys("Edycja opisu w incydencie");
    }
    public void incydentSkopiujProcesListaProcesów() {
        driver.findElement(By.id("mainForm-_ListaprocesowDisplay")).click();
    }
    public void incydentSkopiujProcesListaProcesówIncydent() {
        driver.findElement(By.xpath("//div[contains(@value, 'a3adf87f-77ce-486b-a106-a9a80f2b9b8e')]")).click();
    }
    public void incydentSkopiujProcesListaProcesówIncydentBezpieczństwa() {
        driver.findElement(By.xpath("//div[contains(@value, 'f7398586-642e-4838-ab1d-a8f3be21b5e7')]")).click();
    }
    public void incydentSkopiujProcesPrzyczyna() {
        driver.findElement(By.id("mainForm-_PrzyczynaskopiowaniaDisplay")).click();
        //driver.findElement(By.id("control-wrapper-mainForm-_Przyczynaskopiowania")).click();
    }
    public void incydentSkopiujProcesPrzyczynaInne() {
        driver.findElement(By.xpath("//span[contains(text(), 'Inne')]")).click();
        //driver.findElement(By.xpath("//div[contains(@value, 'ecca5084-8e0b-485c-9762-53307be1f85f')]/..")).click();
       //driver.findElement(By.cssSelector("div[params*='Inne']")).click();
        //driver.findElement(By.xpath("//div[contains(text(), 'Inne')]/..")).click();
    }
    public void incydentSkopiujProcesUzasadnienie() {
        driver.findElement(By.id("mainForm-_Uzasadnienie2_editor")).sendKeys("Uzasadnienie skopiowania procesu");
    }
    public void incydentSkopiujProcesZamknąćAutomatycznie() {
        driver.findElement(By.id("mainForm-_ZamknacautomatycznieDisplay")).click();
    }
    public void incydentSkopiujProcesZamknąćAutomatycznieFałsz() {
        driver.findElement(By.xpath("//div[contains(@value, 'False')]")).click();
    }

}

