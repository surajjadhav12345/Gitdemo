package Logical_program;

public class Fibonacci_series {
	public static void main(String[] args) {
		int n1=0;
		int n2=1;
		int sum=0;
		System.out.print(n1+" ");//
		System.out.print(n2);
		for(int i=2;i<=10;i++) {
			sum=n1+n2;
			System.out.print(" "+sum);
			n1=n2;//1
			n2=sum;//1
			
		}
	}

}


