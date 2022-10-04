package citas;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class AisUsa {
	private WebDriver driver;
	
	By registerPageLocator = By.xpath("// img[@src='/images/masts/mast_register.gif']");
	
	By usernameLocator =By.id("user_email");
	By passwordLocator = By.id("user_password"); 
	
	System.out.println("hola");
	
	@Before
	public void setUp() {
		System.setProperty("webdriver.chrome.driver","./src/test/resources/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://ais.usvisa-info.com/es-co/niv/users/sign_in");
	}
	
	@Test
	public void testAisPage () {
		
			driver.findElement (usernameLocator).sendKeys("albitacopete1946@gmail.com");
			driver.findElement (passwordLocator).sendKeys("ALBACOPETE");
			driver.findElement(By.cssSelector("label[for='policy_confirmed']")).click();
			driver.findElement (By.name("commit")).click();
			driver.findElement (By.xpath("//*[text()='Continuar']")).click();
			driver.findElement (By.xpath("//span[@class='fas fa-calendar-minus fa-lg fa-fw']")).click();
			driver.findElement (By.xpath("//a[contains(text(),'Reprogramar cita')]")).click();
			
			
			
			System.out.print("Register pages was not found");
		}
		

	
	@After
	public void tearDown() {
		
		
	}
	                           
}
