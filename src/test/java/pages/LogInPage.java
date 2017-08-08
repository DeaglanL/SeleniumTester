package pages;

import Testing.Tools;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Wait;

import java.util.function.Function;

public class LogInPage {

    Tools t = new Tools();

    @FindBy(css = "form center td:nth-child(1) tr:nth-child(1) td:nth-child(2) input")
    private WebElement userNameInput;

    @FindBy(css = "form center td:nth-child(1) tr:nth-child(2) td:nth-child(2) input[type=\"password\"]")
            private WebElement userPasswordInput;

    @FindBy(css = "form center td:nth-child(1) tr:nth-child(3)  td:nth-child(2) input[type=\"button\"]")
            private WebElement enterButton;

    @FindBy(css = "tr  td.auto-style1 big blockquote blockquote font center b")
            private WebElement loginStateText;

    public void enterUserName(String userName, WebDriver w){
        t.waitToLoad(w, "form center td:nth-child(1) tr:nth-child(1) td:nth-child(2) input");


        userNameInput.sendKeys(userName);}

    public void  enterPassword(String password, WebDriver w){
        t.waitToLoad(w, "form center td:nth-child(1) tr:nth-child(2) td:nth-child(2) input[type=\"password\"]");

        userPasswordInput.sendKeys(password);}

    public void clickEnter(WebDriver w){
        t.waitToLoad(w, "form center td:nth-child(1) tr:nth-child(3)  td:nth-child(2) input[type=\"button\"]");
        enterButton.click();}

    public String getLoginStateText(WebDriver w){
        t.waitToLoad(w, "tr  td.auto-style1 big blockquote blockquote font center b");

        return loginStateText.getText();}


}
