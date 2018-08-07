package santander.regresion.menadżerAplikacji;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Akcja {

    private FirefoxDriver driver;

    public Akcja(FirefoxDriver driver) {
        this.driver = driver;
    }

    public void akcjaZałóżZgłoszenie() {
        driver.findElement(By.xpath("//li[contains(text(), 'Załóż zgłoszenie')]")).click();
    }

    public void akcjaDodajZałącznik() {
        driver.findElement(By.xpath("//li[contains(text(), 'Dodaj załącznik')]")).click();
    }

    public void akcjaDodajNotatkę() {
        driver.findElement(By.xpath("//li[contains(text(), 'Dodaj notatkę')]")).click();
    }

    public void akcjaZamknij() {
        driver.findElement(By.xpath("//li[contains(text(), 'Zamknij')]")).click();
    }

    public void akcjaEdytuj() {
        driver.findElement(By.xpath("//li[contains(text(), 'Edytuj')]")).click();
    }

    public void akcjaPrzejmij() {
        driver.findElement(By.xpath("//li[contains(text(), 'Przejmij')]")).click();
    }

    public void akcjaPrzekształćwIncydentBezpieczeństwa() {
        driver.findElement(By.xpath("//li[contains(text(), 'Przekształć w incydent bezpieczeństwa')]")).click();
    }

    public void akcjaPrzekształćWeWniosekoUprawnienia() {
        driver.findElement(By.xpath("//li[contains(text(), 'Przekształć we wniosek o uprawnienia')]")).click();
    }

    public void akcjaPrzekształćWeWniosek() {
        driver.findElement(By.xpath("//li[contains(text(), 'Przekształć we wniosek')]")).click();
    }

    public void akcjaPrzekształćwIncydent() {
        driver.findElement(By.xpath("//li[contains(text(), 'Przekształć w incydent')]")).click();
    }
    public void akcjaZgłośIncydent() {
        driver.findElement(By.xpath("//li[contains(text(), 'Zgłoś incydent')]")).click();
    }
}
