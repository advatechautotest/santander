package santander.regresion.menadzerAplikacji;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Kolekcja {

    private FirefoxDriver driver;
    String numer;

    public Kolekcja(FirefoxDriver driver) {
        this.driver = driver;
    }
    public void PierwszyElementKolekcji() {
        driver.findElement(By.xpath(".//*[@class='listBody']/tr/td[2]")).click();
    }

    public void Incydent() {
        driver.findElement(By.id("_btn_1")).click();
    }

    public void Wniosek() {
        driver.findElement(By.id("_btn_2")).click();
    }
    public void SkopiowaneIncydenty(){
        driver.findElement(By.id("_btn_20")).click();
        driver.findElement(By.xpath(".//*[@id='mainForm-Zapytanie3Body']/tr/td[1]")).click();
    }
    public void Zadanie(){
        driver.findElement(By.id("_btn_14")).click();
        driver.findElement(By.xpath(".//*[@id='mainForm-TasksBody']/tr/td[1]")).click();
    }
    public void Zadanie2(){
        driver.findElement(By.id("_btn_21")).click();
        driver.findElement(By.xpath(".//*[@id='mainForm-TasksBody']/tr[2]/td[2]")).click();
    }
    public void PobierzNumerWniosku() {
        numer =driver.findElement(By.id("contentTitleText")).getText().replaceAll("\\D+","");
        System.out.println(numer);
    }
    public void WstawNumerWniosku() {
        driver.findElement(By.id("list-c0")).click();
        driver.findElement(By.id("list-c0")).sendKeys(numer);
        driver.findElement(By.id("list-c0")).sendKeys(Keys.ENTER);
    }
}
