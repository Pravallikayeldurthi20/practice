package org.example;

import driver.DriverManagement;
import org.example.input.DataProvider;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import predicate.Conditions;

import java.util.List;
import java.util.function.Predicate;

public class PredicateTest {
    WebDriver driver;
    DriverManagement driverManagement=new DriverManagement();
    @BeforeClass
    public void setDriver() throws InterruptedException {
        driver=driverManagement.setDriver("chrome");
        driver.get("https://www.google.com/");
        Thread.sleep(500);
    }
   @Test(dataProvider = "conditions", dataProviderClass= DataProvider.class)
   public void applyConditions(Predicate<WebElement> element)
   {
       List<WebElement> links=driver.findElements(By.tagName("a"));
       links.stream().filter(element).forEach(s-> System.out.println(s.getText()));

   }

    @AfterClass
    public void closeDriver()
    {
        driver.close();
    }
}
