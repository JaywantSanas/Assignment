package AssignmentPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGclass {

	ChromeDriver driver ;

	@BeforeMethod
	public void Setup() {
		 driver = new ChromeDriver();
		driver.get("https://www.automationanywhere.com/");
		//AcceptCookies
				WebElement cookie= driver.findElement(By.xpath("//*[@id=\"onetrust-accept-btn-handler\"]"));

				 Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(30));
				    wait.until(ExpectedConditions.elementToBeClickable(cookie));

				driver.findElement(By.xpath("//*[@id=\"onetrust-accept-btn-handler\"]")).click();

	}

	@Test(priority = 1,timeOut = 500)
	public void VerifyLogo() {
		boolean Logo = driver.findElement(By.xpath("//header/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]/img[1]")).isDisplayed();

		Assert.assertTrue(Logo);


	}
	@Test(priority = 2,timeOut = 500,enabled = true)
	public void RequestDemo() {
		boolean RequestDemo  = driver.findElement(By.xpath("//a[contains(text(),'Request demo')]")).isEnabled();
		Assert.assertTrue(RequestDemo);

		boolean RequestDemoDisplayed  = driver.findElement(By.xpath("//a[contains(text(),'Request demo')]")).isDisplayed();

		if(RequestDemoDisplayed && RequestDemo) {
			System.out.println("RequestDemo button is clickable");
		}

		//Or

		Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	    wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//a[contains(text(),'Request demo')]"))));


		Assert.assertTrue(RequestDemo && RequestDemo);
	}

	
	@AfterMethod
	public void TearDown() {

		driver.quit();
	}

}
