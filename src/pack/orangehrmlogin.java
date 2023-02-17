package pack;

public class orangehrmlogin 
{
public void login()
	
{	
	  {
		  System.setProperty("webdriver.gecko.driver","E:\\Selenium Webdriver\\geckodriver-v0.29.1-win64\\geckodriver.exe");
	  
		  WebDriver driver=new FirefoxDriver();
		  driver.get("http://localhost/orangehrm/web/index.php/auth/login");
		   driver.findElement(By.name("username")).sendKeys("Anandhu");
		  driver.findElement(By.name("password")).sendKeys("Anandhu@2022");
		  
		  driver.findElement(By.xpath("//html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"))
		  .click();	
}
}