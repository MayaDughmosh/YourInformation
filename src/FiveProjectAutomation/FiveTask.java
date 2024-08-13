package FiveProjectAutomation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FiveTask {
	WebDriver driver= new ChromeDriver();

	@BeforeTest 
	public void SetUp() {
		driver.get("http://127.0.0.1:5500/index.html");
		driver.manage().window().maximize();
		
	}
	
	
	
	@Test(priority =1)
	public void MyTest() {
	WebElement NameInput=driver.findElement(By.id("input"));
	WebElement Password=driver.findElement(By.id("input1"));
	WebElement NumberInput=driver.findElement(By.id("input2"));
	WebElement DateInput=driver.findElement(By.id("input3"));
	WebElement Color=driver.findElement(By.id("input4"));
	NameInput.sendKeys("maya");
	Password.sendKeys("maya1234");
	NumberInput.sendKeys("0776235787");
	DateInput.sendKeys("02/04/2002");
	WebElement SubmitButton=driver.findElement(By.xpath("//button[@type='submut']"));
	SubmitButton.click();
	//WebElement facebookpage=driver.findElement(By.linkText("our facebook page"));
	//facebookpage.click();
	//WebElement instagrampage=driver.findElement(By.partialLinkText("instagram"));
	//instagrampage.click();
	driver.findElement(By.xpath("//img[@src='https://th.bing.com/th/id/OIP.RW_wD5FznDL-C5OAiFh6_gHaFj?rs=1&amp;pid=ImgDetMain']")).click();
		
	}

}
