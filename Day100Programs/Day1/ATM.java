package com.java.day111023;
import java.util.Scanner;

public class ATM {
	
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int choice = 0, wamt,damt;
			System.out.println("Account Holder Name: ");
			String name = sc.next();
			System.out.println("AccountType: ");
			String acc = sc.next();
			System.out.println("Pin: ");
			int pin = sc.nextInt();
			int balance = 150;

			if (pin == 3694) {
				System.out.println("Enter your choice: ");
				System.out.println("1 for Withdraw");
				System.out.println("2 for Deposit");
	            System.out.println("------------------");
	            choice = sc.nextInt();

				if (choice == 1) {
					System.out.println("Enter withdraw amount : ");
					wamt = sc.nextInt();
					System.out.println("\n");
					if (balance >= wamt) {
					    
					     System.out.println("------------------");
						System.out.println("Previous Balance : " + balance);
						balance = balance - wamt;
						System.out.println("Account Holder Name : " + name);
						System.out.println("Account Type: " + acc);
						 System.out.println("------------------");
						System.out.println("Available Balance : " + balance);
						 System.out.println("------------------");
						 
					} else {
					     System.out.println("------------------");
						System.out.println("Do not have sufficient balance");
						 System.out.println("------------------");
						 	System.out.println("Available Balance : " + balance);
						 	System.out.println("------------------");
					}
				}else if(choice == 2) {
					System.out.println("Enter deposit amount : ");
					damt = sc.nextInt();
					 System.out.println("\n");
					 System.out.println("------------------");
					System.out.println("Previous Balance : " + balance);
					balance = balance + damt;
					System.out.println("Account Holder Name : " + name);
					System.out.println("Account Type: " + acc);
					 System.out.println("------------------");
					System.out.println("Available Balance : " + balance);
					 System.out.println("------------------");
					
				}else {
				     System.out.println("------------------");
					System.out.println("Enter valid choice ...");
					 System.out.println("------------------");
				}

			}else {
			     System.out.println("------------------");
				 System.out.println("Invaid pin ...");
				 System.out.println("------------------");
			}

		}
	}



