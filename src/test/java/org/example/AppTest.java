package org.example;
import static org.testng.AssertJUnit.assertTrue;

import consumer.LoginConsumer;
import consumer.LoginPage;
import driver.DriverManagement;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.example.input.DataProvider;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.function.Consumer;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
   DriverManagement driverManagement =new DriverManagement();
    WebDriver driver=driverManagement.setDriver("chrome");
    @Test
    public void setWebDriver() throws InterruptedException {

       Thread.sleep(500);
       driver.close();

    }
    @Test(dataProvider = "consumerConditions" , dataProviderClass = DataProvider.class)
    public void g(Consumer<LoginPage> con) throws InterruptedException {
        driver.get("https://www.hackerrank.com/auth/signup");
        Thread.sleep(500);
        LoginPage loginPage=new LoginPage(driver);
        con.accept(loginPage);

    }
}
