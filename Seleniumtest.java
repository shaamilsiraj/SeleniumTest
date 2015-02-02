import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


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
		WebElement Email = driver.findElement(By.id("Email"));
		Email.sendKeys("seleniumtest567@gmail.com");

		// enter a valid password
		WebElement Password = driver.findElement(By.id("Passwd"));
		Password.sendKeys("automation");

		// click on sign in button
		WebElement SignIn = driver.findElement(By.id("signIn"));
		SignIn.click();
		Thread.sleep(15000);

		// click on compose button
		WebElement Compose = driver.findElement(By.xpath("//div[@class='z0']//div[contains(text(),'COMPOSE')]"));
		Compose.click();
		
		// enter another email id
		WebElement ToAdd = driver.findElement(By.xpath("//*[@id=':h3']"));
		ToAdd.sendKeys("hr@cinglevue.com");
		
		// enter a subject for the mail
		WebElement Typesub = driver.findElement(By.name("subjectbox"));
		Typesub.sendKeys("CingleVue_QA_Challenge");

		// enter some text in message area
		WebElement Typemsg = driver.findElement(By.cssSelector("div[class='Am Al editable LW-avf']"));
		Typemsg.sendKeys("CingleVue Technical QA Challenge"); 
		Thread.sleep(1000);
		
		// click on close icon
		WebElement Composeclose = driver.findElement(By.cssSelector("img[class='Ha']"));
		Composeclose.click();
		Thread.sleep(1000);
		
		// click on the draft link
		WebElement Draft = driver.findElement(By.xpath("//*[@id=':55']/div/div[1]/span/a"));
		Draft.click();
		Thread.sleep(2000);

		// click on the user drop down
		WebElement user = driver.findElement(By.xpath("//*[@id='gb']/div[1]/div[1]/div/div[3]/div[1]/a"));
		user.click();
		Thread.sleep(500);
		
		// click on sign out 
		WebElement Signout = driver.findElement(By.id("gb_71"));
		Signout.click();

	}

	@After
	public void tearDown()
	{
		// browser will close by exiting the driver
		driver.close();
	}
}
