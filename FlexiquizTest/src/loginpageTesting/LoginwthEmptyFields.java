package loginpageTesting;

//import java.time.Duration;

//import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginwthEmptyFields 

{
    static WebDriver driver;
	
	public static void validate(String error_message,String message)
	{
		if(error_message.equals(message))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
		
	}
	
	public static void loginWithEmptyFields()
	{
		
		
		String error_message ="The Email / Username field is required.";
		String message = driver.findElement(By.id("userNameValidationMessage")).getText();
		validate(error_message,message);
		
		
		
	}
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		 
		driver.get("https://www.flexiquiz.com/account/login");
		driver.findElement(By.id("loginNow")).click();
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	    //driver.findElement(By.id("onetrust-accept-btn-handler")).click();
		
		
		
		
		
	}

	

}
