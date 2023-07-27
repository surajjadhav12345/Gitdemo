package Exemption_handling;

public class A {
	public static void main(String[] args) {
		try {
			System.out.println(10/0);
		}
		catch(NullPointerException g){
			System.out.println("enter the valid denometer");
			
		}finally {
			System.out.println("thanks for using ATM");
		}
	}

}
