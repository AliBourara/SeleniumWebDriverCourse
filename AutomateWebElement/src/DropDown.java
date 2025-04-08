import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class DropDown {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://spicejet.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.findElement(By.xpath("//div[@data-testid='to-testID-origin']")).click();
        driver.findElement(By.xpath("(//div)[265]")).click();

        //! Due to an updated on the training website the code here can't work
         /* the instructor explain that if to input tag have the same value for example you can choose one by
         adding an index with there order : "[order]" ex: [2]
         the code bellow explain this course
          */
        //? Usage of Index with selenium
        /*
        public static void main(String[] args) throws InterruptedException {
            System.setProperty("webdriver.chrome.driver", "C://work//chromedriver.exe");
            WebDriver driver =new ChromeDriver();
            driver.get("http://spicejet.com"); //URL in the browser
            //  //a[@value='MAA']  - Xpath for chennai
            //  //a[@value='BLR']
            driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
            driver.findElement(By.xpath("//a[@value='BLR']")).click();
            Thread.sleep(2000);
            //driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
            _____________________________Parent Xpath__________________________________________________ Child Xpath-------------
            driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
            driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
        }
        * */








    }
}
