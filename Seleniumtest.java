import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.concurrent.TimeUnit;

public class Seleniumtest {
	WebDriver driver;
	@Before

	public void setUp()
	{
		driver=new FirefoxDriver();
		driver.get("https://gmail.com");
		driver.manage().window().maximize();
	}

	@Test
	public void testWindowAlert() throws Exception{

		// enter a valid email address
		driver.findElement(By.id("Email")).sendKeys("seleniumtest567@gmail.com");

		// enter a valid password
		driver.findElement(By.id("Passwd")).sendKeys("automation");

		// click on sign in button
		driver.findElement(By.id("signIn")).click();
		Thread.sleep(15000);

		// click on compose button
		driver.findElement(By.xpath("//div[@class='z0']//div[contains(text(),'COMPOSE')]")).click();

		// click on attach files icon
		//driver.findElement(By.xpath("//div[contains(@command,'Files')]//div[contains(@class,'aaA')]")).click();


		driver.findElement(By.name("subjectbox")).sendKeys("cinglevue_QA_Challenge");

		//driver.findElement(By.cssSelector("textarea[class='wO nr l1']")).sendKeys("another.email@somedomain.com");

		driver.findElement(By.cssSelector("div[class='Am Al editable LW-avf']")).sendKeys("Testing123"); 

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.cssSelector("img[class='Ha']")).click();


		driver.findElement(By.xpath("//*[@id=':55']/div/div[1]/span/a")).click();
		Thread.sleep(2000);


		driver.findElement(By.xpath("//*[@id='gb']/div[1]/div[1]/div/div[3]/div[1]/a")).click();
		Thread.sleep(500);
		driver.findElement(By.id("gb_71")).click();

	}

	@After
	public void tearDown()
	{
		driver.close();
	}
}
