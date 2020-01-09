
package EdurekaMain;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Main  {
WebDriver driver;


	public  String invokeBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\bhumikagupta\\Downloads\\chromedriver_win32 (6)\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://www.edureka.co/");
		driver.manage().window().maximize();
		String title= driver.getTitle();
		System.out.println(title);
		return(title);
	}
	public String login() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@data-gi-action='Login']")).click();
		driver.findElement(By.xpath("//input[@id='si_popup_email']")).sendKeys("bhumikagupta924@gmail.com");
		driver.findElement(By.xpath("//input[@type='password'][@placeholder='Enter your Password']")).sendKeys("Bank1995@");
		driver.findElement(By.xpath("//button[@class='clik_btn_log btn-block']")).click();
		String URL= driver.getCurrentUrl();
		System.out.println(URL);
		return (URL);
		
	}

}