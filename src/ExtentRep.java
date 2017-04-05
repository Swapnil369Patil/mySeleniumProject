import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.relevantcodes.extentreports.NetworkMode;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.SendKeysAction;
import org.testng.annotations.Test;

import java.io.IOException;

import static utility.TakeScreenShot.takeScreenshot;

/**
 * Created by user on 1/22/2017.
 */
public class ExtentRep
    //public static void main(String[] args) throws IOException

    {
        WebDriver driver;
        @Test
        public void myTest ()throws IOException {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        driver = new ChromeDriver();
        ExtentReports extent = new ExtentReports("Extent-Report/report.html", true, NetworkMode.OFFLINE);
        ExtentTest test = extent.startTest("Login Test", "Login test for valid user");
        driver.get("http://clinic.scriptinglogic.com/");
        test.log(LogStatus.INFO, "url is opened");
        driver.findElement(By.xpath("//input[@id='login_session']")).sendKeys("admin");
        test.log(LogStatus.INFO, "username is set");

        driver.findElement(By.xpath("//input[@id='pwd_session']")).sendKeys("admin");

        test.log(LogStatus.INFO, "password is set");
        driver.findElement(By.xpath("//input[@name='login']")).click();
        test.log(LogStatus.INFO, "login button clicked");

            test.log(LogStatus.INFO, "Snapshot below: " + test.addScreenCapture("./screenshots/"+takeScreenshot(driver)));


            extent.endTest(test);
        extent.flush();
    }
    }

