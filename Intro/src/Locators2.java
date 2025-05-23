
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;


import java.time.Duration;

public class Locators2 {
    public static void main(String[] args) throws InterruptedException{

        String Name = "Essallem";


        System.setProperty("webdriver.chrome.driver","C:/Users/Bourara/Documents/geckodriver-v0.36.0-win-aarch64/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        String password = getPassword(driver);
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        driver.findElement(By.id("inputUsername")).sendKeys(Name);
        driver.findElement(By.name("inputPassword")).sendKeys(password);
        driver.findElement(By.className("signInBtn")).click();

        Thread.sleep(1000); // Pause for 1 second

        //Todo test if text is correct with Assert method
        Assert.assertEquals(driver.findElement(By.tagName("p")).getText(),"You are successfully logged in.");
        Assert.assertEquals(driver.findElement(By.tagName("h2")).getText(),"Hello "+Name+",");
        driver.findElement(By.xpath("//button[text()='Log Out']")).click();
        driver.close();








    }
    public static String getPassword(WebDriver driver) throws InterruptedException {
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        driver.findElement(By.linkText("Forgot your password?")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
        String passwordText = driver.findElement(By.cssSelector("form p")).getText();
        //?--------------Split into two when countering "'"
        String[] passwordArray = passwordText.split("'");
        //?---------------passwordArray[index].split("'")[index needed]
        String password = passwordArray[1].split("'")[0];
        return password;

    }
}

