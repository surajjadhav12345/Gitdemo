package Conditional_statement;

public class Student {
    public static void main(String[] args) {
		int marks=32 ;
		
		if(marks>=65) {
			System.out.println("Pass with  distination");
		}
		else if(marks>=50) {
			System.out.println("Pass with first class");
	
		}
		else if(marks>=40) {
			System.out.println("only pass");
		}
		else {
			System.out.println("fail");
		}
	}
}
