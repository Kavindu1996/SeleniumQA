import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRMAutomation {

    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\ASUS\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
        //ChromeDriver driver = new ChromeDriver();
        WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        System.out.println(driver.getTitle());


        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
        driver.findElement(By.xpath("//button[@type='submit']")).click();

    }
}
