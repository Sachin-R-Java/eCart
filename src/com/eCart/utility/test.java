package com.eCart.utility;

import java.util.Scanner;

public class test {
	static Scanner scan = new Scanner(System.in);
	public static int HomepageChoiceSelection;
	public static int UserChoiceSelection;
	public static int AdminChoiceSelection;
	public static int GuestChoiceSelection;
	
	public static void main(String[] args) {
		
	}
	public static int HomePage() {
		System.out.println("------Welcome to Console Based eCart Application------");
		System.out.println("------------------------------------------------------");
		System.out.println("1. User \n2. Admin \n3. Guest \n4. Exit");
		System.out.println("------------------------------------------------------");
		System.out.println("Who you are?, Please enter your choice->");
		HomepageChoiceSelection = scan.nextInt();
		return HomepageChoiceSelection;
	}

}
