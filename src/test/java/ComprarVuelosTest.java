import org.example.LoginPage;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class ComprarVuelosTest extends BaseTest{


    @Test
    public void login(){
        LoginPage login = new LoginPage(driver);
        login.logear("admin","admin123");
    }


}
