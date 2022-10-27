package practise.gui.pages;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends AbstractPage {
    @FindBy(xpath = "//*[text() = 'Username']/../input")
    private ExtendedWebElement usernameInputField;

    @FindBy(xpath = "//*[text() = 'Password']/../input")
    private ExtendedWebElement passwordInputField;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void typeUsername(String name){
        usernameInputField.type(name);
    }

    public void typePassword(String pass){
        passwordInputField.type(pass);
    }
}
