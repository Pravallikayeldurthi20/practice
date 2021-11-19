package org.example;

import driver.DriverManagement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
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
    public void containsG()
    {
        Predicate<WebElement> CONTAINS_G= s->s.getText().contains("g")||s.getText().contains("G");
        List<WebElement> links=driver.findElements(By.tagName("a"));
        links.stream().filter(CONTAINS_G).forEach(s-> System.out.println(s.getText()));

    }
    @Test
    public void startsWithI()
    {
        Predicate<WebElement> STARTS_WITH_I= s->s.getText().startsWith("i")||s.getText().startsWith("I");
        List<WebElement> links=driver.findElements(By.tagName("a"));
        links.stream().filter(STARTS_WITH_I).forEach(s-> System.out.println(s.getText()));

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
