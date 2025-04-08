import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class Assignment {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/angularpractice/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.findElement(By.name("name")).sendKeys("Sallem");
        driver.findElement(By.name("email")).sendKeys("Sallem@xyz.com");

        driver.findElement(By.id("exampleInputPassword1")).sendKeys("Sallem@xyz.com");
        driver.findElement(By.id("exampleCheck1")).click();
        WebElement StaticDropdown = driver.findElement(By.id("exampleFormControlSelect1"));
        Select dropdown = new Select(StaticDropdown);
        dropdown.selectByValue("Male");
        driver.findElement(By.id("inlineRadio2")).click();

        driver.findElement(By.id("inlineRadio1")).click();

        driver.findElement(By.name("bday")).sendKeys("02/02/1992");

        driver.findElement(By.cssSelector(".btn-success")).click();

        System.out.println(driver.findElement(By.cssSelector(".alert-success")).getText());;
    }
}
