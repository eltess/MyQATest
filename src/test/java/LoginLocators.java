import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginLocators extends BasePage{

    public LoginLocators(WebDriver driver) {
        super (driver);
    }

    public WebElement formAuthentication() {
        return findElementByXpath("//a[text()='Form Authentication']");
    }

    public WebElement formAuthenticationUseName() {
        return findElementByXpath("//input[@id='username']");
    }

    public WebElement formAuthenticationUsePassword() {
        return findElementByXpath("//input[@id='password']");
    }

    public WebElement formAuthenticationButton() {
        return findElementByXpath("//button[@class='radius']");
    }

    public WebElement formAuthenticationCheck() {
        return findElementByXpath("//div[@id='flash']");
    }

    public WebElement formAuthenticationLogout() {
        return findElementByXpath("//a[@class='button secondary radius']");
    }
}