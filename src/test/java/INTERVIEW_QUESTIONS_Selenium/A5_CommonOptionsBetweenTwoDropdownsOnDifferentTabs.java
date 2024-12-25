package INTERVIEW_QUESTIONS_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class A5_CommonOptionsBetweenTwoDropdownsOnDifferentTabs {
	
	    public static void main(String[] args)
	    {
	        // Set the path for the WebDriver executable
	        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver.exe");

	        // Initialize the WebDriver
	        WebDriver driver = new ChromeDriver();
try {
	        // Step 1: Navigate to the initial webpage
	        driver.get("http://example.com"); // Replace with your actual URL
	            
	            
	            

	            // Step 2: Locate the FIRST DROPDOWN
	            Select firstDropdown = new Select(driver.findElement(By.id("firstDropdown"))); 
	            
	            // Step 3: Click the link to open a new tab
	            WebElement linkToSecondPage = driver.findElement(By.id("linkToSecondPage")); 
	            linkToSecondPage.click();

	            
	            // Step 4: Switch to the new tab
	            for (String tab : driver.getWindowHandles()) 
	            {
	                driver.switchTo().window(tab);
	            }

	            //{This loop iterates through all open tabs (windows), 
	            //and switchTo().window(tab) switches the context to the newly opened tab. 
	            //This allows interactions with elements in that tab.}
	            
	            // Step 5: Locate the SECOND DROPDOWN
	            Select secondDropdown = new Select(driver.findElement(By.id("secondDropdown"))); 
	            
	            

	            // Step 6: Get options from both dropdowns
	            List<WebElement> firstOptions = firstDropdown.getOptions();
	            List<WebElement> secondOptions = secondDropdown.getOptions();
	            

	            // Collect options in a Set for easy comparison.  
	            //Initializes a HashSet to store the options from the first dropdown. 
	            Set<String> firstDropdownOptions = new HashSet<>();
	            
	            //The loop iterates through each option, retrieves its visible text with getText(), 
	            //and adds it to the set after trimming whitespace
	            for (WebElement option : firstOptions)
	            {
	                firstDropdownOptions.add(option.getText().trim());
	            }

	            
	           //Initializes an ArrayList to store common options.
	            
	            List<String> commonOptions = new ArrayList<>();
	            
	    //It iterates through options of the second dropdown, checks if the option text exists in the firstDropdownOptions set. 
	    //If it does, the common option is added to the list.
	            
	            for (WebElement option : secondOptions) 
	            {
	                String optionText = option.getText().trim();
	                
	                if (firstDropdownOptions.contains(optionText))
	                {
	                    commonOptions.add(optionText);
	                }
	            }

	            
	            // Step 7: Output common options
	            System.out.println("Common Options:");
	            
	            for (String commonOption : commonOptions) 
	            {
	                System.out.println(commonOption);
	            }

	        }

finally 
            {
	            // Close the browser
	            driver.quit();
	        }
	    }
	}

//--------------------------------------------------------------------------------------------------


