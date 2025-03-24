import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class WindowActivities {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:/Users/Bourara/Documents/chromedriver-win64/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //todo methods to do window settings
        driver.manage().window().maximize();

        driver.get("http://google.com");
        //? Navigate
        driver.navigate().to("https://rahulshettyacademy.com");
        driver.navigate().back();
        driver.navigate().forward();


    }
}
