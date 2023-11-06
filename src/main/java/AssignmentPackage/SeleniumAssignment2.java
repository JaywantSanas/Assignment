package AssignmentPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumAssignment2 {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.automationanywhere.com/");

		//Accept cookies
		WebElement cookie= driver.findElement(By.xpath("//*[@id=\"onetrust-accept-btn-handler\"]"));

		 Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		    wait.until(ExpectedConditions.elementToBeClickable(cookie));

		driver.findElement(By.xpath("//*[@id=\"onetrust-accept-btn-handler\"]")).click();


		//Home
		driver.findElement(By.xpath("//a[contains(text(),'Products')]")).click();

		boolean HomeNavigated = driver.findElement(By.xpath("//span[contains(text(),'Automate the impossible.')]")).isEnabled();

		if(HomeNavigated) {
			System.out.println("Navigated to Home");
		}

		driver.navigate().back();

		//Solution
		driver.findElement(By.xpath("//*[@id=\"topNavbar\"]/div/div/div[2]/ul/li[2]/a")).click();

        boolean SolutionNavigated = driver.findElement(By.xpath("//a[@id='edit-solution-function']")).isEnabled();

		if(SolutionNavigated) {
			System.out.println("Navigated to Solution");
		}

		driver.navigate().back();

		//Resources
		driver.findElement(By.xpath("//*[@id=\"topNavbar\"]/div/div/div[2]/ul/li[3]/a")).click();
		boolean ResourcesNavigated =driver.findElement(By.xpath("//h1[contains(text(),'Intelligent Automation Resources')]")).isEnabled();

		if(ResourcesNavigated) {
			System.out.println("Navigated to Resources");
		}

		//Beyond RPA
		driver.findElement(By.xpath("//*[@id=\"topNavbar\"]/div/div/div[2]/ul/li[4]/a")).click();
		boolean BeyondRPANavigated =driver.findElement(By.xpath("//h1[contains(text(),'Robotic Process Automation (RPA)')]")).isEnabled();

		if(BeyondRPANavigated) {
			System.out.println("Navigated to Beyond RPA");
		}

		//Company
		driver.findElement(By.xpath("//a[contains(text(),'Company')]")).click();
		boolean CompanyNavigated =driver.findElement(By.xpath("//h1[contains(text(),'About Automation Anywhere')]")).isEnabled();

		if(CompanyNavigated) {
			System.out.println("Navigated to Company");
		}

		driver.quit();
	}



}
