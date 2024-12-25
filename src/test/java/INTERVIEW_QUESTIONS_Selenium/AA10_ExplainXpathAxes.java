package INTERVIEW_QUESTIONS_Selenium;

/*
 * XPath is a query language used to select nodes from an XML document. 
 * In Selenium, XPath is often utilized to locate elements in the DOM (Document Object Model) of web pages.
 *  XPath axes allow you to navigate through the XML structure by finding nodes in relation to the current node. 
 *  Understanding these axes can significantly enhance your ability to write effective and efficient XPath expressions.

Understanding XPath Axes
--------------------------------
XPath provides several axes that specify the relationship of nodes within the XML structure. 

Below are some commonly used axes:
--------------------------------------
1.child: Selects children of the current node.

2.parent: Selects the parent of the current node.

3.ancestor: Selects all ancestors (parents, grandparents, etc.) of the current node.

4.descendant: Selects all descendants (children, grandchildren, etc.) of the current node.

The descendant Axis
The descendant axis in XPath is particularly useful for selecting all levels of descendants within the context of the current node. 
 means it targets not only immediate children but all nested children under the current node.

Syntax: currentNode/descendant::node()

Example Scenario:
Suppose you have the following HTML structure:

<div id='parent'>
    <div class='child'>
        <span>Child 1</span>
    </div>
    <div class='child'>
        <span>Child 2</span>
        <div>
            <span>Grandchild 1</span>
        </div>
    </div>
</div>
Copy code 
If you want to select all span elements that are descendants of the div with the id parent,
 you can use the following XPath expression:

//div[@id='parent']/descendant::span
 * 
 * 
 * 
 * 
 * -----------------------------------------------------------------------------------
 * 5.sibling: Selects siblings of the current node.
 * 
   6.following: Selects nodes that appear after the current node in the document order.
   
   7.preceding: Selects nodes that appear before the current node in the document order.
   
   8.self: Selects the current node itself.
   
   
   
 */



public class AA10_ExplainXpathAxes {
	

}
