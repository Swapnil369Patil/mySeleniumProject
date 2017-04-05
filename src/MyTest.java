/**
 * Created by user on 11/27/2016.
 */
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.junit.Test;

public class MyTest
{

    @Test
    public void LoginTest()
{
    System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");

    WebDriver driver = new ChromeDriver();

    driver.manage().window().maximize();

    driver.get("http://clinic.scriptinglogic.com/auth/login_form.php");

}
}
