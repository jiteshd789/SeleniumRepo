package JiteshTestScripts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tiger {
	
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver =new ChromeDriver();
		driver.get("https://safestepsphaseonecelery.azurewebsites.net/admin/WSPApp/devicedata/?p=1");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.id("id_password")).sendKeys("WSP@2024");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		// Simulate retrieving numbers from device (this is an example, change according to your actual implementation)
        List<Integer> numbers = retrieveNumbersFromPage(driver);
        
       // Close the web driver
       // driver.quit();

        // Finding duplicates and missing numbers
        findDuplicatesAndMissing(numbers);
    }

    private static List<Integer> retrieveNumbersFromPage(WebDriver driver) {
        List<Integer> numbers = new ArrayList<>();
        
        // Example of finding elements that contain numbers (change this according to your actual HTML)
        List<WebElement> numberElements = driver.findElements(By.className("field-seq_no")); 

        for (WebElement element : numberElements) {
            try {
                int number = Integer.parseInt(element.getText().trim());
                numbers.add(number);
            } catch (NumberFormatException e) {
                System.out.println("Invalid number format: " + element.getText());
            }
        }
        
        return numbers;
    }
    
    private static void findDuplicatesAndMissing(List<Integer> numbers) {
        Set<Integer> numberSet = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();
        Set<Integer> missing = new HashSet<>();
        
        // Finding duplicates
        for (int number : numbers) {
            if (!numberSet.add(number)) {
                duplicates.add(number);
            }
        }

        // Finding missing numbers
        int maxNumber = Collections.max(numbers);

        for (int i = 1; i <= maxNumber; i++) {
            if (!numberSet.contains(i)) {
                missing.add(i);
            }
        }

        // Output results
        System.out.println("Duplicates: " + duplicates);
        System.out.println("Missing numbers: " + missing);
    }
	}

