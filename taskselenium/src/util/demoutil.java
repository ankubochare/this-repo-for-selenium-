package util;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class demoutil {

	WebDriver driver;

	@BeforeClass
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@Test(dataProvider = "logindata")
	public void login(String user, String pwd) {
		driver.get("http://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Log in")).click();
		WebElement txtEmail = driver.findElement(By.xpath("//input[@id=\"Email\"]"));
		txtEmail.clear();
		txtEmail.sendKeys(user);

		WebElement txtpwd = driver.findElement(By.xpath("//input[@id=\"Password\"]"));
		txtpwd.clear();
		txtpwd.sendKeys(pwd);

		driver.findElement(By.xpath("(//input[@type=\"submit\"])[2]")).click();
	}

	@DataProvider(name = "logindata")
	public String[][] demodata() throws IOException {
		String path = "./Datafiles/test.xlsx";
		exelutiliy exelutil = new exelutiliy(path);

		int totalrows = exelutil.getRowCount("Sheet1");
		int totalcels = exelutil.getCellCount("Sheet1", 2);

		String logindata[][] = new String[totalrows][totalcels];

		for (int i = 2; i < totalrows; i++) {
			for (int j = 0; j < totalcels; j++) {
				logindata[i - 1][j] = exelutil.getCellData("Sheet1", i, j);
			}
		}

		return logindata;
	}

	@AfterClass
	public void setdown() {
		driver.close();
	}

}
