import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


import static org.junit.Assert.assertEquals;

import org.openqa.selenium.support.PageFactory;
import pages.*;

public class DemoSiteTest {

    private WebDriver wD;
    private Homepage homepage;
    private LogInPage logIn;
    private AddAUser addUser;

    @Before
    public void beforeTest()
    {
        System.out.println("Before test");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--start-maximized");
        wD = new ChromeDriver(chromeOptions);

        homepage = PageFactory.initElements(wD,Homepage.class);
        logIn = PageFactory.initElements(wD,LogInPage.class);
        addUser = PageFactory.initElements(wD,AddAUser.class);
    }

    @Test
    public void test()
    {
        wD.navigate().to("http://thedemosite.co.uk/");

        Tools.wait(3);

        homepage.clickLoginPage();

        Tools.wait(3);

        addUser.enterUserName("abcd");

        Tools.wait(3);

        addUser.enterPassword("abcd");

        Tools.wait(3);

        addUser.clickEnterButton();

        Tools.wait(3);

        addUser.clickLoginPageButton();

        Tools.wait(3);

        logIn.enterUserName("abcd");

        Tools.wait(3);

        logIn.enterPassword("abcd");

        Tools.wait(3);

        logIn.clickEnter();

        Tools.wait(3);

    assertEquals("login failed", "**Successful Login**", logIn.getLoginStateText());


}

    @After
    public void afterTest()
    {
        wD.quit();

    }



}
