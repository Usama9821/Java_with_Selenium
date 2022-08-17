import org.openqa.selenium.By;  
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.chrome.ChromeDriver;  

public class First {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Usama Rao\\Documents\\Eclipse\\Java_with_Selenium\\Second\\driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();  
		
		driver.navigate().to("https://www.google.com/");
        
        //Maximize the browser  
         driver.manage().window().maximize();  
         
         // Click on the search text box and send value 
         driver.findElement(By.name("q")).sendKeys("Amazon",Keys.ENTER);
         
         //Scroll down the webpage by 5000 pixels  
         JavascriptExecutor js = (JavascriptExecutor)driver;  
         js.executeScript("scrollBy(0, 200)");
         
         driver.findElement(By.className("r21Kzd")).click();
         
         // Click on the Search button  
         //driver.findElement(By.linkText("Core Java")).click();   
         
         driver.close(); 

	}

}
