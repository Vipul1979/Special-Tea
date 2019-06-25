package PageObjectModel1;

import org.openqa.selenium.By;

public class Homepage1 extends Hooks1{
    public void dosearch(String item){
        driver.findElement(By.id("searchTerm")).sendKeys("nike");
        driver.findElement(By.className("_2mKaC")).click();
    }
}
