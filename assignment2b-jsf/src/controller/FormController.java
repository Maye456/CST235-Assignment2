package controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import beans.User;

@ManagedBean
@ViewScoped
public class FormController 
{
	public String onSubmit()
	{
		// Get user values from input form
		FacesContext context = FacesContext.getCurrentInstance();
		User user = context.getApplication().evaluateExpressionGet(context, "#{user}", User.class);
		
		// Display user object in console
		System.out.println("You clicked the submit button");
		System.out.println("The first name is " + user.getFirstName());
		System.out.println("The last name is " + user.getLastName());
		
		// Put user data in the POST request
		FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put("user", user);
		
		// Show next page
		return "TestResponse.xhtml";
	}
	
	public String onFlash()
	{
		// Get user values from input form
		FacesContext context = FacesContext.getCurrentInstance();
		User user = context.getApplication().evaluateExpressionGet(context, "#{user}", 
				User.class);
		
		System.out.println("The flash was clicked!");
		
		// Put user data in the POST request
		FacesContext.getCurrentInstance().getExternalContext().getFlash().put("user", user);
				
		// Show next page
		return "TestResponse2.xhtml";
	}
}