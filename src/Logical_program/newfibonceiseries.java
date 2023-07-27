package Logical_program;

import java.util.Scanner;

public class newfibonceiseries {
	 public static void main(String[] args) {
	        int n, a = 0, b = 1, c;
	        Scanner input = new Scanner(System.in);
	        System.out.print("Enter the number of terms: ");
	        n = input.nextInt();
	        input.close();

	        if (n <= 0) {
	            System.out.println("Invalid input. Please enter a positive integer.");
	        } else if (n == 1) {
	            System.out.println("Fibonacci sequence up to " + n + ":");
	            System.out.println(a);
	        } else {
	            System.out.println("Fibonacci sequence up to " + n + ":");
	            for (int i = 0; i < n; i++) {
	                System.out.print(a + " ");
	                c = a + b;
	                a = b;
	                b = c;
	            }
	        }
	    }

	
	
}
