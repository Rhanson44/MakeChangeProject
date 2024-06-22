package com.skilldistillery.makechange;

import java.util.Scanner;

public class CashRegister {

	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.print("Enter an item price: ");
		double price = scan.nextDouble();
		System.out.print("Enter amount tendered: ");
		double amount = scan.nextDouble();
		
		double change = getChange(price, amount);
		System.out.println(change);
		scan.close();
	}
	
	public static double getChange(double price, double amount) {
		double change = 0.0;
		if (price <= amount) {
			change = amount - price;
		} else {
			while(price > amount) {
			System.err.println("Invalid payment amount, please enter a valid input");
			System.out.print("Enter amount tendered: ");
			amount = scan.nextDouble();
			}
		change = amount - price;
		}
		return change;
	}
}
