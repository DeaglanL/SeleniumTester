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
import java.util.ArrayList;



public class DemoSiteTest {

    private static WebDriver wD;


    //Pages
    private Homepage homepage;
    private LogInPage logIn;
    private AddAUser addUser;


    //Extent report generation
    private static ExtentReports report;
    private ExtentTest test;
    private String reportFilePath = "report.html";


    //DDT
    static DataImport di = new DataImport();
    ArrayList<String> dataInput;
    String userName;
    String passWord;
    static int testCounter;

    @BeforeClass
    public static void beforeClass()
    {

        di.readSpreadSheet("C:\\Users\\Administrator\\Documents\\Book1.xlsx");
        testCounter = 1;


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





       dataInput = di.readRow(testCounter,"Sheet1");


      userName = dataInput.get(2);
      passWord = dataInput.get(3);

    }

    @Test
    public void test1()
    {


        wD.navigate().to("http://thedemosite.co.uk/");
        test.log(Status.INFO, "Connected to site");

        homepage.clickLoginPage(wD);
        test.log(Status.INFO, "Clicked sigh up page");

        addUser.enterUserName(userName , wD);

        addUser.enterPassword(passWord, wD);
        test.log(Status.INFO, "Enter user name and password");

        addUser.clickEnterButton(wD);
        test.log(Status.INFO, "Clicked enter");
        addUser.clickLoginPageButton(wD);
        test.log(Status.INFO, "Clicked login page");

        logIn.enterUserName(userName, wD);

        logIn.enterPassword(passWord, wD);
        test.log(Status.INFO, "Enter user name and password");

        logIn.clickEnter(wD);
        test.log(Status.INFO, "Clicked enter");


        assertEquals("login failed", "**Successful Login**", logIn.getLoginStateText(wD));
        test.log(Status.PASS, "Login success");




        try {
            test.log(Status.INFO,
                    "Login Screenshot : "
                     + test.addScreenCaptureFromPath(ScreenShot.take(wD, "test")));
        } catch (IOException e) {
            e.printStackTrace();
        }

}

