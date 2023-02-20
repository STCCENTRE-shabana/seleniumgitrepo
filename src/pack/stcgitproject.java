package pack;


	 
	import org.openqa.selenium.By;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.testng.annotations.Test;
	public class stcgitproject {
	

		@Test
		public void launchbrowser() throws InterruptedException {
			
				
				
			  System.setProperty("webdriver.gecko.driver","C:\\selenium\\geckodriver-v0.29.1-win64\\geckodriver.exe");
			  WebDriver driver=new FirefoxDriver();
			  driver.get("http://localhost/orangehrm/web/index.php/auth/login");
			  Thread.sleep(5000);
			  WebElement username=driver.findElement(By.name("username"));
				username.sendKeys("abhijith");

				WebElement password=driver.findElement(By.name("password"));
				password.sendKeys("Abhijith@2000");
				
				WebElement login=driver.findElement(By.xpath("//button[normalize-space()='Login']"));
	  login.click();
	  
	  Thread.sleep(5000);
	  

	  WebElement PIM=driver.findElement(By.xpath("//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'][normalize-space()='PIM']"));
	  PIM.click();
	  
	  Thread.sleep(5000);
	  
	  WebElement addemployee=driver.findElement(By.xpath("//a[normalize-space()='Add Employee']"));
	  addemployee.click();
	  
	  Thread.sleep(5000);
	  
	  WebElement firstname=driver.findElement(By.name("firstName"));
		firstname.sendKeys("Abin");
		
		 
		
		WebElement middlename=driver.findElement(By.name("middleName"));
		middlename.sendKeys("");
		
		
		
		WebElement lastname=driver.findElement(By.name("lastName"));
		lastname.sendKeys("S");
		
		Thread.sleep(5000);
		
		
		WebElement employeeid=driver.findElement(By.xpath("//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@class='oxd-input oxd-input--active']"));
		
		
		Thread.sleep(5000);
		    
		 
		String s = Keys.chord(Keys.CONTROL, "a");
	    employeeid.sendKeys(s);
	    employeeid.sendKeys(Keys.DELETE);
	    
	    Thread.sleep(2000);
	    
	    
	    employeeid.sendKeys("11");
		
	    Thread.sleep(2000);
	    
		
		
		 WebElement save=driver.findElement(By.xpath("//button[normalize-space()='Save']"));
		  save.click();
		  
		  Thread.sleep(5000);
		  
		
		
		
		
		
		
		 
		
		  }

		
			
		}


}
