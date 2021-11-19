package org.example;
import static org.testng.AssertJUnit.assertTrue;

import driver.DriverManagement;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
   DriverManagement driverManagement =new DriverManagement();
    @Test
    public void setWebDriver() throws InterruptedException {
       WebDriver driver=driverManagement.setDriver("chrome");
       Thread.sleep(500);
       driver.close();

    }
}
