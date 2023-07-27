package practice;

import java.util.Scanner;

public class Reverse_number {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num= scan.nextInt();
		int revnum=0;
		for(int i=num;i>0;i=i/10) {
			int rem=i%10;
			revnum = revnum*10+rem;
		}
		System.out.println("Reverse number is: "+revnum);
		if(num==revnum) {
			System.out.println("Number is pylendrone");
		}
		else {
			System.out.println("Number is not pylendrone");
		}
	}

}
