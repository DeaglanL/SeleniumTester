package Testing;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


import static org.junit.Assert.assertEquals;

import org.openqa.selenium.support.PageFactory;

import pages.*;

import java.io.IOException;


public class DemoSiteTest {

    private WebDriver wD;

    private Homepage homepage;
    private LogInPage logIn;
    private AddAUser addUser;


    private ExtentReports report;
    private ExtentTest test;
    private String reportFilePath = "report.html";

    @BeforeClass
    public static void beforeClass()
    {

    }

    @Before
    public void beforeTest()
    {

        report = new ExtentReports();
        ExtentHtmlReporter extentHtmlReporter = new ExtentHtmlReporter(reportFilePath);
        extentHtmlReporter.config().setReportName("The demo site test report");
        extentHtmlReporter.config().setDocumentTitle("The demo site test report");
        report.attachReporter(extentHtmlReporter);
        test = report.createTest("Login test");

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

        test.log(Status.INFO, "Info level");
        test.fail("Failed");

        try {
            test.log(Status.INFO,
                    "Error Snapshot : " + test.addScreenCaptureFromPath(ScreenShot.take(wD, "test")));
        } catch (IOException e) {
            e.printStackTrace();
        }


        assertEquals("login failed", "**Successful Login**", logIn.getLoginStateText(wD));





}



    @After
    public void afterTest()
    {
        wD.quit();
        report.flush();


    }


    @AfterClass
    public static void afterClass()
    {



    }

}