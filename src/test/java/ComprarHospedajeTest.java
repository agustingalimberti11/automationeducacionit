import org.example.LoginPage;
import org.testng.annotations.Test;


public class ComprarHospedajeTest extends BaseTest{


    @Test
    public void login(){
        LoginPage login = new LoginPage(driver);
        login.logear("tiago", "dsasdadassda");
    }


}
