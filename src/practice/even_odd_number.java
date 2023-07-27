package practice;

import java.util.Scanner;

public class even_odd_number {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number");
		int num = scan.nextInt();
		if(num%2==0) {
			System.out.println("given number is even");
		}
		else {
			System.out.println("given number is odd");
		}
	}

}
