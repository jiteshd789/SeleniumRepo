package INTERVIEW_QUESTIONS_Selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A9_GoogleDynamicSearchUsingDynamicXpath {
	
	
	
	public static void main(String[] args)
	{
	
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();  //delete all cookies.
	
	//dynamic wait
	driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
	driver.get("https://www.google.com");
	
	
	driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("Jitesh");
	
List<WebElement> list =driver.findElements(By.xpath("//ul[@role='listbox']//li/descendant::div"));

//ul[@role='listbox']//li/descendant::div

System.out.println("Total number of suggestions in search box:" + list.size());


	
	
	}	

}
