package MyPackage1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MyAccountCreate1 {

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
		for (int i = 1; i<=5; i++)
		{
		

		
		//driver.manage().window().maximize();
		
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		
		WebElement btnContinue;  
		btnContinue = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[1]/div/a"));
		btnContinue.click();
		
		//WebElement txtFirstName, txtLastName, txtEmail, txtTelephone, txtPassword, txtPasswordConfirm, chkSubscribe;
		
		WebElement Firstname, Lastname, Email, Telephone, Password, cPassword,continuebtn, continueLast, username, passwordcreated, Login;
		Firstname = driver.findElement(By.xpath("//*[@id=\"input-firstname\"]"));
		Firstname.sendKeys("Sikandar");
		
		Lastname = driver.findElement(By.xpath("//*[@id=\"input-lastname\"]"));
		Lastname.sendKeys("Muhammad");
		
		String emailadd = "mhsikandar" + i + "@yopmail.com";
		String passwordentered = "sik123";
		
		Email = driver.findElement(By.xpath("//*[@id=\"input-email\"]"));
		Email.sendKeys(emailadd);
		
		Telephone = driver.findElement(By.xpath("//*[@id=\"input-telephone\"]"));
		Telephone.sendKeys("021-32427222");
		
		Password = driver.findElement(By.xpath("//*[@id=\"input-password\"]"));
		Password.sendKeys(passwordentered);
		
		cPassword = driver.findElement(By.xpath("//*[@id=\"input-confirm\"]"));
		cPassword.sendKeys("sik123");
		
		Thread.sleep(5000);
		WebElement openfilter  = driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div/input[1]"));
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].scrollIntoView()", openfilter);			
		openfilter.click();	
		Thread.sleep(2000);
		
		////*[@id="content"]/form/div/div/input[2]
		continuebtn = driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div/input[2]"));
		continuebtn.click();
		
		String title = "Your Account Has Been Created!"; 
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
		}
		
	
		
		continueLast = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/a"));
		continueLast.click();
		
		driver.get("https://demo.opencart.com/index.php?route=account/logout");
		
		//driver.get("https://demo.opencart.com/index.php?route=account/login");
		
		//username = driver.findElement(By.xpath("//*[@id=\"input-email\"]"));
		//username.sendKeys(emailadd);
		
		//passwordcreated = driver.findElement(By.xpath("//*[@id=\"input-password\"]"));
		//passwordcreated.sendKeys(passwordentered);
		
		
		//*[@id="content"]/div/div[2]/div/form/input
		
		//Login = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input"));
		//Login.click();
		
		

		
		}
		driver.close();		
		driver.quit();
	}
	
	

}
