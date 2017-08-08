package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogInPage {

    @FindBy(css = "form center td:nth-child(1) tr:nth-child(1) td:nth-child(2) input")
    private WebElement userNameInput;

    @FindBy(css = "form center td:nth-child(1) tr:nth-child(2) td:nth-child(2) input[type=\"password\"]")
            private WebElement userPasswordInput;

    @FindBy(css = "form center td:nth-child(1) tr:nth-child(3)  td:nth-child(2) input[type=\"button\"]")
            private WebElement enterButton;

    @FindBy(css = "tr  td.auto-style1 big blockquote blockquote font center b")
            private WebElement loginStateText;

    public void enterUserName(String userName){userNameInput.sendKeys(userName);}

    public void  enterPassword(String password){userPasswordInput.sendKeys(password);}

    public void clickEnter(){enterButton.click();}

    public String getLoginStateText(){return loginStateText.getText();}
}
