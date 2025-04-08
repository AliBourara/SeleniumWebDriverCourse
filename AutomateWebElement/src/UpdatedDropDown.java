import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class UpdatedDropDown {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(By.id("divpaxinfo")).click();
        //*Basic While loop
        int i =1;    //todo initial
        while(i<5){  //todo compare
            driver.findElement(By.id("hrefIncAdt")).click();
            i++; //todo condition
        };
        driver.findElement(By.id("btnclosepaxoption")).click();




    }
}
