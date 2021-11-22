package consumer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    WebDriver wedriver;
    public LoginPage(WebDriver driver) {
        //super(driver);
        wedriver=driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(id="input-1")
    private WebElement name;
    @FindBy(id="input-2")
    private WebElement email;
    @FindBy(id="input-3")
    private WebElement password;
    public void enterName()
    {
        System.out.println("entered");
        name.click();
        name.sendKeys("Prava");
    }
    public void enterEmail()
    {
        email.click();
        email.sendKeys("pravallikayeldurthi2010@gmail.com");
    }
    public void enterPassword()
    {
        password.click();
        password.sendKeys("7036828207");
    }
}
