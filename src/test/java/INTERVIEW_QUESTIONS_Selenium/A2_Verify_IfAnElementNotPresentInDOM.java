/*
package INTERVIEW_QUESTIONS_Selenium;

public class A2_Verify_IfAnElementNotPresentInDOM {
	
	To verify the absence of an element in DOM,use findElements() method.
	This method does not throw an exception if the element is not found and
	instead returns an empty list.
	
	-It prevents unnecessary exceptions like No SuchElementException.
	
	List<WebElement> elements= driver.findElements(By.id(""));
	
	if(elements.isEmpty())
	{
		System.out.println("Element is not present in DOM");
		
	}
	else
	{
		System.out.println("Element is present in DOM");
	}
}

*/