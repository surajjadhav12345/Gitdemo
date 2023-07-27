package Upcasting;

public class Upcasting {
	public static void main(String[] args) {
		Father s=new Son();//s is upcasted reference vairable
		s.money();
		
		Son s1= new Son();
		s1.money();
		
		Father f =new Father();
		f.money();
		
	}

}
