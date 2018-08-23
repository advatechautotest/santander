package santander.regresion.menadzerAplikacji;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Grupa {
    private FirefoxDriver driver;
    public Grupa(FirefoxDriver driver) {
        this.driver = driver;
    }

    public void Wyszukaj() {
        driver.findElement(By.id("shortcutGroup_20a44b81-8095-4f02-8afd-fb22a2ab8d3f")).click();

    }
}
