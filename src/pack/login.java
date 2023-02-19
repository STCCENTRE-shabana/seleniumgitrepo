package pack;

public class login {
	  public void launchbrowser() throws InterruptedException {

		  System.setProperty("webdriver.gecko.driver","E:\\geckodriver-v0.29.1-win64\\geckodriver.exe");
		 WebDriver driver=new FirefoxDriver();

		 driver.get("http://localhost/orangehrm/orangehrm-5.2/orangehrm-5.2/web/index.php/auth/login");

		 Thread.sleep(5000);

		 driver.findElement(By.name("username")).sendKeys("Rachel");
		 driver.findElement(By.name("password")).sendKeys("Rachel@2023");

		 WebElement login=driver.findElement(By.xpath("//button[normalize-space()='Login']"));

		 login.click();

		 Thread.sleep(5000);

		 WebElement PIM=driver.findElement(By.xpath("//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'][normalize-space()='PIM']"));

		 PIM.click();

		 Thread.sleep(5000);

		 WebElement addemployee=driver.findElement(By.xpath("//a[normalize-space()='Add Employee']"));

		 addemployee.click();

		 }


}
