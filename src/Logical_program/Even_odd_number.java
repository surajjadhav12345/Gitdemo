package Logical_program;

import java.util.Scanner;

public class Even_odd_number {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number");
		int num1=scan.nextInt();
		if(num1%2==0) {
			System.out.println("number is even");
		}
		else {
			System.out.println("number is odd");
		}
	}

}
