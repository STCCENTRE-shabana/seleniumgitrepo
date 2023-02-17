package pack;

public class orangeclass {
	public void project() {
		
		
			System.setProperty("webdriver.chrome.driver","C:\\selenium webdriver\\chromedriver_win32\\chromedriver.exe");
			 WebDriver driver=new chromeDriver();
			 driver.get("http://localhost/orangehrm/web/index.php/auth/login");
			 driver.findElement(By.name("username")).sendKeys("athirastc");
			 driver.findElement(By.name("password")).sendKeys("athira1421");
			 
			 driver.findElement(By.xpath("//html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
	}

}
