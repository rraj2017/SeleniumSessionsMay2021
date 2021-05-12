package SeleniumSessions;

public class CustomCSSSelector {

	public static void main(String[] args) {
		//id: #{id}
		// #username - using id value ---#idValue
		// input#username- using html tag--->htmltag#idValue
		// input[id='username']- using one attribute with html tag
		//  input[id='username'][type='email']-- using two attributes with html tag
		
		//class: .{classname}
		
		//syntax---> .classname ,.c1.c2.c3 ,htmltag.c1.c2.c3...cn
		//1 .form-control.private-form__control.login-email ---- in this example for the class name there are three classes available with spaces 
		//during construction of css selector , we remove the spaces between the classes
		//by providing dots in between 
		
		//2. using input tag ---htmltag.classname
	//	input.form-control.private-form__control.login-email  --- > input.c1.c2.c3
		
		//3.using html tag with one class only
		// input.login-email - Example 1
		// button.login-submit - Example 2
		
		//text: 
		//Example 1 : input[id^='username']---starting text
	//	input[id$='username'] --->ending text
		//  input[id$='name']---- ending text
		
		//example for contains in CSS selector (for contains special symbol is *)
		
		// input[id*='username'] -->contains text
		// input[id*='user']
		
		//parent and child concept in CSS: ----->parent>chldtag
		//Example : div>input[id='username']
		
	//	div.private-form__input-wrapper>input#username --Example with div tag class name
		
		
		

	}

}
