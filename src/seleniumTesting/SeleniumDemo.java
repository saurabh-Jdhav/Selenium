package seleniumTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDemo {

	WebDriver driver;
	
	public void launchBrowser()
	{
		
		System.setProperty("webdriver.chrome.driver","E:\\CDAC_modules\\SDM_module\\Day6\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
	}
	
	public void searchProduct() throws InterruptedException
	{
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("jbl");
		Thread.sleep(5000);
		driver.findElement(By.id("nav-search-submit-button")).click();
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		
		SeleniumDemo sb = new SeleniumDemo();
		sb.launchBrowser();
		sb.searchProduct();
	}

}
