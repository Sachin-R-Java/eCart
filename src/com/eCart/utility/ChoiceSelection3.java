package com.eCart.utility;

import java.util.Scanner;

import com.eCart.userfunctions.UserLogin;
import com.eCart.userfunctions.ViewProducts;

public class ChoiceSelection3 {
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
		System.out.println("------------------------------------------------------");
		System.out.println("Who you are?, Please enter your choice->");
		HomepageChoiceSelection = scan.nextInt();
		if(HomepageChoiceSelection==1) {
			UserLoginSignUp();
		}
		if (HomepageChoiceSelection == 4)
			scan.close();
	}
	public static void UserLoginSignUp() {
		
		//if (HomepageChoiceSelection == 1) {
			System.out.println("------------------------------------------------------");
			System.out.println("1. User Registration \n2. User Login \n3. Back");
			System.out.println("------------------------------------------------------");
			System.out.println("Enter your choice->");
			UserChoiceSelection = scan.nextInt();
			if(UserChoiceSelection==1) {
				Services service = new Services();
				service.AddUser();
				HomePage();
			}
			if(UserChoiceSelection==2) {
				UserLogin user = new UserLogin();
				user.LoginToApplication();
				System.out.println("------------------------------------------------------");
				System.out.println("1. View Products \n2. Add to Cart \n3. View Cart \n4. Purchace the item \n5. LogOut");
				System.out.println("------------------------------------------------------");
				System.out.println("Enter your choice->");
				UserChoiceSelection = scan.nextInt();
			
				if(UserChoiceSelection==1 || UserChoiceSelection==2) {
					ViewProducts view = new ViewProducts();
					view.ViewAllProducts();
					System.out.println("Do you want to add products into cart? (Y/y for yes and N/n for no)");
					String response = scan.next();
					if(response.charAt(0)== 'y' || response.charAt(0)=='Y') {
						Services.AddToCart();
						System.out.println("------------------------------------------------------");
						System.out.println("1. View Cart \n2. Purchace the item \n3. LogOut");
						System.out.println("------------------------------------------------------");
						System.out.println("Enter your choice->");
						UserChoiceSelection = scan.nextInt();
						if(UserChoiceSelection==1) {
							Services.ViewCart();
							System.out.println("------------------------------------------------------");
							System.out.println("1. Purchace the item \n2. LogOut");
							System.out.println("------------------------------------------------------");
							System.out.println("Enter your choice->");
							UserChoiceSelection = scan.nextInt();
							if(UserChoiceSelection==1) {
								Services.DisplayBill();
							}
						}
						
					}else {
					
						
					}
				}
			}
			if(UserChoiceSelection==3)
				HomePage();
	//	}
	}
	public static int UserChoice() {
		//if (HomepageChoiceSelection == 1) {
			System.out.println("------------------------------------------------------");
			System.out.println(
					"1. View Products \n2. Add to Cart \n3. View Cart \n4. Purchace the item \n5. LogOut");
			System.out.println("------------------------------------------------------");
			System.out.println("Enter your choice->");
			UserChoiceSelection = scan.nextInt();
			return UserChoiceSelection;
		//}
	}

	public static void AdminChoice() {
		if (HomepageChoiceSelection == 2) {
			System.out.println("------------------------------------------------------");
			System.out.println(
					"1. Add New Products \n2. Check Quantity \n3. Check Registered User \n4. Check User History \n5. Back");
			System.out.println("------------------------------------------------------");
			System.out.println("Enter your choice->");
			AdminChoiceSelection = scan.nextInt();
		}
	}

	public static void GuestChoice() {
		if (HomepageChoiceSelection == 3) {
			System.out.println("------------------------------------------------------");
			System.out.println("1. View Products \n2. Back");
			System.out.println("------------------------------------------------------");
			System.out.println("Enter your choice->");
			GuestChoiceSelection = scan.nextInt();
		}
	}
}