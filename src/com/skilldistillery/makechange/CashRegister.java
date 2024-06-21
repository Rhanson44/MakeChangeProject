package com.skilldistillery.makechange;

import java.util.Scanner;

public class CashRegister {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter an item price: ");
		double price = scan.nextDouble();
		System.out.print("Enter amount tendered: ");
		double amount = scan.nextDouble();
		scan.close();
	}
	
	public static double getChange(double price, double amount) {
		double change = 0.0;
		return 0.0;
	}

}
