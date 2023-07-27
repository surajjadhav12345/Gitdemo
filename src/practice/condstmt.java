package practice;

import java.util.Scanner;

public class condstmt {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.print("Enter Suraj age: ");
	int age = scan.nextInt();
	if(age>18) {
		System.out.println("Suraj is ready for driving liasense");
	}
	else {
		System.out.println("Suraj is not able for driving liasene");
	}
}
}
