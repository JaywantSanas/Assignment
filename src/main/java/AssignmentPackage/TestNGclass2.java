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

public class TestNGclass2 {
	


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

	
	
	
	@Test(priority = 1,timeOut = 2500)
	public void Home() {
		driver.findElement(By.xpath("//a[contains(text(),'Products')]")).click();

		boolean HomeNavigated = driver.findElement(By.xpath("//span[contains(text(),'Automate the impossible.')]")).isEnabled();

		Assert.assertTrue(HomeNavigated);
		if(HomeNavigated) {
			System.out.println("Navigated to Home");
		}
		
	}
	@Test(priority = 2,timeOut = 2500,enabled = true)
	public void Solution() {
		
		driver.findElement(By.xpath("//*[@id=\"topNavbar\"]/div/div/div[2]/ul/li[2]/a")).click();

        boolean SolutionNavigated = driver.findElement(By.xpath("//a[@id='edit-solution-function']")).isEnabled();

        Assert.assertTrue(SolutionNavigated);
		if(SolutionNavigated) {
			System.out.println("Navigated to Solution");
		}
	}

	@Test(priority = 3,enabled = true)
	public void Resources() {
		
		driver.findElement(By.xpath("//*[@id=\"topNavbar\"]/div/div/div[2]/ul/li[3]/a")).click();
		boolean ResourcesNavigated =driver.findElement(By.xpath("//h1[contains(text(),'Intelligent Automation Resources')]")).isEnabled();

		Assert.assertTrue(ResourcesNavigated);
		
		if(ResourcesNavigated) {
			System.out.println("Navigated to Resources");
		}
	}
	@Test(priority = 4,enabled = true)
	public void BeyondRPA() {
		
		driver.findElement(By.xpath("//*[@id=\"topNavbar\"]/div/div/div[2]/ul/li[4]/a")).click();
		boolean BeyondRPANavigated =driver.findElement(By.xpath("//h1[contains(text(),'Robotic Process Automation (RPA)')]")).isEnabled();

		Assert.assertTrue(BeyondRPANavigated);
		
		if(BeyondRPANavigated) {
			System.out.println("Navigated to Beyond RPA");
		}
		
	}
	@Test(priority = 5,enabled = true)
	public void Company() {
		driver.findElement(By.xpath("//a[contains(text(),'Company')]")).click();
		boolean CompanyNavigated =driver.findElement(By.xpath("//h1[contains(text(),'About Automation Anywhere')]")).isEnabled();

		Assert.assertTrue(CompanyNavigated);
		
		if(CompanyNavigated) {
			System.out.println("Navigated to Company");
		}
		
	}
	

	
	
	
	
	
	@AfterMethod
	public void TearDown() {

		driver.quit();
	}



}
