

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
/**
 * Created by user on 11/27/2016.
 */
public class MyLoginTests {

    WebDriver driver;
    @Before
    public void beformytest() {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");

        driver = new ChromeDriver();

        driver.manage().window().maximize();
    }

        @Test
        public void mytest1() {
            driver.get("http://clinic.scriptinglogic.com/auth/login_form.php");

            WebElement Username = driver.findElement(By.xpath("//*[@id='login_session']"));

            Username.sendKeys("admin");

            WebElement Password = driver.findElement(By.xpath("//*[@id='pwd_session']"));
            Password.sendKeys("admin");

            WebElement submit = driver.findElement(By.xpath("//*[@id='login']"));

            submit.click();
            String actual = "";
            String expected = "Logout";

            actual = driver.findElement(By.xpath("//*[@id='shortcuts']/li[1]/a[1]")).getText();

            Assert.assertEquals(expected, actual);
        }
            @Test
            public void mytest2() {
                driver.get("http://clinic.scriptinglogic.com/auth/login_form.php");

                WebElement Username = driver.findElement(By.xpath("//*[@id='login_session']"));

                Username.sendKeys("admin");

                WebElement Password = driver.findElement(By.xpath("//*[@id='pwd_session']"));
                Password.sendKeys("adm");

                WebElement submit = driver.findElement(By.xpath("//*[@id='login']"));
                submit.click();
                String actual = "";
                String expected = "Invalid sign on.";

                actual = driver.findElement(By.xpath("//span[@class='error']")).getText();

                Assert.assertEquals(expected, actual);

            }

             @Test
             public void mytest3(){

                     driver.get("http://clinic.scriptinglogic.com/auth/login_form.php");

                     WebElement Username = driver.findElement(By.xpath("//*[@id='login_session']"));

                     Username.sendKeys("admin");

                     WebElement Password = driver.findElement(By.xpath("//*[@id='pwd_session']"));
                     Password.sendKeys("");

                     WebElement submit = driver.findElement(By.xpath("//*[@id='login']"));
                     submit.click();
                     String actual = "";
                     String expected = "Invalid sign on.";

                     actual = driver.findElement(By.xpath("//span[@class='error']")).getText();

                     Assert.assertEquals(expected, actual);

                 }
             @Test
             public void mytest4() {
              driver.get("http://clinic.scriptinglogic.com/auth/login_form.php");

                 WebElement Username = driver.findElement(By.xpath("//*[@id='login_session']"));

              Username.sendKeys("admin");

               WebElement Password = driver.findElement(By.xpath("//*[@id='pwd_session']"));
              Password.sendKeys("adm");

               WebElement submit = driver.findElement(By.xpath("//*[@id='login']"));
              submit.click();
              String actual = "";
             String expected = "Invalid sign on.";

             actual = driver.findElement(By.xpath("//span[@class='error']")).getText();

            Assert.assertEquals(expected, actual);

    }

        }




