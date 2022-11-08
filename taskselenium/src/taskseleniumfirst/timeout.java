package taskseleniumfirst;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class timeout {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//a[@href=\"/login\"]")).click(); // click on login link
		driver.findElement(By.id("Email")).sendKeys("ankita16@gmail.com"); // enter email address
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.name("Password")).sendKeys("Abc123@"); // enter password
		driver.findElement(By.xpath("(//input[@type='submit'])[2]")).click(); // click on submit button

	}

}
