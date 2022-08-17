import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;  


public class First {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Java with Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//Launching website
		driver.navigate().to("https://www.google.com/");
		
		//Maximize the testing chrome window
		driver.manage().window().maximize();
		
		// Click on the search text box and send value  
		driver.findElement(By.name("q")).sendKeys("Amazon",Keys.ENTER);
		
		//Alternate ||WebElement r = driver.findElement(By.name("q")); r.sendKeys(Keys.RETURN);
		
	}

}
