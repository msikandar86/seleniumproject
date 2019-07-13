package MyPackage1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ContactForm1 {

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
				
				driver.get("https://qatestid12.wixsite.com/qaspecialist");
				
				WebDriverWait wait2 = new WebDriverWait(driver,50);
				wait2.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"comp-ifgtula74label\"]")));
				
				//driver.wait(10);
				
				WebElement lnkContact;
				lnkContact = driver.findElement(By.xpath("//*[@id=\"comp-ifgtula74label\"]"));
				lnkContact.click();
				
				WebElement txtName, txtEmail, txtSubject, txtMessage, btnLogin;
				
				txtName = driver.findElement(By.xpath("//*[@id=\"comp-jhrgftz1input\"]"));
				txtName.sendKeys("Muhammad Sikandar");
				
				txtEmail = driver.findElement(By.xpath("//*[@id=\"comp-jhrgftz1input\"]"));
				txtEmail.sendKeys("muhammad.sikandar86@live.com");
				
				txtSubject = driver.findElement(By.xpath("//*[@id=\"comp-jhrgh32ainput\"]"));
				txtSubject.sendKeys("Contact Details");
				
				txtMessage = driver.findElement(By.xpath("//*[@id=\"comp-jhrgk2pstextarea\"]"));
				txtMessage.sendKeys("This is my contact details");
				
				btnLogin = driver.findElement(By.xpath("//*[@id=\"comp-jhrgemmllink\"]"));
				btnLogin.click();
				
				String title = "Thank"; 
				String actualpagetitle = "";
				actualpagetitle = driver.getTitle();
				System.out.println(actualpagetitle);
				
				if(actualpagetitle.contentEquals(title))
				{
					System.out.println("Test Passed!");
				}			
				else
				{
					System.out.println("Test Failed!");
				
				
				
				//System.out.println("Test Passed!");
				//driver.close();		
				//driver.quit();

	}

}
