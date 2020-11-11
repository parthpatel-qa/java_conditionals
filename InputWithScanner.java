package com.qa.community.userinput;

import java.util.Scanner;

import com.qa.community.Runner;

public class InputWithScanner {

	public static Scanner refInput;
	
	public static void start() {

		
		refInput = Runner.input;
		
		boolean flag = true;
		
		String userInput;
		int x;
		int y;
		int solution;
		String userOptions = "====================================\n"
				+ "1) Addition\n"
				+"2) Subtraction\n"
				+"3) Multiplication\n"
				+"4) Division\n";
		
		System.out.println(userOptions);
		
		while(flag) {
			
			System.out.println("Please provide either '+', '-', '*' or '/': ");
			userInput = refInput.next();
			
			
			switch ( Integer.parseInt(userInput) ) {
				case 1:
					System.out.println("You've chosen addition");
					System.out.println("Enter first integer: ");
					x = refInput.nextInt();
					System.out.println("Enter second integer: ");
					y = refInput.nextInt();
					solution = x + y;
					System.out.println("The sum is \""+ solution+"\"\n");
					break;
				case 2:
					System.out.println("You've chosen subtraction");
					System.out.println("Enter first integer: ");
					x = refInput.nextInt();
					System.out.println("Enter second integer: ");
					y = refInput.nextInt();
					solution = x - y;
					System.out.println("The solution is \""+ solution+"\"\n");
					break;
				case 3:
					System.out.println("You've chosen multiplication");
					System.out.println("Enter first integer: ");
					x = refInput.nextInt();
					System.out.println("Enter second integer: ");
					y = refInput.nextInt();
					solution = x * y;
					System.out.println("The product is \""+ solution+"\"\n");
					break;
				case 4:
					System.out.println("You've chosen division");
					System.out.println("Enter first integer: ");
					x = refInput.nextInt();
					System.out.println("Enter second integer: ");
					y = refInput.nextInt();
					solution = x / y;
					System.out.println("The answer is \""+ solution+"\"\n");
					break;
				case 5:
					System.out.println("Exit Application");
					flag = false;
					break;
					
				default:
					System.out.println("Unknown command!");
					flag = false;
			}
			System.out.println("You've entered \"" + userInput + "\"\n");
		}
		System.out.println("Ending the application");
	}

			public void add(int x, int y) {
				System.out.println(x + y);
			}
		
			public void subtrtact(int x, int y) {
				System.out.println(x - y);
			}
		
			public void multiply(int x, int y) {
				System.out.println(x * y);
			}
		
			public void divide(int x, int y) {
				System.out.println(x / y);
			}

}
