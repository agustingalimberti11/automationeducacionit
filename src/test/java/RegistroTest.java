import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;


public class RegistroTest extends BaseTest{

    @Test
    public void registro(){
        driver.findElement(By.name("userName")).sendKeys("admin");
        driver.findElement(By.name("password")).sendKeys("admin");
        driver.findElement(By.name("submit")).click();
        driver.findElement(By.linkText("REGISTER")).click();
        driver.findElement(By.name("firstName")).sendKeys("agustin");
        driver.findElement(By.name("lastName")).sendKeys("galimberti");
        driver.findElement(By.name("phone")).sendKeys("123456789");
        driver.findElement(By.id("userName")).sendKeys("agustin@gmail.com");
        driver.findElement(By.name("address1")).sendKeys("calle 123");
        driver.findElement(By.name("city")).sendKeys("La Rioja");
        driver.findElement(By.name("state")).sendKeys("5300");

        WebElement comboBoxPais = driver.findElement(By.name("country"));
        Select cmbPais = new Select(comboBoxPais);
        cmbPais.selectByValue("ARGENTINA");

        driver.findElement(By.id("email")).sendKeys("agustingalimberti");
        driver.findElement(By.name("password")).sendKeys("admin");
        driver.findElement(By.name("confirmPassword")).sendKeys("admin");
        driver.findElement(By.className("cb-close")).click();
        driver.findElement(By.name("submit")).click();

        String textoBienvnida = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[1]/font/b")).getText();
        if(textoBienvnida.equals("Dear agustin galimberti,")){
            System.out.println("Test exitoso");
        }else{
            System.out.println("ERROR: NO SE VISUALIZA MENSAJE DE BIENVENIDA");
        }
    }

    @Test
    public void registroConDatosMinimos(){
        driver.findElement(By.name("userName")).sendKeys("admin");
        driver.findElement(By.name("password")).sendKeys("admin");
        driver.findElement(By.name("submit")).click();
        driver.findElement(By.linkText("REGISTER")).click();
        driver.findElement(By.name("firstName")).sendKeys("agustin");
        driver.findElement(By.name("lastName")).sendKeys("galimberti");
        driver.findElement(By.id("email")).sendKeys("agustingalimberti");
        driver.findElement(By.name("password")).sendKeys("admin");
        driver.findElement(By.name("confirmPassword")).sendKeys("admin");
        driver.findElement(By.name("submit")).click();
        String textoBienvnida = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[1]/font/b")).getText();
        if(textoBienvnida.equals("Dear agustin galimberti,")){
            System.out.println("Test exitoso");
        }else{
            System.out.println("ERROR: NO SE VISUALIZA MENSAJE DE BIENVENIDA");
        }
    }

}
