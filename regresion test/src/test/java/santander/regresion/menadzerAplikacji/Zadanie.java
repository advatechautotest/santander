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

    public void ZalacznikTytul() {
        driver.findElement(By.id("mainForm-_Name")).sendKeys("Zadanie tytuł załącznika");

    }

    public void ZalacznikPlik() {
        File file = new File("attach/santander.txt");
        if (!file.exists()) throw new RuntimeException("file doesn't exist");
        else {
            driver.findElement(By.id("mainForm-_Attachment")).sendKeys(file.getAbsolutePath());
        }
    }
    public void PowrotDoWniosku(){
        driver.findElement(By.id("mainForm-Request")).click();
    }
}
