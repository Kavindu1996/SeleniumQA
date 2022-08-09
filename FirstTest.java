package Selenium.webdriver.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ASUS\\Downloads\\chromedriver_win32\\chromedriver.exe");
		//ChromeDriver driver = new ChromeDriver();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/");
		//driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		//Thread.sleep(5000);
		
		if(driver.findElement(By.xpath("//div[@id='app']/div/div/div/div")).isDisplayed()) {
			System.out.println("Home Page Validated");
		}else {
			System.out.println("Home Page not Validated");
		}
		
		driver.findElement(By.cssSelector(".banner-image")).click();
		if(driver.findElement(By.xpath("//img[@alt='Selenium Online Training']")).isDisplayed()) {
			System.out.println("Registration Page Validated");
		}else {
			System.out.println("Registration Page not Validated");
		}
		
		driver.findElement(By.id("")).sendKeys("");
		driver.findElement(By.id("")).sendKeys("");
		////div[@id='u_0_a_ax']/div/i
		driver.close();
		
	}

}
