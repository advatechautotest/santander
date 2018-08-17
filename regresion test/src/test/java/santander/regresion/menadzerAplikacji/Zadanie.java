package santander.regresion.menadzerAplikacji;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;


public class Zadanie {
    private FirefoxDriver driver;

    public Zadanie(FirefoxDriver driver) {
        this.driver = driver;
    }

    public void UzupelnienieZadWniosekoUprawnienia(){
        WebElement select = driver.findElement(By.name("Category"));
        List<WebElement> options = select.findElements(By.tagName("Zadanie akceptacyjne"));
        for(WebElement option : options){
            if(option.getText().equals("Zadanie akceptacyjne")){
                option.click();
                break;
            }
        }

    }
}
