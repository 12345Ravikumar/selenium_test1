package AutomationScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class firstScript {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chrome\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://localhost/Online-Food-Ordering-System-in-PHP-main/login.php");
		driver.manage().window().maximize();
		//provide username
		WebElement username = driver.findElement(By.name("username"));
		username.isDisplayed();
		username.isEnabled();
		username.sendKeys("Ravikumar");
		Thread.sleep(2500);
		
		//provide password
		WebElement password = driver.findElement(By.name("password"));
		password.isDisplayed();
		password.isEnabled();
		password.sendKeys("Ravikumar@123");
		Thread.sleep(2500);
		
		//clicking on a login button
		WebElement loginButton = driver.findElement(By.name("submit"));
		loginButton.isDisplayed();
		loginButton.isEnabled();
		loginButton.click();
		Thread.sleep(2500);
		
		
		//Asserting to ensure user login page work properly 
		
		WebElement MyOrders = driver.findElement(By.xpath("/html[1]/body[1]/header[1]/nav[1]/div[1]/div[1]/ul[1]/li[3]/a[1]"));
		String ActualValue = MyOrders.getText();
		System.out.println("When i see");
		System.out.println(MyOrders.getText());
		String ExpectedValue = "My Orders";
		if(ActualValue!=ExpectedValue)
		{
			System.out.println("Test case Passed");
		}
		else
			System.out.println("Test case Failed");
		

		//Go to navigations 
		
		driver.get("http://localhost/Online-Food-Ordering-System-in-PHP-main/restaurants.php");
		Thread.sleep(3000);
		driver.navigate().to("http://localhost/Online-Food-Ordering-System-in-PHP-main/dishes.php?res_id=1");
		Thread.sleep(3000);
		driver.navigate().to("http://localhost/Online-Food-Ordering-System-in-PHP-main/dishes.php?res_id=1&action=add&id=1");
		Thread.sleep(3000);
		driver.navigate().to("http://localhost/Online-Food-Ordering-System-in-PHP-main/checkout.php");
		Thread.sleep(3000);
		driver.navigate().to("http://localhost/Online-Food-Ordering-System-in-PHP-main/your_orders.php");
		Thread.sleep(3000);
		driver.navigate().to("http://localhost/Online-Food-Ordering-System-in-PHP-main/index.php");
				
	}
	

}
