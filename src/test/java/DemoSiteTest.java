import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;


public class DemoSiteTest {

    private WebDriver wD;

    @Before
    public void beforeTest()
    {
        System.out.println("Before test");



        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--start-maximized");
        wD = new ChromeDriver(chromeOptions);
    }

    @Test
    public void test()
    {
        wD.navigate().to("http://thedemosite.co.uk/");

        Tools.wait(3);


        wD.findElement(By.cssSelector("tr td:nth-child(2) small a:nth-child(6)")).click();

        Tools.wait(3);


        wD.findElement(By.cssSelector(" form  center table tr:nth-child(1) td:nth-child(2) input")).sendKeys("abcd");

        Tools.wait(3);

        wD.findElement(By.cssSelector("form center table td:nth-child(2) input[type=\"password\"]")).sendKeys("abcd");

        Tools.wait(3);

        wD.findElement(By.cssSelector("form center tr:nth-child(3) td:nth-child(2) input[type=\"button\"]")).click();

        Tools.wait(3);

        wD.findElement(By.cssSelector("center tr:nth-child(2) td:nth-child(2) a:nth-child(7)")).click();

        Tools.wait(3);

        wD.findElement(By.cssSelector("form center td:nth-child(1) tr:nth-child(1) td:nth-child(2) input")).sendKeys("abcd");

        Tools.wait(3);

        wD.findElement(By.cssSelector("form center td:nth-child(1) tr:nth-child(2) td:nth-child(2) input[type=\"password\"]")).sendKeys("abcd");

        Tools.wait(3);

        wD.findElement(By.cssSelector("form center td:nth-child(1) tr:nth-child(3)  td:nth-child(2) input[type=\"button\"]")).click();

        Tools.wait(3);

        assertEquals("login failed", "**Successful Login**", wD.findElement(By.cssSelector("tr  td.auto-style1 big blockquote blockquote font center b")).getText());


    }

    @After
    public void afterTest()
    {
        wD.quit();

    }

}
