package revature.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static revature.testrunner.TestRunner.url;

public class HomePage {
    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        driver.get(url);
        PageFactory.initElements(driver, this);
    }

    @FindBy(linkText = "Sign in")
    private WebElement loginLink;

    public void clickLogin() {
        loginLink.click();
    }
}
