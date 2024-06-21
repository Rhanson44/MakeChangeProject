package com.skilldistillery.makechange;

import java.util.Scanner;

public class CashRegister {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter an item  price: ");
		double price = scan.nextDouble();
		System.out.print("Enter amount tendered: ");
		double amount = scan.nextDouble();
	}

}
