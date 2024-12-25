package INTERVIEW_QUESTIONS_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A3_SendKeyboardUpandDownKeysInTextBox {
	
	    public static void main(String[] args) {
	        // Set the path to your WebDriver executable; ensure you have the correct driver for your browser
	        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver.exe");

	        // Initialize the ChromeDriver
	        WebDriver driver = new ChromeDriver();

	        try {
	            // Navigate to your web page
	            driver.get("http://example.com"); // Replace with your URL

	            // Locate the textbox element
	            WebElement textbox = driver.findElement(By.id("myTextbox")); // Use the appropriate selector

	            // Clear the textbox if necessary
	            textbox.clear();

	            // Send the up arrow key
	            textbox.sendKeys(Keys.ARROW_UP);
	            // Additional logic for processing after pressing 'up' can be added here

	            // Send the down arrow key
	            textbox.sendKeys(Keys.ARROW_DOWN);
	            // Additional logic for processing after pressing 'down' can be added here
	            
	        } finally {
	            // Close the browser
	            driver.quit();
	        }
	    }
	}


//---------------------------------------------------------------------------------------------

//Send Arrow Keys: Use the sendKeys() method with Keys.ARROW_UP and Keys.
//ARROW_DOWN to simulate pressing the up and down arrow keys, respectively.




