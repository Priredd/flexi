package loginpageTesting;



	
	
		
	//	import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

		public class  Openloginpage 
		{
		    public static void main(String[] args) 
		    {
		        WebDriver driver = new ChromeDriver();

		        driver.get("https://www.flexiquiz.com/account/login");
		        driver.manage().window().maximize();
		        driver.findElement(By.id("UserName")).sendKeys("reddypri90.pr@gmail.com");
		       driver.findElement(By.id("Password")).sendKeys("Chini@143");
		       driver.findElement(By.id("loginNow")).click();
		        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		       // driver.findElement(By.id("onetrust-accept-btn-handler")).click();
               
		      		      //  driver.quit();
		    }
		}

		

	


