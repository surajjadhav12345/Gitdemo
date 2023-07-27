package Logical_program;

import java.util.Scanner;

public class Accept_input_from_user {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);// It will recieve input from user through console
		System.out.println("enter the first value");
        int num1 = scan.nextInt();// It will take actual integer data from user through console
		// Take 2nd number
		System.out.println("Enter the second number");
		int num2 = scan.nextInt();//nsm in scanner class
		// add two number
		System.out.println("addition: " +(num1+num2));
	}

}
