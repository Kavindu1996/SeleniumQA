package Selenium.webdriver.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ASUS\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com/");
		//driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		//Thread.sleep(5000);
		
		if(driver.findElement(By.id("logo-icon")).isDisplayed()) {
			System.out.println("YouTube Home Page Validated");
		}else {
			System.out.println("YouTube Home Page not Validated");
		}
		
		driver.findElement(By.name("search_query")).sendKeys("Serendib Kiwi");
		driver.findElement(By.xpath ("//ytd-searchbox/button/yt-icon")).click();
		driver.close();

	}

}
