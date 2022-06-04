package calisma.amazon.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

    @FindBy(id = "nav-link-accountList")
    public WebElement hoverSign;

    @FindBy(xpath = "//div[@id='nav-al-signin']//span[text()='Sign in']")
    public WebElement signClick;

    @FindBy(id="ap_email")
    public WebElement emailInput;

    @FindBy(id= "continue")
    public WebElement cont;

    @FindBy(id = "ap_password")
    public WebElement passwordInput;

//    @FindBy(css = ".submit-button.btn_action")
//    public WebElement loginButton;


//    @FindAll({
//            @FindBy(id = "login-buttonn"),
//            @FindBy(name = "login-button"),
//            @FindBy(xpath = "//input[@data-test='login-button']")
//    })
//    public WebElement loginButton;

//    @FindBys({
//            @FindBy(id = "login-button"),
//            @FindBy(name = "login-button")
//    })
//    public WebElement loginButton;

}
