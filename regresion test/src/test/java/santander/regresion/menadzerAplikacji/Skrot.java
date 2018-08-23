package santander.regresion.menadzerAplikacji;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Skrot {
   private FirefoxDriver driver;

   public Skrot(FirefoxDriver driver){
       this.driver = driver;
   }


    public void Wnioski() {
       // driver.findElement(By.xpath("//div[@class='shortcutGroupPanel']/'Wnioski')]")).click();
        driver.findElement(By.id("shortcutItem_0dfc851f-a6bd-438d-916c-833d48593a20")).click();
        //driver.switchTo().frame(driver.findElement(By.xpath("//li[contains(text(), 'Wnioski')]")));
        //driver.findElement(By.xpath("//li[contains(text(), 'Wnioski')]")).click();
        //driver.findElement(By.xpath("//div[contains(@class='shortcutItem')]/[contains(text(), 'Wnioski')]"));
    }
    public void Incydent(){
        driver.findElement(By.id("shortcutItem_edaaa4e6-ca96-4fb8-aff2-7b294c612f3a")).click();
    }
    public void Zmiany(){
        driver.findElement(By.id("shortcutItem_fa2a37ab-f694-4441-be2d-674187a0c0dd")).click();
    }
    public void ZmianaStandardowa() {
        driver.findElement(By.id("shortcutItem_737a7664-a891-45d1-9c40-7aad58440b2c")).click();
    }
}
