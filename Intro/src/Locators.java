import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import java.time.Duration;

public class Locators {
    public static void main(String[] args) throws InterruptedException{


        System.setProperty("webdriver.chrome.driver","C:/Users/Bourara/Documents/chromedriver-win64/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //Todo Implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.get("https://rahulshettyacademy.com/locatorspractice/");



        //* find element by id and type a text(value in html)
        driver.findElement(By.id("inputUsername")).sendKeys("Essalem");

        //* find element by name and type a text(value in html)
        driver.findElement(By.name("inputPassword")).sendKeys("Password");

        //* find element by class use or click in a button
        driver.findElement(By.className("signInBtn")).click();

        //* Css Selector
        //* Class name -> tagname.classname
        //* ID -> tagname#id
        //* another generic syntax : Tagname[attribute='value'] -> input[placeholder='Username']

        //? Catch and display an error message on the console
        //! Implicit wait is needed in this case,till the error message will be displayed

        System.out.println(driver.findElement(By.cssSelector("p.error")).getText());

        //* Link text locator
        driver.findElement(By.linkText("Forgot your password?")).click();

        //* Xpath
        //* //Tagname[@attribute='value']
        //* //input[@placeholder='Username']
        driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("John");

        driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("jhon321.com");

        //* //Tagnem[@attribute='value'][index]
        //* Tagnem[@attribute='value']:nth-child(index)
        driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
        driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("jhon123.com");
        driver.findElement(By.xpath("//form/input[3]")).sendKeys("982892952");

        //! Pause the script
        Thread.sleep(1000); // Pause for 1 second


        driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
        System.out.println(driver.findElement(By.cssSelector("form p")).getText());

        //?-------------------------------//Tagname[@attribute='value']/Tagname[order]
        driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();

        Thread.sleep(1000); // Pause for 1 second


        driver.findElement(By.cssSelector("#inputUsername")).sendKeys("Thrall");
        //?-------------------------------Tagname[attribute*='value']
        driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
        driver.findElement(By.id("chkboxOne")).click();
        //?----------------------------------------//tagname//Tagname[contains(@attribute,'value')]
        driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();








    }

}

