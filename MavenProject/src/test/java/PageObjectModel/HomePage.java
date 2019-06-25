package PageObjectModel;


import org.openqa.selenium.By;

public class HomePage extends Hooks {
    public void dosearch(String item) {
        driver.findElement(By.id("searchTerm")).sendKeys("nike");
        driver.findElement(By.className("_2mKaC")).click();

    }
}

