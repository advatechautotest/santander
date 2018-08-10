package santander.regresion.menadzerAplikacji;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Kolekcja {

    private FirefoxDriver driver;

    public Kolekcja(FirefoxDriver driver) {
        this.driver = driver;
    }
    public void PierwszyElementKolekcji() {
        driver.findElement(By.xpath(".//*[@class='listBody']/tr/td[1]")).click();
    }

    public void Incydent() {
        driver.findElement(By.id("_btn_1")).click();
    }

    public void Wniosek() {
        driver.findElement(By.id("_btn_2")).click();
    }
}
