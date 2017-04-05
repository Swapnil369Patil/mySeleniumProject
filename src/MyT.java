/**
 * Created by user on 11/27/2016.
 */
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.junit.Test;

public class MyT

{
    @Before
    public void beforeMyTest()
    {
        System.out.println("i am before test");
    }

    @After
    public void afterMyTest()
    {
        System.out.println("i am after test");
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

