package MyPackage1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestCheckOut1 {

	public static void main(String[] args) throws InterruptedException {
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

		String title = "https://demo.opencart.com/index.php?route=account/account"; 
		String actualpagetitle = "";
		actualpagetitle = driver.getCurrentUrl();
		System.out.println(actualpagetitle);
		
		if(actualpagetitle.contentEquals(title))
		{
			driver.get("https://demo.opencart.com/index.php?route=product/product&product_id=47&search=HP+LP3065");
			
			WebElement CheckoutButton;  
			CheckoutButton = driver.findElement(By.id("button-cart"));
			CheckoutButton.click();
			
			Thread.sleep(10000);
			
			//WebDriverWait wait2 = new WebDriverWait(driver,50);
			//wait2.until(ExpectedConditions.presenceOfElementLocated(By.className("alert alert-success alert-dismissible")));
			
			WebElement CheckoutLink;  
			CheckoutLink = driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[5]/a/span"));
			CheckoutLink.click();
			
			Thread.sleep(10000);
			
			WebElement BtnContinue;  
			BtnContinue = driver.findElement(By.id("button-payment-address"));
			BtnContinue.click();
			
			Thread.sleep(10000);
			
			WebElement BtnShippingContinue;  
			BtnShippingContinue = driver.findElement(By.id("button-shipping-address"));
			BtnShippingContinue.click();
			
			//Thread.sleep(10000);
			
			//WebElement openfilter  = driver.findElement(By.xpath("//*[@id=\\\"collapse-shipping-method\\\"]/div/p[4]/textarea"));
			//JavascriptExecutor jse = (JavascriptExecutor)driver;
			//jse.executeScript("arguments[0].scrollIntoView()", openfilter);
			//openfilter.click();
			
			Thread.sleep(5000);
			WebElement openfilter  = driver.findElement(By.xpath("//*[@id=\"collapse-shipping-method\"]/div/p[4]/textarea"));
			JavascriptExecutor jse = (JavascriptExecutor)driver;
			jse.executeScript("arguments[0].scrollIntoView()", openfilter);			
			openfilter.click();
			
			Thread.sleep(2000);
			
			//Thread.sleep(10000);
			
			WebElement BtnShippingContinue1;  
			BtnShippingContinue1 = driver.findElement(By.id("button-shipping-method"));
			BtnShippingContinue1.click();

			//BtnShippingContinue.click();
			
			Thread.sleep(10000);
			
			WebElement chkAgree;  
			chkAgree = driver.findElement(By.name("agree"));
			chkAgree.click();
			
			Thread.sleep(10000);
			
			WebElement BtnPaymentMethod;  
			BtnPaymentMethod = driver.findElement(By.id("button-payment-method"));
			BtnPaymentMethod.click();
			
			Thread.sleep(10000);
			
			WebElement BtnConfirmOrder;  
			BtnConfirmOrder = driver.findElement(By.id("button-confirm"));
			BtnConfirmOrder.click();
			
			WebElement BtnContinueLastOrder;  
			BtnContinueLastOrder = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/a"));
			BtnContinueLastOrder.click();
			
			Thread.sleep(5000);
			
			WebElement myaccount;
			myaccount = driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a"));
			myaccount.click();
			
			WebElement logout;
			logout = driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[5]/a"));
			logout.click();
			
			System.out.println("Test PASSED");
			
		}			
		else
		{
			System.out.println("Test Failed!");
		
		}
	}
	

}
