
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.Dimension;

import org.openqa.selenium.JavascriptExecutor;

import java.util.*;

public class LoginTestSELENIUMIDE {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;


  @BeforeEach
  public void setUp() {
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @AfterEach
  public void tearDown() {
    driver.quit();
  }

  @Test
  public void login() {
    driver.get("https://demo.guru99.com/test/newtours/");
    driver.manage().window().setSize(new Dimension(1936, 1048));
    driver.findElement(By.name("userName")).click();
    driver.findElement(By.name("userName")).sendKeys("admin");
    driver.findElement(By.name("password")).click();
    driver.findElement(By.name("password")).sendKeys("admin");
    driver.findElement(By.name("submit")).click();
    driver.close();
  }
}
