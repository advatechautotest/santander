package santander.regresion.menadzerAplikacji;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Zmiana {
    private FirefoxDriver driver;

    public Zmiana(FirefoxDriver driver) {
        this.driver = driver;
    }

    public void SzablonZmianyDRS_FIX_PILNY_Z3() {
        driver.findElement(By.id("mainForm-_SzablonzmianyDisplay")).sendKeys("DRS_FIX_PILNY_Z3");
        //driver.findElement(By.xpath("//div[contains(@value, '1c1a18fb-e601-43ef-a111-174f6747f6d1')]")).click();

    }
}
