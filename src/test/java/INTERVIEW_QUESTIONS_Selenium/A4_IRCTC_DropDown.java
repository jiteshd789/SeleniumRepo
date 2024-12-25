package INTERVIEW_QUESTIONS_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class A4_IRCTC_DropDown {
	
	    public static void main(String[] args) 
	    {
	        // Set the path for the WebDriver executable
	        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver.exe");

	        // Initialize the WebDriver
	        WebDriver driver = new ChromeDriver();
try {
	        // Step 1: Navigate to the IRCTC website
	        driver.get("https://www.irctc.co.in/");

	            // Wait for the page to load (consider using WebDriverWait for better practice)

	            // Step 2: Locate the 'From' dropdown & Select an option (e.g., 'New Delhi')
	            WebElement fromStationDropdown = driver.findElement(By.id("fromStation"));
	            Select fromSelect = new Select(fromStationDropdown);
	                   fromSelect.selectByVisibleText("New Delhi");
	                   

	            // Step 3: Locate the 'To' dropdown & Select an option (e.g., 'Mumbai')
	            WebElement toStationDropdown = driver.findElement(By.id("toStation"));
	            Select toSelect = new Select(toStationDropdown);
	                   toSelect.selectByVisibleText("Mumbai");

	            // Here you can perform additional actions like clicking the search button
	            // Example: driver.findElement(By.id('searchButton')).click();

	            // Optional: Verify selections (you can write assertions here)
	            String selectedFrom = fromSelect.getFirstSelectedOption().getText();
	            String selectedTo = toSelect.getFirstSelectedOption().getText();
	            
	            System.out.println("Selected From: " + selectedFrom);
	            System.out.println("Selected To: " + selectedTo);

	        } 
	        
	        catch (Exception e)

	        {
	            e.printStackTrace();
	        } 
	        
	finally 
	        {
	            // Close the browser
	            driver.quit();
	        }
	    }
	}


