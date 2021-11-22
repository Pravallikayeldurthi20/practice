package consumer;

import org.openqa.selenium.WebDriver;

public class Screens {
    protected final WebDriver driver;
    public Screens(WebDriver driver)
    {
        this.driver=driver;
    }
    public WebDriver getDriver()
    {
        return this.driver;
    }

}
