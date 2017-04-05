import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

/**
 * Created by user on 1/29/2017.
 */
public class DatProvider {
    @Test(dataProvider="getData")
    public void LoginTest(String username,String password)

    {

        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");

        WebDriver driver = new ChromeDriver();


        driver.manage().window().maximize();

        driver.get("http://clinic.scriptinglogic.com/auth/login_form.php");

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.findElement(By.xpath("//*[@id='login_session']")).sendKeys(username);

        driver.findElement(By.xpath("//*[@id='pwd_session']")).sendKeys(password);

        driver.findElement(By.xpath("//*[@id='login']")).click();


    }


    @DataProvider
    public Object[][] getData() throws IOException {
        //Rows - Number of times your test has to be repeated.
        //Columns - Number of parameters in test data.

/*

        // 1st row
        data[0][0] ="Vaishali";
        data[0][1] = "vaishali";

        // 2nd row
        data[1][0] ="admin";
        data[1][1] = "renu";

        // 3rd row
        data[2][0] ="";
        data[2][1] = "";


        // 4th row
        data[3][0] ="admin";
        data[3][1] = "admin";


*/

        FileInputStream fileInputStream = new FileInputStream("DatProvider/DATA.xls");

        HSSFWorkbook workbook = new HSSFWorkbook(fileInputStream);

        HSSFSheet worksheet = workbook.getSheet("Sheet1");

        int rowCount= worksheet.getPhysicalNumberOfRows();

        Object[][] data = new Object[rowCount-1][2];

        for(int i=1;i<rowCount;i++)
        {
            HSSFRow row = worksheet.getRow(i);

            HSSFCell username = row.getCell(0);
            data[i][0] = username.getStringCellValue();

            HSSFCell password = row.getCell(1);
            data[i][1] = password.getStringCellValue();
        }

        return data;
    }

}




