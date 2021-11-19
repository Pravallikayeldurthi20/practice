package driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class DriverManagement {
    protected WebDriver webDriver;
    public WebDriver setDriver(String driver)
    {
        webDriver=getDriver(driver);
        return webDriver;
    }
    private static final Supplier<WebDriver> CHROME = ()->{
        WebDriverManager.chromedriver().setup();
        return new ChromeDriver();
        };
    private static final Supplier<WebDriver> EDGE = ()->{
        WebDriverManager.edgedriver().setup();
        return new EdgeDriver();
    };
    private static final Map<String,Supplier<WebDriver>> map=new HashMap<>();
    static {
        map.put("chrome",CHROME);
        map.put("edge",EDGE);
    }
    public static WebDriver getDriver(String driver)
    {
        return  map.get(driver).get();
    }

}
