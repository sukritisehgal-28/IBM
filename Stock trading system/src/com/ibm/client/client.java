package com.ibm.client;

import java.util.Scanner;

import com.ibm.bean.Order;

public class client {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int option = 0;
		System.out.println("main menu");
		System.out.println("1.Place order");
		System.out.println("2.OrderSummery");
		System.out.println("3.Exit");
		
		System.out.println("enter your choice:1-3");
		
		option = s.nextInt();
		
		switch(option) {
		case 1:
			displayStock();
			
			   
			
		 break;
		
		case 2:
			System.out.println("enter the order number");
			
			
			
			
		
			
			
		break;
		
		case 3:
			System.out.println("exiting the appliaction");
		default:
			System.out.println("incorrect choice");
	}
		

	}

	private static void displayStock() {
		Scanner s = new Scanner(System.in);
		int selection;
		int quantity;
		String buyorsell;
		Order o = new Order();
		
		
		    System.out.println("available stocks");
			System.out.println("LNT\t1451.50");
			System.out.println("Relience\t923.90");
			System.out.println("Tata steel\t435.60");
			
			System.out.println("Enter stock name:");
			
			
			selection = s.nextInt();
			quantity = s.nextInt();
			
			buyorsell=s.next();
			
			switch(selection) {
			case 1: 
				buyorsell =s.next();
				quantity = s.nextInt();
				o.setOrderNo(selection);
				
				o.setQuantity(quantity);
				o.setAmount(14521.50);
				o.setStock("LNT");
				o.setAction(buyorsell);
				
			break;
			
			case 2:
				buyorsell = s.next();
				quantity= s.nextInt();
				o.setOrderNo(selection);
				o.setStock("relience");
				o.setAmount(939.90);
				o.setQuantity(quantity);
				o.setAction(buyorsell);
				
			case 3:
				buyorsell= s.next();
				quantity=s.nextInt();
				o.setAction(buyorsell);
				o.setAmount(435.60);
				o.setQuantity(quantity);
				o.setStock("tata stell");
				
			default:
				System.out.println("invalid option");
				
	
			}}}


