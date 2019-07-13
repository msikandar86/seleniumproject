package MyPackage1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MyClass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\chromedriver_win32\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		options.addArguments("disable-infobars");
		options.addArguments("--incognito");
		options.addArguments("--ignore-certificate-errors");
        options.addArguments("--disable-popup-blocking");
        
		WebDriver driver = new ChromeDriver(options);
		
		//driver.manage().window().maximize();
		
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		
		WebElement username;
		username = driver.findElement(By.id("input-email"));
		username.clear();
		username.sendKeys("mytc5@gmail.com");
		
		WebElement password;
		password = driver.findElement(By.name("password"));
		password.clear();
		password.sendKeys("123456789");
		
		WebElement loginButton;  
		loginButton = driver.findElement(By.xpath("//input[@type='submit' and @class='btn btn-primary']"));
		loginButton.click();
		
		String strTitle = "My Account";
		String strBrowser = "";
		
		strBrowser = driver.getTitle();
		
		if(strBrowser.contentEquals(strTitle))
		{
			System.out.println("Test Passed!");
		}
		else
		{
			System.out.println("Test Failed");
		}
		
		//WebElement myaccount;
		//myaccount = driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a"));
		//myaccount.click();
		
		//WebElement logout;
		//logout = driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[5]/a"));
		//logout.click();
		
		//*[@id="top-links"]/ul/li[2]/ul/li[5]/a
		
		driver.get("https://demo.opencart.com/index.php?route=account/logout");
		
		driver.close();		
		driver.quit();
		
	}

}
