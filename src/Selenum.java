import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/**
 * Created by user on 10/16/2016.
 */
public class Selenum {

    public static void main(String[] args)

    {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        //driver.get("http://gmail.com");

        driver.get("http://clinic.scriptinglogic.com/auth/login_form.php");

        //String str=driver.getCurrentUrl();
        //String str1=driver.getTitle();

        //System.out.println("Current path"+str);
        // System.out.println("Title"+str1);

        WebElement Username = driver.findElement(By.id("pwd_session"));

        Username.sendKeys("admin");

        WebElement Password = driver.findElement(By.id("login_session"));
        Password.sendKeys("admin");

        //  <input id="login" name="login" value="Enter" type="submit">

        WebElement submit = driver.findElement(By.id("login"));
        submit.click();

        WebElement linktext = driver.findElement(By.linkText("Admin"));
        linktext.click();

        WebElement linktext1 = driver.findElement(By.linkText("Staff Members"));
        linktext1.click();

        WebElement linktext2 = driver.findElement(By.linkText("Add New Doctor"));
        linktext2.click();

        WebElement Tin = driver.findElement(By.id("nif"));
        Tin.sendKeys("369369");

        WebElement Collegiate = driver.findElement(By.id("collegiate_number"));
        Collegiate.sendKeys("253752");

        WebElement first_name = driver.findElement(By.id("first_name"));
        first_name.sendKeys("SWAPNIL");

        WebElement surname1 = driver.findElement(By.id("surname1"));
        surname1.sendKeys("PATIL");

        WebElement surname2 = driver.findElement(By.id("surname2"));
        surname2.sendKeys("CHITALE");

        WebElement address = driver.findElement(By.id("address"));
        address.sendKeys("ABC Chauk near Prabhat Talkies");

        WebElement phone_contact = driver.findElement(By.id("phone_contact"));
        phone_contact.sendKeys("9028305520");

        WebElement login = driver.findElement(By.id("login"));
        login.sendKeys("talkswap");

        WebElement submit2 = driver.findElement(By.id("save"));
        submit2.click();



        WebElement Combogender = driver.findElement(By.id("sex"));

        Select Combo=new Select(Combogender);

       // Combo.selectByVisibleText("male");

        Combo.selectByVisibleText("male");


    }
}