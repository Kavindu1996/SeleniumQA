import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class searchItem {
    public static void main(String[] args){

        System.setProperty("webdriver.chrome.driver","C:\\Users\\ASUS\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.in/");
        WebElement searchItem = driver.findElement(By.id("twotabsearchtextbox"));
        searchItem.sendKeys("Iphone 12");

        driver.findElement(By.xpath("//*[@id='nav-search-submit-button']")).click();
        driver.findElement(By.linkText("Apple iPhone 12 (128GB) - Black")).click();
        System.out.println(driver.getTitle());
        driver.close();

    }
}
