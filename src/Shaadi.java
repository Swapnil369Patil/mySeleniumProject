import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

/**
 * Created by user on 1/15/2017.
 */
public class Shaadi {

    WebDriver driver;

    @org.testng.annotations.BeforeClass
    public void beformytest() {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");

        driver = new ChromeDriver();

        driver.manage().window().maximize();
    }

    int count = 0;

    @org.testng.annotations.AfterClass
    public void myAfterMethod() {
        count++;
        System.out.println("After Method " + count);
       // driver.quit();
    }

    @Test
    public void mytest1() {
        driver.get("http://www.shaadi.com/registration/user");

        WebElement Email = driver.findElement(By.xpath("//input[@id='email']"));

        Email.sendKeys("talkswap369patil@gmail.com");

        WebElement Password = driver.findElement(By.xpath("//input[@id='password1']"));
        Password.sendKeys("swap@369");

        Select comboProfile = new Select(driver.findElement(By.xpath(".//*[@id='postedby']")));
comboProfile.selectByVisibleText("Son");

        WebElement firstname = driver.findElement(By.xpath("//input[@id='first_name']"));
        firstname.sendKeys("Swapnil");

        WebElement lastname = driver.findElement(By.xpath("//input[@id='last_name']"));
        firstname.sendKeys("Patil");

        WebElement gender = driver.findElement(By.xpath("//input[@id='gender-Male']"));
        gender.sendKeys("mail");


        Select comboday = new Select(driver.findElement(By.xpath(".//*[@id='day']")));
        comboday.selectByVisibleText("29");

        Select combomonth = new Select(driver.findElement(By.xpath(".//*[@id='month']")));
        combomonth.selectByVisibleText("Dec");

        Select comboyear = new Select(driver.findElement(By.xpath(".//*[@id='year']")));
        comboyear.selectByVisibleText("1991");

        Select comboreligion = new Select(driver.findElement(By.xpath(".//*[@id='community']")));
        comboreligion.selectByVisibleText("Hindu");

        Select combomothertongue = new Select(driver.findElement(By.xpath(".//*[@id='mother_tongue']")));
        combomothertongue.selectByVisibleText("Marathi");

        Select combolivingin = new Select(driver.findElement(By.xpath(".//*[@id='countryofresidence']")));
        combolivingin.selectByVisibleText("India");

        WebElement checkbox = driver.findElement(By.xpath(".//*[@id='confirm_policy']"));

        checkbox.click();

        WebElement submit = driver.findElement(By.xpath(".//*[@id='btnSubmit']/span[1]"));
        submit.click();

    }
}