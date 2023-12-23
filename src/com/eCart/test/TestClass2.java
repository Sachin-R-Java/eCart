package com.eCart.test;

 
import java.sql.SQLException;

import com.eCart.adminfunctions.CheckQuantity;
import com.eCart.adminfunctions.CheckUserDetails;
import com.eCart.userfunctions.UserLogin;
import com.eCart.userfunctions.ViewProducts;
import com.eCart.utility.ChoiceSelection;
import com.eCart.utility.Services;

public class TestClass2{
	public static void main(String[] args) {
		choice();
	}
	public static void choice() {
		System.out.println("------Welcome to Console Based eCart Application------");
		ChoiceSelection check = new ChoiceSelection();
		check.HomePage();
		if(check.HomepageChoiceSelection==1) {
			//check.UserChoice();
			if(check.UserChoiceSelection==1) {
				Services.AddUser();
			}
			else if(check.UserChoiceSelection==2) {
				UserLogin user = new UserLogin();
				user.LoginToApplication();
				//System.out.println(user.username);
				//System.out.println(user.status);
			}
			else if(check.UserChoiceSelection==3) {
				//Services.GetAllProducts();
				ViewProducts view = new ViewProducts();
				view.ViewAllProducts();
			}else if(check.UserChoiceSelection==4) {
				ViewProducts view = new ViewProducts();
				view.ViewAllProducts();
				Services.AddToCart();
				
			}else if(check.UserChoiceSelection==5) {
				
			}else if(check.UserChoiceSelection==6) {
				
			}
		}
		if(check.HomepageChoiceSelection==2) {
			check.AdminChoice();
			if(check.AdminChoiceSelection==1) {
				Services.AddProducts();
			}else if(check.AdminChoiceSelection==2) {
				CheckQuantity quantity = new CheckQuantity();
				quantity.ProductQuantity();
			}else if(check.AdminChoiceSelection==3) {
				CheckUserDetails user = new CheckUserDetails();
				user.GetUserDetails();
			}
		}
	
	}

}
