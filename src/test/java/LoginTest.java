import org.example.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class LoginTest extends BaseTest{
    @Test
    public void login(){
    LoginPage login = new LoginPage(driver);
    login.logear("agustin", "admin123");
    }

    @Test
    public void loginNoExitoso(){
        LoginPage login = new LoginPage(driver);
        login.logear("admin", "safsdfsdf323233");
        Assert.assertTrue(login.validarLabelUsuarioContraseñaIncorrecto());
    }
}