    @Test
    public void test6()
    {


        wD.navigate().to("http://thedemosite.co.uk/");
        test.log(Status.INFO, "Connected to site");

        homepage.clickLoginPage(wD);
        test.log(Status.INFO, "Clicked sigh up page");

        addUser.enterUserName(userName , wD);

        addUser.enterPassword(passWord, wD);
        test.log(Status.INFO, "Enter user name and password");

        addUser.clickEnterButton(wD);
        test.log(Status.INFO, "Clicked enter");
        addUser.clickLoginPageButton(wD);
        test.log(Status.INFO, "Clicked login page");

        logIn.enterUserName(userName, wD);

        logIn.enterPassword(passWord, wD);
        test.log(Status.INFO, "Enter user name and password");

        logIn.clickEnter(wD);
        test.log(Status.INFO, "Clicked enter");


        assertEquals("login failed", "**Successful Login**", logIn.getLoginStateText(wD));
        test.log(Status.PASS, "Login success");




        try {
            test.log(Status.INFO,
                    "Login Screenshot : "
                            + test.addScreenCaptureFromPath(ScreenShot.take(wD, "test")));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    @Test
    public void test7()
    {


        wD.navigate().to("http://thedemosite.co.uk/");
        test.log(Status.INFO, "Connected to site");

        homepage.clickLoginPage(wD);
        test.log(Status.INFO, "Clicked sigh up page");

        addUser.enterUserName(userName , wD);

        addUser.enterPassword(passWord, wD);
        test.log(Status.INFO, "Enter user name and password");

        addUser.clickEnterButton(wD);
        test.log(Status.INFO, "Clicked enter");
        addUser.clickLoginPageButton(wD);
        test.log(Status.INFO, "Clicked login page");

        logIn.enterUserName(userName, wD);

        logIn.enterPassword(passWord, wD);
        test.log(Status.INFO, "Enter user name and password");

        logIn.clickEnter(wD);
        test.log(Status.INFO, "Clicked enter");


        assertEquals("login failed", "**Successful Login**", logIn.getLoginStateText(wD));
        test.log(Status.PASS, "Login success");




        try {
            test.log(Status.INFO,
                    "Login Screenshot : "
                            + test.addScreenCaptureFromPath(ScreenShot.take(wD, "test")));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    @Test
    public void test2()
    {


        wD.navigate().to("http://thedemosite.co.uk/");
        test.log(Status.INFO, "Connected to site");

        homepage.clickLoginPage(wD);
        test.log(Status.INFO, "Clicked sigh up page");

        addUser.enterUserName(userName , wD);

        addUser.enterPassword(passWord, wD);
        test.log(Status.INFO, "Enter user name and password");

        addUser.clickEnterButton(wD);
        test.log(Status.INFO, "Clicked enter");
        addUser.clickLoginPageButton(wD);
        test.log(Status.INFO, "Clicked login page");

        logIn.enterUserName(userName, wD);

        logIn.enterPassword(passWord, wD);
        test.log(Status.INFO, "Enter user name and password");

        logIn.clickEnter(wD);
        test.log(Status.INFO, "Clicked enter");


        assertEquals("login failed", "**Successful Login**", logIn.getLoginStateText(wD));
        test.log(Status.PASS, "Login success");




        try {
            test.log(Status.INFO,
                    "Login Screenshot : "
                            + test.addScreenCaptureFromPath(ScreenShot.take(wD, "test")));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    @Test
    public void test3()
    {


        wD.navigate().to("http://thedemosite.co.uk/");
        test.log(Status.INFO, "Connected to site");

        homepage.clickLoginPage(wD);
        test.log(Status.INFO, "Clicked sigh up page");

        addUser.enterUserName(userName , wD);

        addUser.enterPassword(passWord, wD);
        test.log(Status.INFO, "Enter user name and password");

        addUser.clickEnterButton(wD);
        test.log(Status.INFO, "Clicked enter");
        addUser.clickLoginPageButton(wD);
        test.log(Status.INFO, "Clicked login page");

        logIn.enterUserName(userName, wD);

        logIn.enterPassword(passWord, wD);
        test.log(Status.INFO, "Enter user name and password");

        logIn.clickEnter(wD);
        test.log(Status.INFO, "Clicked enter");


        assertEquals("login failed", "**Successful Login**", logIn.getLoginStateText(wD));
        test.log(Status.PASS, "Login success");




        try {
            test.log(Status.INFO,
                    "Login Screenshot : "
                            + test.addScreenCaptureFromPath(ScreenShot.take(wD, "test")));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    @Test
    public void test4()
    {


        wD.navigate().to("http://thedemosite.co.uk/");
        test.log(Status.INFO, "Connected to site");

        homepage.clickLoginPage(wD);
        test.log(Status.INFO, "Clicked sigh up page");

        addUser.enterUserName(userName , wD);

        addUser.enterPassword(passWord, wD);
        test.log(Status.INFO, "Enter user name and password");

        addUser.clickEnterButton(wD);
        test.log(Status.INFO, "Clicked enter");
        addUser.clickLoginPageButton(wD);
        test.log(Status.INFO, "Clicked login page");

        logIn.enterUserName(userName, wD);

        logIn.enterPassword(passWord, wD);
        test.log(Status.INFO, "Enter user name and password");

        logIn.clickEnter(wD);
        test.log(Status.INFO, "Clicked enter");


        assertEquals("login failed", "**Successful Login**", logIn.getLoginStateText(wD));
        test.log(Status.PASS, "Login success");




        try {
            test.log(Status.INFO,
                    "Login Screenshot : "
                            + test.addScreenCaptureFromPath(ScreenShot.take(wD, "test")));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    @Test
    public void test5()
    {


        wD.navigate().to("http://thedemosite.co.uk/");
        test.log(Status.INFO, "Connected to site");

        homepage.clickLoginPage(wD);
        test.log(Status.INFO, "Clicked sigh up page");

        addUser.enterUserName(userName , wD);

        addUser.enterPassword(passWord, wD);
        test.log(Status.INFO, "Enter user name and password");

        addUser.clickEnterButton(wD);
        test.log(Status.INFO, "Clicked enter");
        addUser.clickLoginPageButton(wD);
        test.log(Status.INFO, "Clicked login page");

        logIn.enterUserName(userName, wD);

        logIn.enterPassword(passWord, wD);
        test.log(Status.INFO, "Enter user name and password");

        logIn.clickEnter(wD);
        test.log(Status.INFO, "Clicked enter");


        assertEquals("login failed", "**Successful Login**", logIn.getLoginStateText(wD));
        test.log(Status.PASS, "Login success");




        try {
            test.log(Status.INFO,
                    "Login Screenshot : "
                            + test.addScreenCaptureFromPath(ScreenShot.take(wD, "test")));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }



    @After
    public void afterTest()
    {
        if (testCounter < 14)
        {
            testCounter ++;
        }

        wD.quit();

    }


    @AfterClass
    public static void afterClass()
    {
        wD.quit();
        report.flush();



    }

}
