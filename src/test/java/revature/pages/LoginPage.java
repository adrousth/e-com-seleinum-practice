package revature.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage {
    private WebDriver driver;
    private WebDriverWait wdw;


    public LoginPage(WebDriver driver) {
        this.driver = driver;
        this.wdw = new WebDriverWait(driver, Duration.ofSeconds(5));
        PageFactory.initElements(driver, this);
        HomePage homePage = new HomePage(driver);
        homePage.clickLogin();
    }

    @FindBy(id = "email_create")
    WebElement emailCreate;

    @FindBy(id = "SubmitCreate")
    WebElement createAccountButton;


    public void enterEmailForCreateAnAccount(String username) {
        wdw.until(ExpectedConditions.elementToBeClickable(emailCreate));
        emailCreate.sendKeys(username);

    }

    public void clickCreateAccountButton() {
        wdw.until(ExpectedConditions.elementToBeClickable(createAccountButton));
        createAccountButton.click();
    }
}
