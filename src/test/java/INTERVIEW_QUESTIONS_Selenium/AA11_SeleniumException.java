package INTERVIEW_QUESTIONS_Selenium;

public class AA11_SeleniumException {
	
	/*
	 * 
	 * 
	 * 
1. NoSuchElementException: 
================================
Occurs when the WebDriver fails to find an element on the page using the provided locator strategy.
	 * 
	 * try {
             WebElement element = driver.findElement(By.id('nonExistentId'));
           }
           
       catch (NoSuchElementException e)
        {
         System.out.println('Element not found: ' + e.getMessage());
        }
        
        
        
        
2.ElementNotVisibleException:
===================================
  Thrown when the WebDriver can find an element in the DOM, but it is not visible to the user at the moment,
   thus making it unclickable.
          
          try {
                  WebElement element = driver.findElement(By.id('hiddenElement'));
                  element.click();
              } 
        catch (ElementNotVisibleException e) 
              {
    
               System.out.println('Element is not visible: ' + e.getMessage());
              }
              
              
              
              
3.StaleElementReferenceException: 
=====================================
  This exception is thrown when a previously located element is no longer attached to the DOM. 
  This can happen if the page has been refreshed or if DOM elements have been updated dynamically.
              
 try 
     {
      WebElement element = driver.findElement(By.id('dynamicElement'));                                 
      driver.navigate().refresh();   // Some operation that causes the page to refresh
      element.click();               // This would throw StaleElementReferenceException
     } 
catch (StaleElementReferenceException e) 
{
    System.out.println('The referenced element is stale: ' + e.getMessage());
}




4.TimeoutException:
=====================================
 Triggered when a command takes too long to complete, usually related to implicit or explicit waits.

WebDriverWait wait = new WebDriverWait(driver, 10);
try {
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.id('slowLoadingElement')));
} catch (TimeoutException e) 
{
    System.out.println('The operation timed out: ' + e.getMessage());
}



5.NO SUCH FRAME EXCEPTION:
=======================================
 The NoSuchFrameException is an exception that is thrown when the WebDriver attempts to switch to a frame or an iframe that does not exist on the current page.
  Frames and iframes are used in HTML to embed one document within another, allowing for the separation of content and better layout management. 

Causes of NoSuchFrameException:
---------------------------------
1.Incorrect Frame Identifier:The frame you are attempting to switch to might not exist.
 This can happen if the identifier (name, index, or WebElement) used to locate the frame is incorrect.

2.Timing Issues:If the frame is dynamically loaded and the WebDriver attempts to switch to it before it is available, 
this exception will occur.

3.Back to Parent Frame:If your code attempts to switch to a frame and then tries to move back to a parent frame without being in the correct frame,
 it might lead to this exception.
 
 4.Navigational Context: If the WebDriver is in a different context (like a new window or tab) and the frame is only present in the parent context.

How to Resolve NoSuchFrameException.
-------------------------------------
1.Verify Frame Existence: Ensure that the frame you are trying to switch to exists on the current page. 
This can be done by inspecting the page's HTML structure.

2.Use Explicit Waits:
Implement explicit waits to allow the frame to load before switching:

 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
 // Switch to the first frame (by index or name)
 wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(0)); 

6.NoSuchWindowException
======================================




7.SessionNotCreatedException
========================================





8.ElementNotInteractableException
========================================





9.InvalidSelectorException
========================================





10.IllegalStateException
=======================================








	 */

}
