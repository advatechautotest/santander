package santander.regresion.menadzerAplikacji;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Akcja {

    private FirefoxDriver driver;

    public Akcja(FirefoxDriver driver) {
        this.driver = driver;
    }

    public void ZalozZgloszenie() {
        driver.findElement(By.xpath("//li[contains(text(), 'Załóż zgłoszenie')]")).click();
    }

    public void DodajZalacznik() {
        driver.findElement(By.xpath("//li[contains(text(), 'Dodaj załącznik')]")).click();
    }

    public void DodajNotatke() {
        //driver.findElement(By.xpath("//li[contains(text(), 'Dodaj notatkę')]")).click();
        driver.findElement(By.xpath(".//*[@id='actionPanel']/div[2]/ul/li[4]")).click();
    }

    public void Zamknij() {
        driver.findElement(By.xpath("//li[contains(text(), 'Zamknij')]")).click();
    }

    public void Edytuj() {
        driver.findElement(By.xpath("//li[contains(text(), 'Edytuj')]")).click();
    }

    public void Przejmij() {
        driver.findElement(By.xpath("//li[contains(text(), 'Przejmij')]")).click();
    }

    public void PrzeksztalcwIncydentBezpieczenstwa() {
        driver.findElement(By.xpath("//li[contains(text(), 'Przekształć w incydent bezpieczeństwa')]")).click();
    }

    public void PrzeksztalcWeWniosekoUprawnienia() {
        driver.findElement(By.xpath("//li[contains(text(), 'Przekształć we wniosek o uprawnienia')]")).click();
    }

    public void PrzeksztalcWeWniosek() {
        driver.findElement(By.xpath("//li[contains(text(), 'Przekształć we wniosek')]")).click();
    }

    public void PrzeksztalcwIncydent() {
        driver.findElement(By.xpath("//li[contains(text(), 'Przekształć w incydent')]")).click();
    }
    public void ZglosIncydent() {
        driver.findElement(By.xpath("//li[contains(text(), 'Zgłoś incydent')]")).click();
    }
    public void SkopiujProces() {
        driver.findElement(By.xpath("//li[contains(text(), 'Skopiuj proces')]")).click();
    }
}
