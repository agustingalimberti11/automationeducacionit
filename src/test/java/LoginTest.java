import org.example.LoginPage;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class LoginTest extends BaseTest{

    @Test
    public void login(){
    LoginPage login = new LoginPage(driver);
    login.logear("agustin", "admin123");
    }

    @Test
    public void loginNoExitoso(){
        LoginPage login = new LoginPage(driver);
        login.logear("admin", "admin");
        assertTrue(login.validarLabelUsuarioContraseñaIncorrecto());
    }
}
