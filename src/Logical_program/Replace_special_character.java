package Logical_program;

import java.util.Scanner;

public class Replace_special_character {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the name with special character");
		String name=scan.next();
		String actname =name.replace("@", "");//name.replaceAll("[^a-zA-Z0-9]","")
		System.out.println(actname);
	}

}
