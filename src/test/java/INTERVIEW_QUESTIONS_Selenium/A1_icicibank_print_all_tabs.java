package INTERVIEW_QUESTIONS_Selenium;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A1_icicibank_print_all_tabs {
	
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.icicibank.com/");
		
		Thread.sleep(3000);
		
		 // List to hold tab names
		List<String> tabnames = new ArrayList<>();
		
		 // Add the tab names using their respective XPath
		tabnames.add(driver.findElement(By.xpath("//span[text()='Accounts']")).getText() );
		tabnames.add(driver.findElement(By.xpath("//span[text()='Deposits']")).getText() );
		tabnames.add(driver.findElement(By.xpath("//span[text()='Payments']")).getText() );
		tabnames.add(driver.findElement(By.xpath("//span[text()='Cards']")).getText() );
		tabnames.add(driver.findElement(By.xpath("//span[text()='Loans']")).getText() );
		tabnames.add(driver.findElement(By.xpath("//span[text()='Investments']")).getText() );
		tabnames.add(driver.findElement(By.xpath("//span[text()='Insurance']")).getText() );
		tabnames.add(driver.findElement(By.xpath("//span[text()='Special Services']")).getText() );
		tabnames.add(driver.findElement(By.xpath("//span[text()='Knowledge Hub']")).getText() );
		
		
		// Print the tab names
		for(String tabname:tabnames) 
		{
			System.out.println(tabname);
		}
		
	
		driver.quit();
	}

}
