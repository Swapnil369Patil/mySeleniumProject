import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import sun.security.util.Password;

/**
 * Created by user on 12/4/2016.
 */
public class Xpath {

    public static void main(String[] args)

    {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        //driver.get("http://gmail.com");

        driver.get("http://clinic.scriptinglogic.com/auth/login_form.php");



        WebElement Username =  driver.findElement(By.xpath("//*[@id='login_session']"));



                Username.sendKeys("admin");

        WebElement password =  driver.findElement(By.xpath("//*[@id='pwd_session']"));



        password.sendKeys("admin");

        WebElement submit =driver.findElement(By.xpath("//*[@id='login']"));
        submit.click();

        //  <input id="login" name="login" value="Enter" type="submit">



    }
}