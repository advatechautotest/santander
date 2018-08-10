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

        driver.switchTo().frame("shortcutGroup_20a44b81-8095-4f02-8afd-fb22a2ab8d3f_Items");
        driver.findElement(By.xpath("//span[contains(text(), 'Wnioski')]")).click();
    }
}
