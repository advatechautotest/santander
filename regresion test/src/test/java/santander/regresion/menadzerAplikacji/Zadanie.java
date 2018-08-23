package santander.regresion.menadzerAplikacji;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.util.List;


public class Zadanie {
    private FirefoxDriver driver;

    public Zadanie(FirefoxDriver driver) {
        this.driver = driver;
    }


    public void UzupelnienieZadWniosekoUprawnieniaAKceptacyjne() {

        driver.findElement(By.id("mainForm-Category2Display")).click();
        driver.findElement(By.xpath("//span[contains(text(), 'Zadanie akceptacyjne')]")).click();

        driver.findElement(By.id("mainForm-_SupportGroupDisplay")).click();
        driver.findElement(By.id("mainForm-_SupportGroupDisplay")).sendKeys("Upraw");

        driver.findElement(By.xpath("//div[contains(text(), 'Uprawnienia')]")).click();

        driver.findElement(By.id("mainForm-_Tytuledytowalny2")).sendKeys("Test");
    }

    public void UzupelnienieZadWniosekoUprawnieniaRealizacyjne() {

        driver.findElement(By.id("mainForm-Category2Display")).click();
        driver.findElement(By.xpath("//span[contains(text(), 'Zadanie realizacyjne')]")).click();

        driver.findElement(By.id("mainForm-_SupportGroupDisplay")).click();
        driver.findElement(By.xpath("//div[contains(text(), 'Administratorzy Aplikacji')]")).click();

        driver.findElement(By.id("mainForm-_Tytuledytowalny2")).sendKeys("Test");
    }
    public void UzupelnienieZadIncydentInne(){
        driver.findElement(By.id("mainForm-Category2Display")).click();
        driver.findElement(By.xpath("//span[contains(text(), 'Inne')]")).click();

        driver.findElement(By.id("mainForm-_SupportGroupDisplay")).click();
        driver.findElement(By.xpath("//div[contains(text(), 'I linia')]")).click();

        driver.findElement(By.id("mainForm-_Tytuledytowalny")).sendKeys("Test zadania");
    }
    public void UzupelnienieZadIncydentUser(){
        driver.findElement(By.id("mainForm-Category2Display")).click();
        driver.findElement(By.xpath("//span[contains(text(), 'Inne')]")).click();

        driver.findElement(By.id("mainForm-_SupportGroupDisplay")).click();
        driver.findElement(By.xpath("//div[contains(text(), 'I linia')]")).click();

        driver.findElement(By.id("mainForm-AnalystTitleDisplay")).click();
        driver.findElement(By.xpath("//div[contains(text(), 'Bednarz Krzysztof')]")).click();

        driver.findElement(By.id("mainForm-_Tytuledytowalny")).sendKeys("Test zadania");
    }
    public void UzupelnienieZadIncydentZadAkceptacyjne(){
        driver.findElement(By.id("mainForm-Category2Display")).click();
        driver.findElement(By.xpath("//span[contains(text(), 'Zadanie akceptacyjne')]")).click();

        driver.findElement(By.id("mainForm-_ZadaniedlakoncowegoDisplay")).click();
        driver.findElement(By.xpath("//span[contains(text(), 'Fałsz')]")).click();

        driver.findElement(By.id("mainForm-_SupportGroupDisplay")).click();
        driver.findElement(By.xpath("//div[contains(text(), 'I linia')]")).click();

        driver.findElement(By.id("mainForm-_Tytuledytowalny")).sendKeys("Test zadania");
    }

    public void ZalacznikWniosekTytul() {
        driver.findElement(By.id("mainForm-_Name")).sendKeys("Zadanie tytuł załącznika");

    }

    public void ZalacznikWniosekPlik() {
        File file = new File("attach/santander.txt");
        if (!file.exists()) throw new RuntimeException("file doesn't exist");
        else {
            driver.findElement(By.id("mainForm-_Attachment")).sendKeys(file.getAbsolutePath());
        }
    }
    public void ZalacznikIncydentTytul(){
        driver.findElement(By.id("mainForm-_Tytul")).sendKeys("Zadanie tytuł załącznika");
    }
    public void ZalacznikIncydentPlik(){
        File file = new File("attach/santander.txt");
        if (!file.exists()) throw new RuntimeException("file doesn't exist");
        else {
            driver.findElement(By.id("mainForm-_Dokument")).sendKeys(file.getAbsolutePath());
        }
    }
    public void PowrotDoWnioskuLink(){
        driver.findElement(By.id("mainForm-Request")).click();
    }
    public void PowrotDoIncydentuLink(){driver.findElement(By.id("mainForm-Incident")).click();}
}
