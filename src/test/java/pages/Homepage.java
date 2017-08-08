package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Homepage {

    @FindBy(css = "tr td:nth-child(2) small a:nth-child(6)")
    private WebElement findLoginPsge;

    public void clickLoginPage(){findLoginPsge.click();}
}
