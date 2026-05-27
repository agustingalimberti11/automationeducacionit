import org.example.LoginPage;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class ComprarHospedajeTest extends BaseTest{


    @Test
    public void login(){
        LoginPage login = new LoginPage(driver);
        login.logear("tiago", "dsasdadassda");
    }


}
