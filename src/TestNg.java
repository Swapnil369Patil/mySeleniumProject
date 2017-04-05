
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Created by user on 1/8/2017.
 */
public class TestNg {
    WebDriver driver;
    @BeforeMethod
    public void beformytest() {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");

        driver = new ChromeDriver();

        driver.manage().window().maximize();
    }
    int count=0;

/*@AfterMethod
public void myAfterMethod()
{
    count++;
    System.out.println("After Method "+count);
    driver.quit();
}*/

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

        Assert.assertEquals(actual,expected);
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

        Assert.assertEquals(actual,expected);

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

        Assert.assertEquals(actual,expected);

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

        Assert.assertEquals(actual, expected);

    }

       @AfterMethod
       public void myAfterMethod()
        {
    count++;
    System.out.println("After Method "+count);
    driver.quit();
        }
    }




