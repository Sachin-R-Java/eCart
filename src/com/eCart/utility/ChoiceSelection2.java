package com.eCart.utility;

import java.util.Scanner;

public class ChoiceSelection2 {
	//original
	//static Scanner scan = new Scanner(System.in);
	public static int HomepageChoiceSelection;
	public static int UserLoginSignUpSelection;
	public static int UserChoiceSelection;
	public static int AdminChoiceSelection;
	public static int GuestChoiceSelection;

	public static void HomePage() {
		Scanner scan = new Scanner(System.in);
		// System.out.println("------Welcome to Console Based eCart Application------");
		System.out.println("------------------------------------------------------");
		System.out.println("1. User \n2. Admin \n3. Guest \n4. Exit");
		System.out.println("------------------------------------------------------");
		System.out.println("Who you are?, Please enter your choice->");
		HomepageChoiceSelection = scan.nextInt();
		if (HomepageChoiceSelection == 4)
			scan.close();
	}
	public static void UserLoginSignUp() {
		if (HomepageChoiceSelection == 1) {
			Scanner scan = new Scanner(System.in);
			System.out.println("------------------------------------------------------");
			System.out.println(
					"1. User Registration \n2. User Login \n3. Back");
			System.out.println("------------------------------------------------------");
			System.out.println("Enter your choice->");
			UserLoginSignUpSelection = scan.nextInt();
			if(UserLoginSignUpSelection==3)
				HomePage();		
		}
	}

	public static void UserChoice() {
		if (UserLoginSignUpSelection == 2) {
			Scanner scan = new Scanner(System.in);
			System.out.println("------------------------------------------------------");
			System.out.println(
					"1. User Registration \n2. User Login \n3. View Products \n4. Add to Cart \n5. View Cart \n6. Purchace the item \n7. Back");
			System.out.println("------------------------------------------------------");
			System.out.println("Enter your choice->");
			UserChoiceSelection = scan.nextInt();
		}
	}

	public static void AdminChoice() {
		if (HomepageChoiceSelection == 2) {
			Scanner scan = new Scanner(System.in);
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
			Scanner scan = new Scanner(System.in);
			System.out.println("------------------------------------------------------");
			System.out.println("1. View Products \n2. Back");
			System.out.println("------------------------------------------------------");
			System.out.println("Enter your choice->");
			GuestChoiceSelection = scan.nextInt();
		}
	}
}