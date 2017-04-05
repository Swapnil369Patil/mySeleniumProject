import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/**
 * Created by user on 10/23/2016.
 */
public class Radio {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("http://clinic.scriptinglogic.com/medical/patient_new_form.php");

        WebElement Combogender = driver.findElement(By.id("sex"));

        Select Combo=new Select(Combogender);

        Combo.selectByVisibleText("male");

        Combo.selectByVisibleText("Female");






    }
}