package com.eCart.test;

 
import java.sql.SQLException;

import com.eCart.adminfunctions.CheckQuantity;
import com.eCart.adminfunctions.CheckUserDetails;
import com.eCart.userfunctions.UserLogin;
import com.eCart.userfunctions.ViewProducts;
import com.eCart.utility.ChoiceSelection;
import com.eCart.utility.Services;

public class TestClass{
	public static void main(String[] args) {
		ChoiceSelection check = new ChoiceSelection();
		check.HomePage();
	}
}
