package pages;



import Testing.Tools;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Wait;

import java.util.function.Function;

public class Homepage {

    Tools t = new Tools();

    @FindBy(css = "tr td:nth-child(2) small a:nth-child(6)")
    private WebElement findLoginPsge;

    public void clickLoginPage(WebDriver w){
        t.waitToLoad(w, "tr td:nth-child(2) small a:nth-child(6)");


        findLoginPsge.click();
    }



}
