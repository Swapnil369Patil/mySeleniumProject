import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

/**
 * Created by user on 1/15/2017.
 */
public class TestNgPrio {

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
driver.get("http://gmail.com");
        driver.quit();
    }

    @Test (priority = 5)
    public  void mytest1 () throws InterruptedException {
        System.out.println("This is test 1");
Thread.sleep(5000);
    }

    @Test (priority = 4)
    public  void mytest2() throws InterruptedException {
        System.out.println("This is test 2");
        Thread.sleep(5000);
    }
    @Test (priority = 1)
    public void mytest3() throws InterruptedException

    {
        System.out.println("This is test 3");
        Thread.sleep(5000);
    }

    @Test (priority = 2)
    public void mytest4() throws InterruptedException

    {
        System.out.println("This is test 4");
        Thread.sleep(5000);
    }

    @Test (priority = 3)
    public void mytest5() throws InterruptedException

    {
        System.out.println("This is test 5");
        Thread.sleep(5000);
    }

}

