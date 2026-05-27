package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public abstract class BasePage {

    protected final WebDriver driver;
    protected final WebDriverWait wait;

    protected BasePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    protected void abrir(String url) {
        driver.get(url);
    }

    protected void escribir(WebElement locator, String texto) {
        WebElement el = wait.until(ExpectedConditions.visibilityOf(locator));
        el.clear();
        el.sendKeys(texto);
    }

    protected void clickear(WebElement locator) {
        wait.until(ExpectedConditions.elementToBeClickable(locator)).click();
    }

    protected void seleccionarPorTexto(WebElement locator, String texto) {
        WebElement el = wait.until(ExpectedConditions.visibilityOf(locator));
        new Select(el).selectByVisibleText(texto);
    }

    protected void seleccionarPorValor(WebElement locator, String value) {
        WebElement el = wait.until(ExpectedConditions.visibilityOf(locator));
        new Select(el).selectByValue(value);
    }

    protected boolean estaVisible(WebElement locator) {
        try {
            return wait.until(ExpectedConditions.visibilityOf(locator)).isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    protected void esperarUrlContiene(String fragmento) {
        wait.until(ExpectedConditions.urlContains(fragmento));
    }

    public String tituloPagina() {
        return driver.getTitle();
    }

    public String urlActual() {
        return driver.getCurrentUrl();
    }

    public String textoBody() {
        return driver.getPageSource();
    }
}
