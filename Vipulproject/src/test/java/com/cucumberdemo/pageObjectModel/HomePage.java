package com.cucumberdemo.pageObjectModel;

import com.cucumberdemo.factory.DriverFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends DriverFactory {
    @FindBy(id = "searchTerm")
    WebElement searchbox;

    @FindBy(css = "._2mKaC")
    WebElement magnifyglass;

    public String getHomePageUrl(){
        return driver.getCurrentUrl();
    }
    public void doSearch(String item){
        searchbox.sendKeys(item);
        magnifyglass.click();
    }
}
