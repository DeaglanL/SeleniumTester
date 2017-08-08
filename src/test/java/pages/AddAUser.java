package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class AddAUser {

    @FindBy(css = "center tr:nth-child(2) td:nth-child(2) a:nth-child(7)")
    private WebElement loginPageButton;

    @FindBy(css = "form center tr:nth-child(3) td:nth-child(2) input[type=\"button\"]")
    private WebElement enterButton;

    @FindBy(css = "form center table td:nth-child(2) input[type=\"password\"]")
    private WebElement passWordInput;

    @FindBy(css = "form center table tr:nth-child(1) td:nth-child(2) input")
    private WebElement userNameInput;

    public void enterUserName(String username){userNameInput.sendKeys(username);}

    public void enterPassword(String password){passWordInput.sendKeys(password);}

    public void clickEnterButton(){enterButton.click();}

    public void clickLoginPageButton(){
        loginPageButton.click();}
}
