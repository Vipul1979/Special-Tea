package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class ResultPage extends Hooks {
    public void SetectedPriceList (){
        List<WebElement> Pricelist = driver.
                findElements(By.cssSelector(".ac-facet__label.ac-facet__label--default"));
        WebElement Price =Pricelist.get(1);
        Price.click();

    }
    public List<Double> CollectedPrice(){
     List<Double> Prices=new ArrayList<Double>();//we have creat emplty array list, here value is in money so that we have use Double
     List<WebElement> Priceslistfor19Item=
             driver.findElements(By.cssSelector(".ac-product-price__amount"));
     for (WebElement PriceList:Priceslistfor19Item){
         String Valueinastring=PriceList.getText().replaceFirst("£" ,"");
         //we are using string and remove £ sign
         //now value 14.99 become string so we need to convert in to double
         double ValueInaDouble=Double.parseDouble(Valueinastring);
         //now we need to add all value in a List
         Prices.add(ValueInaDouble);
         //so that
         System.out.println(Prices);


     }
     return Prices;
    }
}

