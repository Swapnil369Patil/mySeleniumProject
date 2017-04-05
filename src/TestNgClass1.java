import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by user on 1/8/2017.
 */
public class TestNgClass1 {

    WebDriver driver;
    @org.testng.annotations.BeforeClass
    public void beformytest() {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");

        driver = new ChromeDriver();

        driver.manage().window().maximize();
    }
    int count=0;

    @org.testng.annotations.AfterClass
    public void myAfterMethod()
    {
        count++;
        System.out.println("After Method "+count);
        driver.quit();
    }

    @Test
    public  void mytest1 ()
    {
        System.out.println("This is test 1");

    }

    @Test
    public  void mytest2()
    {
        System.out.println("This is test 2");

    }
    @Test
    public void mytest3()

    {
        System.out.println("This is test 3");

    }

}
