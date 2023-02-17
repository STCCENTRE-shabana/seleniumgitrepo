package pack;

public class Orangehrmpjt {

	public void employee() {
	
	System.setProperty("webdriver.gecko.driver","E:\\Selenium Webdriver\\geckodriver-v0.29.1-win64\\geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("http://localhost/orangehrm/web/index.php/auth/login");
	
	driver.findElement(By.name("username")).sendKeys("nandustc1");
	driver.findElement(By.name("password")).sendKeys("Nandu@1234");
	 
	driver.findElement(By.xpath("//html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
	System.out.println("Login Successfull");
	
	driver.findElement(By.xpath("//html/body/div/div[1]/div[1]/aside/nav/div[2]/ul/li[2]/a/span")).click();  
	driver.findElement(By.xpath("//html/body/div/div[1]/div[1]/header/div[2]/nav/ul/li[3]/a")).click();
	 
	System.out.println("Add Employee page opened")
			
	}
	}


