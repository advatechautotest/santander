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
}
