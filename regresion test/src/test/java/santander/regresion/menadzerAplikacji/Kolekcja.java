package santander.regresion.menadzerAplikacji;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Kolekcja {

    private FirefoxDriver driver;
    String numer1;
    String numer2;
    String numer3;

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

    public void SkopiowaneIncydenty() {
        driver.findElement(By.xpath("//div[contains(text(), 'Skopiowane incydenty')]")).click();
        //driver.findElement(By.id("_btn_20")).click();
        driver.findElement(By.xpath(".//*[@id='mainForm-Zapytanie3Body']/tr/td[1]")).click();
    }
    public void ZmianyIncydentow() {
        driver.findElement(By.xpath("//div[contains(text(), 'Zmiany incydentów')]")).click();
        driver.findElement(By.xpath(".//*[@id='mainForm-IncidentChangesBody']/tr/td[1]")).click();
    }

    public void Zadania() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement ZadaniaKolekcja = driver.findElement(By.xpath("//div[contains(text(), 'Zadania')]"));
        js.executeScript("arguments[0].scrollIntoView();", ZadaniaKolekcja);
        driver.findElement(By.xpath("//div[contains(text(), 'Zadania')]")).click();
        //driver.findElement(By.id("_btn_13")).click();
        //JavascriptExecutor js = (JavascriptExecutor) driver;
        //WebElement z1 = driver.findElement(By.xpath(".//*[@id='mainForm-TasksBody']/tr/td[1]"));
        //js.executeScript("arguments[0].scrollIntoView();", z1);
        driver.findElement(By.xpath(".//*[@id='mainForm-TasksBody']/tr/td[1]")).click();
    }

    public void Zadanie2() {
        driver.findElement(By.xpath("//div[contains(text(), 'Zadania')]")).click();
        driver.findElement(By.xpath(".//*[@id='mainForm-TasksBody']/tr[2]/td[2]")).click();
    }
    public void ZadanieZmiany() {
        //driver.findElement(By.id("_btn_3")).click();
        driver.findElement(By.xpath("//div[contains(text(), 'Zadania')]")).click();
        driver.findElement(By.xpath(".//*[@id='mainForm-TasksBody']/tr[1]/td[1]")).click();
    }
    public void ZadanieZmiany2() {
        //driver.findElement(By.id("_btn_3")).click();

        driver.findElement(By.xpath("//div[contains(text(), 'Zadania')]")).click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement ZadaniaZmiany2 = driver.findElement(By.xpath(".//*[@id='mainForm-TasksBody']/tr[2]/td[1]"));
        js.executeScript("arguments[0].scrollIntoView();", ZadaniaZmiany2);
        driver.findElement(By.xpath(".//*[@id='mainForm-TasksBody']/tr[2]/td[1]")).click();
    }
    public void ZadanieZmiany3() {
        //driver.findElement(By.id("_btn_3")).click();
        driver.findElement(By.xpath("//div[contains(text(), 'Zadania')]")).click();
        driver.findElement(By.xpath(".//*[@id='mainForm-TasksBody']/tr[3]/td[1]")).click();
    }
    public void ZadanieZmiany4() {
        //driver.findElement(By.id("_btn_3")).click();
        driver.findElement(By.xpath("//div[contains(text(), 'Zadania')]")).click();
        driver.findElement(By.xpath(".//*[@id='mainForm-TasksBody']/tr[4]/td[1]")).click();
    }
    public void ZadanieZmiany5() {
        //driver.findElement(By.id("_btn_3")).click();
        driver.findElement(By.xpath("//div[contains(text(), 'Zadania')]")).click();
        driver.findElement(By.xpath(".//*[@id='mainForm-TasksBody']/tr[5]/td[1]")).click();
    }
    public void ZadanieZmiany6() {
        //driver.findElement(By.id("_btn_3")).click();
        driver.findElement(By.xpath("//div[contains(text(), 'Zadania')]")).click();
        driver.findElement(By.xpath(".//*[@id='mainForm-TasksBody']/tr[6]/td[1]")).click();
    }
    public void ZadanieZmiany7() {
        //driver.findElement(By.id("_btn_3")).click();
        driver.findElement(By.xpath("//div[contains(text(), 'Zadania')]")).click();
        driver.findElement(By.xpath(".//*[@id='mainForm-TasksBody']/tr[7]/td[1]")).click();
    }
    public void ZadanieZmiany8() {
        //driver.findElement(By.id("_btn_3")).click();
        driver.findElement(By.xpath("//div[contains(text(), 'Zadania')]")).click();
        driver.findElement(By.xpath(".//*[@id='mainForm-TasksBody']/tr[8]/td[1]")).click();
    }
    public void ZadanieZmiany9() {
        //driver.findElement(By.id("_btn_3")).click();
        driver.findElement(By.xpath("//div[contains(text(), 'Zadania')]")).click();
        driver.findElement(By.xpath(".//*[@id='mainForm-TasksBody']/tr[9]/td[1]")).click();
    }
    public void ZadanieZmiany10() {
        //driver.findElement(By.id("_btn_3")).click();
        driver.findElement(By.xpath("//div[contains(text(), 'Zadania')]")).click();
        driver.findElement(By.xpath(".//*[@id='mainForm-TasksBody']/tr[10]/td[1]")).click();
    }
    public void ZadanieZmiany11() {
        //driver.findElement(By.id("_btn_3")).click();
        driver.findElement(By.xpath("//div[contains(text(), 'Zadania')]")).click();
        driver.findElement(By.xpath(".//*[@id='mainForm-TasksBody']/tr[11]/td[1]")).click();
    }

    public void PobierzNumerWniosku() {
        numer1 = driver.findElement(By.id("contentTitleText")).getText().replaceAll("\\D+", "");
        System.out.println(numer1);
    }
    public void PobierzNumerIncydentu() {
        numer2 = driver.findElement(By.id("contentTitleText")).getText().replaceAll("\\D+", "");
        System.out.println(numer2);
    }
    public void PobierzNumerZmiany() {
        numer3 = driver.findElement(By.id("contentTitleText")).getText().replaceAll("\\D+", "");
        System.out.println(numer3);
    }

    public void WstawNumerWniosku() {
        driver.findElement(By.id("list-c0")).click();
        driver.findElement(By.id("list-c0")).sendKeys(numer1);
        driver.findElement(By.id("list-c0")).sendKeys(Keys.ENTER);
    }
    public void WstawNumerIncydentu() {
        driver.findElement(By.id("list-c0")).click();
        driver.findElement(By.id("list-c0")).sendKeys(numer2);
        driver.findElement(By.id("list-c0")).sendKeys(Keys.ENTER);
    }
    public void WstawNumerZmiany() {
        driver.findElement(By.id("list-c0")).click();
        driver.findElement(By.id("list-c0")).sendKeys(numer3);
        driver.findElement(By.id("list-c0")).sendKeys(Keys.ENTER);
    }

    public void ZmianaSzczegolyZmianyPrzyczynaZmiany() {
        //driver.findElement(By.xpath(".//*[@class='tabButtonScrollPanel']/div/div[2]")).click();
        driver.findElement(By.id("_btn_13")).click();
        //driver.findElement(By.id("_btn_14")).click();
        //driver.findElement(By.xpath("//div[contains(text(), 'Szczegóły zmiany')]")).click();
        driver.findElement(By.xpath(".//*[@id='mainForm-ChangeDetailBody']/tr/td[1]")).click();
    }
    public void ZmianaSzczegolyZmianyWplywZmiany() {
        //driver.findElement(By.xpath(".//*[@class='tabButtonScrollPanel']/div/div[2]")).click();
        driver.findElement(By.id("_btn_13")).click();
        //driver.findElement(By.xpath("//div[contains(text(), 'Szczegóły zmiany')]")).click();
        driver.findElement(By.xpath(".//*[@id='mainForm-ChangeDetailBody']/tr[2]/td[1]")).click();
    }
    public void ZmianaSzczegolyZmianySkutkiBrakuRealizacjiZmiany() {
        //driver.findElement(By.xpath(".//*[@class='tabButtonScrollPanel']/div/div[2]")).click();
        driver.findElement(By.id("_btn_13")).click();
        //driver.findElement(By.xpath("//div[contains(text(), 'Szczegóły zmiany')]")).click();
        driver.findElement(By.xpath(".//*[@id='mainForm-ChangeDetailBody']/tr[4]/td[1]")).click();
    }
}
