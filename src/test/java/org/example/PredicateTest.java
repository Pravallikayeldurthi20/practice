package org.example;

import driver.DriverManagement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

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
   @Test
   @DataProvider(name = "co")
   public void applyConditions()
   {
       List<WebElement> links=driver.findElements(By.tagName("a"));
       links.stream().filter().forEach(s-> System.out.println(s));
   }
    @Test
    public void noText()
    {
        Predicate<WebElement> NO_TEXT= s->s.getText().isBlank();
        List<WebElement> links=driver.findElements(By.tagName("a"));
        links.stream().filter(NO_TEXT).forEach(s-> System.out.println(s));

    }
    @AfterClass
    public void closeDriver()
    {
        driver.close();
    }
}
