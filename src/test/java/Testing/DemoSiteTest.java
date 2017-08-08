package Testing;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


import static org.junit.Assert.assertEquals;

import org.openqa.selenium.support.PageFactory;

import pages.*;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

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




        String userNameAndPass = "783huu";

        wD.navigate().to("http://thedemosite.co.uk/");

        homepage.clickLoginPage(wD);

        addUser.enterUserName(userNameAndPass , wD);

        addUser.enterPassword(userNameAndPass, wD);

        addUser.clickEnterButton(wD);

        addUser.clickLoginPageButton(wD);

        logIn.enterUserName(userNameAndPass, wD);

        logIn.enterPassword(userNameAndPass, wD);

        logIn.clickEnter(wD);

    assertEquals("login failed", "**Successful Login**", logIn.getLoginStateText(wD));


}



    @After
    public void afterTest()
    {
        wD.quit();

    }



}
