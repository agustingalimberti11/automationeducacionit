import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

    WebDriver driver;


    @BeforeEach
    public void setuUp(){


        final boolean USER_CHROME_MANUAL = true;

        final String RUTA_CHROMEDRIVER_EXE = "drivers/chromedriver.exe";

        if (USER_CHROME_MANUAL){
            System.setProperty("webdriver.chrome.driver", RUTA_CHROMEDRIVER_EXE);
            driver = new ChromeDriver();
        }else{
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }
        driver.manage().window().maximize();
        driver.get("https://demo.guru99.com/test/newtours/");
    }


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


    @AfterEach
    public void tearDown(){
        driver.quit();
    }


}
