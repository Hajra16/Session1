package rankings;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class navigations {

	private static final Object Element = null;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hajra\\eclipse-workspace\\topuni\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		JavascriptExecutor js =  (JavascriptExecutor) driver;
		
		// to launch the app
		driver.get("https://dev.topuniversities.com/events/qs-world-grad-school-tour/india/mumbai/register");
		System.out.println(driver.getTitle());
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().setScriptTimeout(10, TimeUnit.SECONDS);
		
		// closing the cookies button
		driver.findElement(By.id("popup-buttons")).click();
		Thread.sleep(2000);
		
	//	WebElement events = driver.findElement(By.xpath("(//A[@href='/events'][text()='Events'][text()='Events'])[1]"));
	//	Actions nav = new Actions(driver);
	//	nav.moveToElement(events).build().perform();
	//	Thread.sleep(3000);
		
	//	driver.findElement(By.xpath("//*[@id=\"main-menu\"]/li[3]/ul/li[2]/a")).click();
	//	Thread.sleep(3000);
		
		// to scroll the page by pixel
	//	js.executeScript("window.scrollBy(0,1200)");
	//	Thread.sleep(3000);
		
	//	driver.findElement(By.xpath("//A[@href='/events/qs-world-grad-school-tour/india/mumbai'][text()='Mumbai']")).click();
	//	Thread.sleep(3000);
	//	driver.findElement(By.xpath("//*[@id=\"block-system-main\"]/div/div/div[1]/div/div[15]/div/div/a")).click();
	//	Thread.sleep(3000);
		driver.findElement(By.id("edit-field-first-name-und-0-value")).sendKeys("Hajra");
		driver.findElement(By.id("edit-field-last-name-und-0-value")).sendKeys("Test");
		driver.findElement(By.id("edit-mail--2")).sendKeys("hajtest61@mail.com");
		driver.findElement(By.id("edit-pass--2")).sendKeys("test123");
		driver.findElement(By.id("edit-field-erg-1-und-0")).click();
		driver.findElement(By.id("edit-submit--2")).click();
		
		
		Thread.sleep(10000);

		js.executeScript("window.scrollBy(0,-200)");
		
		WebElement dropdown = driver.findElement(By.id("edit-cor"));
		dropdown.click();
		dropdown.clear();
		Thread.sleep(1000);
		dropdown.sendKeys("Pakistan", Keys.ENTER);
		//Thread.sleep(2000);
		//driver.findElement(By.xpath("//input[@id='edit-check-diff-nationality']")).click();
		Thread.sleep(2000);
		
		WebElement dob = driver.findElement(By.id("edit-dob"));
		//dob.sendKeys(" 14   08   1995");
		dob.sendKeys(" 12   12   1990");
	
		
		
		
	}

}
