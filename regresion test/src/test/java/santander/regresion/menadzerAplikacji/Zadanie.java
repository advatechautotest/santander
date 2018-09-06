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

        //driver.findElement(By.xpath("//div[contains(@value, '14d87729-b040-4d61-9061-74ed93cd9c85')]")).click();
        driver.findElement(By.xpath("//div[contains(text(), 'Uprawnienia')]")).click();

        driver.findElement(By.xpath("//*[@id='mainForm-_Tytuledytowalny2' or @id='mainForm-Description2_editor']")).sendKeys("Test");

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
        driver.findElement(By.xpath("//div[contains(@value, '3991323e-83b8-482e-9d6c-722af926e01e')]")).click();

        driver.findElement(By.id("mainForm-_Tytuledytowalny")).sendKeys("Test zadania");
    }
    public void UzupelnienieZadIncydentZadAkceptacyjne(){
        driver.findElement(By.id("mainForm-Category2Display")).click();
        driver.findElement(By.xpath("//span[contains(text(), 'Zadanie akceptacyjne')]")).click();

        driver.findElement(By.id("mainForm-_ZadaniedlakoncowegoDisplay")).click();
        driver.findElement(By.xpath("//div[contains(@value, 'False')]")).click();

        driver.findElement(By.id("mainForm-_SupportGroupDisplay")).click();
        driver.findElement(By.xpath("//div[contains(text(), 'I linia')]")).click();

        driver.findElement(By.id("mainForm-_Tytuledytowalny")).sendKeys("Test zadania");
    }
    public void UzupelnienieZadIncydentZadAkceptacyjneEndUser(){
        driver.findElement(By.id("mainForm-Category2Display")).click();
        driver.findElement(By.xpath("//span[contains(text(), 'Zadanie akceptacyjne')]")).click();

        driver.findElement(By.id("mainForm-_ZadaniedlakoncowegoDisplay")).click();
        driver.findElement(By.xpath("//div[contains(@value, 'True')]")).click();

        driver.findElement(By.id("mainForm-_EndUserDisplay")).click();
        driver.findElement(By.xpath("//div[contains(@value, 'c7dce48a-4f9c-4b17-b64f-37ba92a0d0bd')]")).click();

        driver.findElement(By.id("mainForm-_Tytuledytowalny")).sendKeys("Test zadania");
    }
    public void UzupelnienieZadZmianaAwaryjnaInne(){
        driver.findElement(By.id("mainForm-_OwnerGroupDisplay")).click();
        driver.findElement(By.xpath("//div[contains(@value, 'cd4ebe2b-a153-4851-b2c0-647188d27e8e')]")).click();

        driver.findElement(By.id("mainForm-Category2Display")).click();
        driver.findElement(By.xpath("//span[contains(text(), 'Inne')]")).click();

        driver.findElement(By.id("mainForm-_TaskOwnerDisplay")).click();
        driver.findElement(By.xpath("//div[contains(@value, '0777fea4-30ca-411d-8993-647e07a4cb8d')]")).click();

        driver.findElement(By.id("mainForm-_Tytuledytowalny")).sendKeys("Test zadania");
    }
    public void UzupelnienieZadZmianaAwaryjnaAkceptacyjne(){
        driver.findElement(By.id("mainForm-_OwnerGroupDisplay")).click();
        driver.findElement(By.xpath("//div[contains(@value, 'cd4ebe2b-a153-4851-b2c0-647188d27e8e')]")).click();

        driver.findElement(By.id("mainForm-Category2Display")).click();
        //driver.findElement(By.xpath("//span[contains(text(), 'Zadanie akceptacyjne')]")).click();
        driver.findElement(By.xpath("//div[contains(@value, '5169023c-5370-492b-9b11-9d372e8600d5')]")).click();

        driver.findElement(By.id("mainForm-_TaskOwnerDisplay")).click();
        driver.findElement(By.xpath("//div[contains(@value, '0777fea4-30ca-411d-8993-647e07a4cb8d')]")).click();

        driver.findElement(By.id("mainForm-_Tytuledytowalny")).sendKeys("Test zadania");
    }
    public void UzupelnienieZadZmianaDodajCzlonkaCAB(){


        driver.findElement(By.id("mainForm-_OwnerGroupDisplay")).sendKeys("Managerowie zmian");
        driver.findElement(By.xpath("//div[contains(@value, 'e649946c-9a59-45cd-894a-b2c3d3518e74')]")).click();

        driver.findElement(By.id("mainForm-Category2Display")).click();
        //driver.findElement(By.id("mainForm-Category2Display")).sendKeys("Zadanie akceptacyjne");
        //driver.findElement(By.xpath("//span[contains(text(), 'Zadanie akceptacyjne')]")).click();
        driver.findElement(By.xpath("//div[contains(@value, '5169023c-5370-492b-9b11-9d372e8600d5')]")).click();





        //driver.findElement(By.id("mainForm-_TaskOwnerDisplay")).click();
        //driver.findElement(By.xpath("//div[contains(@value, '0777fea4-30ca-411d-8993-647e07a4cb8d')]")).click();

        driver.findElement(By.id("mainForm-_Tytuledytowalny")).sendKeys("Test zadania zmiany Dodawanie czlonkow CAB");
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
    public void PowrotDoZmianyLink(){driver.findElement(By.id("mainForm-Change")).click();}

    public void UzupelnienieZadZmianaDRSZZIP(){
        //Kategoria zadania
        driver.findElement(By.id("mainForm-Category2Display")).click();
        driver.findElement(By.xpath("//span[contains(text(), 'Inne')]")).click();
        //Zadanie dla grupy
        driver.findElement(By.id("mainForm-_OwnerGroupDisplay")).click();
        driver.findElement(By.xpath("//div[contains(@value, 'e5c28c67-fff5-4d8c-b3d4-95ac4c1773ee')]")).click();
        //Zadanie dla serwisanta
        driver.findElement(By.id("mainForm-_TaskOwnerDisplay")).click();
        //Obczaic pozniej aktualny = driver.findElement(By.xpath("//div[contains(@value, 'e1b847e4-3e78-4765-85bf-aff934123718')]")).click();
        driver.findElement(By.xpath("//div[contains(@value, 'e1b847e4-3e78-4765-85bf-aff934123718')]")).click();

        driver.findElement(By.id("mainForm-_Tytuledytowalny")).sendKeys("Test zadania zmiany");
    }
}

