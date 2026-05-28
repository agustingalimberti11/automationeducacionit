import org.example.LoginPage;
import org.testng.annotations.Test;

public class ComprarVuelosTest extends BaseTest{


    @Test
    public void login(){
        LoginPage login = new LoginPage(driver);
        login.logear("admin","admin123");
    }


}
