package Logical_program;

public class Prime_no {
	public static void main(String[] args) {
		int num=5;
		int count=0;
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				count++;
			}
		}
		if(count==2) {
			System.out.println("Given number is prime number");
		}
		
		else{
			System.out.println("given number is not prime number");
	}
		
	  
	}
}
