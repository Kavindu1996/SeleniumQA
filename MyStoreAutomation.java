import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MyStoreAutomation {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ASUS\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
        //ChromeDriver driver = new ChromeDriver();
        WebDriver driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");

        System.out.println(driver.getTitle());
        driver.findElement(By.xpath("//input[@id='search_query_top']")).sendKeys("T-shirt");
        driver.findElement(By.xpath("//button[@name='submit_search']")).click();

        driver.findElement(By.xpath("//a[@class='product-name']")).click();
        String product_name = driver.findElement(By.xpath("//h1[@itemprop='name']")).getText();
        System.out.println("Product Name: "+product_name);
        String product_price = driver.findElement(By.xpath("//span[@id='our_price_display']")).getText();
        System.out.println("Product Price: "+product_price);

        //color
        driver.findElement(By.xpath("//a[@id='color_15']")).click();

        //size
        Select size = new Select(driver.findElement(By.name("group_1")));
        size.selectByVisibleText("L");

        //Add to card
        driver.findElement(By.xpath("//button[@name='Submit']")).click();
        //shopping cart title
        //String shopping_cart_title = driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[1]/h2")).getText();
        //System.out.println("Product Name: "+shopping_cart_title);


//        String productPPrice = driver.findElement(By.cssSelector("#layer_cart > div.clearfix > div.layer_cart_cart.col-xs-12.col-md-6 > div:nth-child(2)")).getText();
//        System.out.println(product_price);
//        String shipping_cost = driver.findElement(By.xpath("#layer_cart > div.clearfix > div.layer_cart_cart.col-xs-12.col-md-6 > div:nth-child(3)")).getText();
//        System.out.println(shipping_cost);
//        String total = driver.findElement(By.xpath("#layer_cart > div.clearfix > div.layer_cart_cart.col-xs-12.col-md-6 > div:nth-child(4)")).getText();
//        System.out.println(total);

        //Countinue shopping
        //driver.findElement(By.xpath("//span[@class='continue btn btn-default button exclusive-medium']")).click();

        //click checkout
        driver.findElement(By.xpath("//a[@title='View my shopping cart']")).click();

        driver.close();
    }
}
