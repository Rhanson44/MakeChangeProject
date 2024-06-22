package com.skilldistillery.makechange;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CashRegister {

	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("#.00");
		
		System.out.print("Enter an item price: ");
		double price = scan.nextDouble();
		System.out.print("Enter amount tendered: ");
		double amount = scan.nextDouble();
		
		double change = getChange(price, amount);
		System.out.println("Your change is: " + df.format(change));
		
		makeDenomination(change);
		
		System.out.println("Thanks! Have a great day!");
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
	
	public static void makeDenomination(double change) {
		
		int bills = (int) (change);
		double coins = change - bills;
		int cents = (int) Math.round((coins * 100));
		
		int hundreds = (bills / 100);
		bills %= 100;
		if (hundreds > 0) {
			System.out.println(hundreds + " hundred dollar bill(s)");
		}
		int fifties = (bills / 50); 
		bills %= 50;
		if (fifties > 0) {
			System.out.println(fifties + " fifty dollar bill(s)");
		}
		int twenties = (bills / 20); 
		bills %= 20;
		if (twenties > 0) {
			System.out.println(twenties + " twenty dollar bill(s)");
		}
		int tens = (bills / 10); 
		bills %= 10;
		if (tens > 0) {
			System.out.println(tens + " ten dollar bill(s)");
		}
		int fives = (bills / 5);
		bills %= 5;
		if (fives > 0) {
			System.out.println(fives + " five dollar bill(s)");
		}
		int ones = bills;
		if (ones > 0) {
			System.out.println(ones + " one dollar bill(s)");
		}
		
		int quarters = cents / 25;
		cents %= 25;
		if (quarters > 0) {
			System.out.println(quarters + " quarter(s)");
		}
		int dimes = cents / 10;
		cents %= 10;
		if (dimes > 0) {
			System.out.println(dimes + " dime(s)");
		}
		int nickles = cents / 5;
		cents %= 5;
		if (nickles > 0) {
			System.out.println(nickles + " nickle(s)");
		}
		int pennies = cents;
		if (pennies > 0) {
			System.out.println(pennies + " pennies");
		}
	}
}
