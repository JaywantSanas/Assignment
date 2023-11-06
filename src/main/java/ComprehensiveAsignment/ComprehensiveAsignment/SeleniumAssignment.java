package ComprehensiveAsignment.ComprehensiveAsignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumAssignment {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.automationanywhere.com/");

		//Verifying logo
		boolean Logo =driver.findElement(By.xpath("//header/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]/img[1]")).isDisplayed();
		if(Logo) {
			System.out.println("Logo is Present");
		}else {
			System.out.println("Logo not Present");
		}

		//AcceptCookies
		WebElement cookie= driver.findElement(By.xpath("//*[@id=\"onetrust-accept-btn-handler\"]"));

		 Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		    wait.until(ExpectedConditions.elementToBeClickable(cookie));

		driver.findElement(By.xpath("//*[@id=\"onetrust-accept-btn-handler\"]")).click();

		//Verifying RequestDemo button
		boolean RequestDemo  = driver.findElement(By.xpath("//a[contains(text(),'Request demo')]")).isEnabled();

		if(RequestDemo) {
			driver.findElement(By.xpath("//a[contains(text(),'Request demo')]")).click();

			boolean FirstName = driver.findElement(By.xpath("//label[@id='LblFirstName']")).isEnabled();

			if(FirstName) {
				driver.findElement(By.xpath("//label[@id='LblFirstName']")).click();
				System.out.println("RequestDemo button is Enabled & Clicked");
			}
		}

		driver.quit();
	}

}
