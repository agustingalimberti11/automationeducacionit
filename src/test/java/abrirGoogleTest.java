import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class abrirGoogleTest {


    public static void main(String[] args) {
        final boolean USER_CHROME_MANUAL = true;

        final String RUTA_CHROMEDRIVER_EXE = "drivers/chromedriver.exe";

        WebDriver driver;

        if (USER_CHROME_MANUAL){
            System.setProperty("webdriver.chrome.driver", RUTA_CHROMEDRIVER_EXE);
            driver = new ChromeDriver();
        }else{
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }
        driver.manage().window().maximize();
        driver.get("https://google.com");
        driver.quit();
    }


}
