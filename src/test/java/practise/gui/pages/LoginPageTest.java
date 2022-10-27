package practise.gui.pages;

import com.qaprosoft.carina.core.foundation.AbstractTest;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class LoginPageTest extends AbstractTest {
    @Test
    public void testTypeUsername() {
        LoginPage loginpage = new LoginPage(getDriver());
        loginpage.open();
        loginpage.typeUsername("iako");
        pause(10);
    }
    @Test
    public void testTypePassword(){
        LoginPage loginpage = new LoginPage(getDriver());
        loginpage.open();
        loginpage.typePassword("intskirveli444");
        pause(10);
    }
}