package com.eCart.utility;

import java.util.Scanner;

import com.eCart.adminfunctions.CheckQuantity;
import com.eCart.adminfunctions.CheckUserDetails;
import com.eCart.adminfunctions.CheckUserHistory;
import com.eCart.userfunctions.UserLogin;
import com.eCart.userfunctions.ViewProducts;

public class ChoiceSelection4Final {
	static Scanner scan = new Scanner(System.in);
	public static int HomepageChoiceSelection;
	public static int UserChoiceSelection;
	public static int AdminChoiceSelection;
	public static int GuestChoiceSelection;

	public static void HomePage() {
		Scanner scan = new Scanner(System.in);
		System.out.println("------Welcome to Console Based eCart Application------");
		System.out.println("------------------------------------------------------");
		System.out.println("1. User \n2. Admin \n3. Guest \n4. Exit");
		System.out.println("Who you are?, Please enter your choice->");
		System.out.println("------------------------------------------------------");
		HomepageChoiceSelection = scan.nextInt();
		if (HomepageChoiceSelection == 1) {
			UserLoginSignUp();
		}
		if (HomepageChoiceSelection == 2) {
			AdminChoice();
			AdminActions();
		}
		if (HomepageChoiceSelection == 3) {
			GuestChoice();
		}
		if (HomepageChoiceSelection == 4) {
			scan.close();
		}

	}

	public static void UserLoginSignUp() {
		System.out.println("------------------------------------------------------");
		System.out.println("1. User Registration \n2. User Login \n3. Back");
		System.out.println("Enter your choice->");
		System.out.println("------------------------------------------------------");

		UserChoiceSelection = scan.nextInt();
		if (UserChoiceSelection == 1) {
			Services service = new Services();
			service.AddUser();
			HomePage();
		}
		if (UserChoiceSelection == 2) {
			UserLogin user = new UserLogin();
			user.LoginToApplication();
			System.out.println("------------------------------------------------------");
			System.out.println("1. View Products \n2. Add to Cart \n3. LogOut");
			System.out.println("Enter your choice->");
			System.out.println("------------------------------------------------------");
			UserChoiceSelection = scan.nextInt();

			if (UserChoiceSelection == 1 || UserChoiceSelection == 2) {
				ViewProducts view = new ViewProducts();
				view.ViewAllProducts();
				System.out.println("Do you want to add products into cart? (Y/y for yes and N/n for no)");
				String response = scan.next();
				if (response.charAt(0) == 'y' || response.charAt(0) == 'Y') {
					Services.AddToCart();
					System.out.println("------------------------------------------------------");
					System.out.println("1. View Cart \n2. Purchace the item \n3. LogOut");
					System.out.println("------------------------------------------------------");
					System.out.println("Enter your choice->");
					UserChoiceSelection = scan.nextInt();
					if (UserChoiceSelection == 1) {
						Services.ViewCart();
						System.out.println("------------------------------------------------------");
						System.out.println("1. Purchace the item \n2. LogOut");
						System.out.println("------------------------------------------------------");
						System.out.println("Enter your choice->");
						UserChoiceSelection = scan.nextInt();
						if (UserChoiceSelection == 1) {
							Services.DisplayBill();
							HomePage();
						}
					} else {
						HomePage();
					}
				} else {
					System.out.println("Login Again");
					UserLoginSignUp();
				}
			} else if (UserChoiceSelection == 3) {
				HomePage();
			}
		} else if (UserChoiceSelection == 3) {
			HomePage();
		}
	}

	public static boolean AdminLoginStatus = false;

	public static void AdminChoice() {
		// boolean status=false;
		if (HomepageChoiceSelection == 2) {
			System.out.println("Admin username-> Admin");
			System.out.println("Enter admin password->");
			String password = scan.next();
			if (password.equalsIgnoreCase("admin")) {
				AdminLoginStatus = true;
			}
		}
	}

	public static void AdminActions() {
		// boolean status = AdminChoice();
		if (AdminLoginStatus == true) {
			System.out.println("------------------------------------------------------");
			System.out.println(
					"1. Add New Products \n2. Check Quantity \n3. Check Registered User \n4. Check User History \n5. Logout");
			System.out.println("------------------------------------------------------");
			System.out.println("Enter your choice->");
			AdminChoiceSelection = scan.nextInt();
			switch (AdminChoiceSelection) {

			case 1:
				System.out.println("How many products you want to add in product list->");
				int i = scan.nextInt();
				for (int j = 0; j < i; j++) {
					Services.AddProducts();
				}
				AdminActions();
				break;
			case 2:
				CheckQuantity quantity = new CheckQuantity();
				quantity.ProductQuantity();
				AdminActions();
				break;
			case 3:
				CheckUserDetails user = new CheckUserDetails();
				user.GetUserDetails();
				AdminActions();
				break;
			case 4:
				CheckUserHistory history = new CheckUserHistory();
				history.GetUserHistory();

			case 5:
				AdminLoginStatus = false;
				System.out.println("Thanks for using application");
				System.out.println("------------------------------------------------------");
				HomePage();
			}

		} else {
			System.out.println("Wrong password,Login failed");
			AdminChoice();
		}
	}

	public static void GuestChoice() {
		if (HomepageChoiceSelection == 3) {
			System.out.println("------------------------------------------------------");
			System.out.println("1. View Products \n2. Back");
			System.out.println("------------------------------------------------------");
			System.out.println("Enter your name->");
			String name = scan.next();
			System.out.println("Hi " + name + " Enter your choice->");
			GuestChoiceSelection = scan.nextInt();
			if (GuestChoiceSelection == 1) {
				ViewProducts view = new ViewProducts();
				view.ViewAllProducts();
				HomePage();
			}
			if (GuestChoiceSelection == 2)
				HomePage();
		}
	}
}