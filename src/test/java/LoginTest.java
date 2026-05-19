import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class LoginTest extends BaseTest{


    @Test
    public void login(){
        driver.findElement(By.name("userName")).sendKeys("admin");
        driver.findElement(By.name("password")).sendKeys("admin");
        driver.findElement(By.name("submit")).click();
    }

    @Test
    public void loginNoExitoso(){
        driver.findElement(By.name("userName")).sendKeys("agustin1234");
        driver.findElement(By.name("password")).sendKeys("kjdsfbnkjfbkjb");
        driver.findElement(By.name("submit")).click();
    }
}
