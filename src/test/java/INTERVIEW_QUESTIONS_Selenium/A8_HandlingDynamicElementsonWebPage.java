package INTERVIEW_QUESTIONS_Selenium;

/*
 * Dynamic Web Elements are those whose attribute values keeps on changing.
 * 
 * Handling Dynamic WebElements:
 * 1.Using contains   : //tagname[contains(@attributename,'attributevalue')]
 * 2.Using starts-with: //tagname[starts-with(@attribute_name, 'attributevalue')]   .  We know the initial part of the attribute values
 * 3.Using Xpath Axes
 * 4.Using Text
 * 5.Using Index
 */

public class A8_HandlingDynamicElementsonWebPage {
	
	//www.facebook.com -->On Login Page-->"Log in" Button id=u_0_5_RU after page refresh id=U_0_5_PQ.
	//We can locate the Login Button using the below techniques even if id element is changing with every refresh.

	
	/*
	 * 1.Using contains: //button[contains(@id,'u_0_5_R')]
	 * 
	 * 2.Using starts-with: //button[starts-with(@ID,'u_0_5_R')]
	 * 
	 * 3.Using XPath Axes : //form[@data-testid='royal_login_form']/descendant::button
	 *                  OR  //form[@id='login_form']/descendant::button
	 * 
	 * 
	 * HTML:
	 * <form id="login_form" data-testid="royal_login_form" action="/login/device-based/regular/login/?login_attempt=1&amp;next=https%3A%2F%2Fwww.facebook.com%2F&amp;lwv=100" method="post">
	 * </div><input type="hidden" autocomplete="off" id="error_box">
	 * <div id="loginform"><input type="hidden" autocomplete="off" id="display" name="display" value="">
	 * <input type="hidden" autocomplete="off" id="isprivate" name="isprivate" value="">
	 * 
	 * <button value="1" class="_42ft _4jy0 _52e0 _4jy6 _4jy1 selected _51sy" id="u_0_5_RU" 
	 * name="login" tabindex="0" type="submit">Log in</button>
	 * 
	 * 
	 * 4.Using Text:  //button[contains(text(),'Log in')]
	 *             OR //button[text(),'Log in']
	 * 
	 * 5.Using Index:  //button[1]
	 */
	
	
	
	
	
	

}
