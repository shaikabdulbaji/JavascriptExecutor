package aIntroduction;

public class Sample {
	
	/*
	 * JavaScriptExecutor is an interface that is used to execute JavaScriprt through 
	   selenium webdriver. JavaScript is a programming language that interacts with 
	   HTML in a browser, and to use this function in Selenium, JavascriptExecutor 
	   is required. 
	   JavascriptExecutor Provides Two Methods: ExecuteScript. ExecuteAsyncScript.
	  
	   id - document.getElementById('email');
	   name - document.getElementsByName('email')[0];
	   className - document.getElementsByClassName('inputtext _55r1 _6luy')[0];
	   tagName - document.getElementsByTagName('input')[2];
	   CSS - document.querySelector('#email');
	   
	   Syntax for Xpath : document.evaluate(xpathExpression, contextNode, namespaceResolver,
	   resultType, result).singleNodeValue;
	   Xpath - document.evaluate("//input[@id='email']",document,null,XPathResult.
	   FIRST_ORDERED_NODE_TYPE,null).singleNodeValue;
	   
	   
	 * document.getElementById('email');
	 * We give this statements in console.
	   		1. document -> All webpage is called as document.
	   		2. We have to find the element by using some attributes like id, name, type etc...
	   		   getElementById('email');
	   		   email -> attribute value.
	   		   
	 * document.getElementsByName('email')[0];
	 		1. By giving this statement we get more than one element then we use index method.
	 		
	 * For entering any text into that element we use this below command
	   document.getElementById('email').value='shaik';
	   value='text' --> It will type any text into that element
	   
	 * For retriving any text from that element we use this below command
	   document.getElementById('email').value;
	   value='text' --> It will type any text into that element in console not in browser
	 		
	 */

}
