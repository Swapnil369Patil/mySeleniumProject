import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by user on 11/27/2016.
 */
public class MyTtt {

    WebDriver driver;
    @Before
    public void beformytest() {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");

         driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("http://clinic.scriptinglogic.com/auth/login_form.php");
    }

@Test
public void mytest1()

        {

            WebElement Username = driver.findElement(By.id("pwd_session"));

            Username.sendKeys("admin");

            WebElement Password = driver.findElement(By.id("login_session"));
            Password.sendKeys("admin");


            WebElement submit = driver.findElement(By.id("login"));
            submit.click();


        }

@Test
    public void mytest2()

    {
        WebElement Username = driver.findElement(By.id("pwd_session"));

        Username.sendKeys("admin");

        WebElement Password = driver.findElement(By.id("login_session"));
        Password.sendKeys("admin1");


        WebElement submit = driver.findElement(By.id("login"));
        submit.click();
    }

@Test
        public void mytest3()

{
    WebElement Username = driver.findElement(By.id("pwd_session"));

    Username.sendKeys("admin1");

    WebElement Password = driver.findElement(By.id("login_session"));
    Password.sendKeys("admin");


    WebElement submit = driver.findElement(By.id("login"));
    submit.click();
}
          @Test
            public void mytest4()

            {
                WebElement Username = driver.findElement(By.id("pwd_session"));

                Username.sendKeys("");

                WebElement Password = driver.findElement(By.id("login_session"));
                Password.sendKeys("");


                WebElement submit = driver.findElement(By.id("login"));
                submit.click();

}
@After
public void aftermytest()
            {
                driver.quit();
            }
            }

