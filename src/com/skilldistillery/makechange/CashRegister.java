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
		
		makeDenomination(price, amount);
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
	
	public static void makeDenomination(double price, double amount) {
		double change = amount - price;
		
		int bills = (int) (change);
		double coins = change - bills;
		int cents = (int) Math.round((coins * 100));
		
		int quarters = cents / 25;
		cents %= 25;
		System.out.println(quarters + " quarters");
		int dimes = cents / 10;
		cents %= 10;
		System.out.println(dimes + " dimes");
		int nickles = cents / 5;
		cents %= 5;
		System.out.println(nickles + " nickles");
		int pennies = cents;
		System.out.println(pennies + " pennies");
		
		
		int hundreds = (bills / 100);
		bills %= 100;
		System.out.println(hundreds + " hundreds");
		int fifties = (bills / 50); 
		bills %= 50;
		System.out.println(fifties + " fifties");
		int twenties = (bills / 20); 
		bills %= 20;
		System.out.println(twenties + " twenties");
		int tens = (bills / 10); 
		bills %= 10;
		System.out.println(tens + " tens");
		int fives = (bills / 5);
		bills %= 5;
		System.out.println(fives + " fives");
		int ones = bills;
		System.out.println(ones + " ones");
	}
}
