package pages;


import Testing.Tools;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Wait;

import java.util.function.Function;


public class AddAUser {

    Tools t = new Tools();

    @FindBy(css = "center tr:nth-child(2) td:nth-child(2) a:nth-child(7)")
    private WebElement loginPageButton;

    @FindBy(css = "form tr td:nth-child(1) tr:nth-child(3) td:nth-child(2) input[type=\"button\"]")
    private WebElement enterButton;

    @FindBy(css = "form center table td:nth-child(2) input[type=\"password\"]")
    private WebElement passWordInput;

    @FindBy(css = "form center table tr:nth-child(1) td:nth-child(2) input")
    private WebElement userNameInput;

    public void enterUserName(String username, WebDriver w){
        t.waitToLoad(w, "form center table tr:nth-child(1) td:nth-child(2) input");

        userNameInput.sendKeys(username);}

    public void enterPassword(String password, WebDriver w){
        t.waitToLoad(w, "form center table td:nth-child(2) input[type=\"password\"]");

        passWordInput.sendKeys(password);}

    public void clickEnterButton(WebDriver w){
        t.waitToLoad(w, "form tr td:nth-child(1) tr:nth-child(3) td:nth-child(2) input[type=\"button\"]");


        enterButton.click();}

    public void clickLoginPageButton(WebDriver w){
        t.waitToLoad(w, "center tr:nth-child(2) td:nth-child(2) a:nth-child(7)");

        loginPageButton.click();}


}
