package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage{

    public static final String URL = "https://demo.guru99.com/test/newtours/login.php";

    @FindBy(name = "userName")
    private WebElement campoUsuario;

    @FindBy(name="password")
    private WebElement campoContraseña;

    @FindBy(name = "submit")
    private WebElement botonSubmit;

    @FindBy(xpath = "//span[contains(text(), 'Enter your userName and password correct')]")
    private WebElement labelUserPasswordIncorrect;

    public LoginPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    //metodos

    public void logear(String usuario,String contraseña){
        abrir(URL);
        escribir(campoUsuario, usuario);
        escribir(campoContraseña, contraseña);
        clickear(botonSubmit);
    }

    public boolean validarLabelUsuarioContraseñaIncorrecto(){
        if(estaVisible(labelUserPasswordIncorrect)){
            return true;
        }else {
            return false;
        }
    }
}
