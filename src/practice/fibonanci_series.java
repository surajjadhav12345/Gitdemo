package practice;

import java.util.Scanner;

public class fibonanci_series {
public static void main(String[] args) {
	int n1=0;
	int n2=1;
	Scanner scan = new Scanner(System.in);
	System.out.print("Enter the number which you want fibonaccies: ");
	int num = scan.nextInt();
	int sum=0;
	for(int i=1;i<=num;i++) {
		sum= n1+n2;
		System.out.print(" "+sum);
		n1=n2;
		n2=sum;
	}
}
}
