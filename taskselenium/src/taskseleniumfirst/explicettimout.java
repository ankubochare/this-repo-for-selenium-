package taskseleniumfirst;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class explicettimout {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();

		WebDriverWait wait = new WebDriverWait(driver, 1);

		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//a[@href=\"/login\"]"))));
		driver.findElement(By.xpath("//a[@href=\"/login\"]")).click(); // click on login link
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("Email"))));
		driver.findElement(By.id("Email")).sendKeys("ankita16@gmail.com"); // enter email address

		// driver.findElement(By.name("Password")).sendKeys("Abc123@"); // enter
		// password
		// driver.findElement(By.xpath("(//input[@type='submit'])[2]")).click(); //
		// click on submit button

	}

}
