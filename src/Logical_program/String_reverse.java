  package Logical_program;

public class String_reverse {
	public static void main(String[] args) {
		String s1= "Suraj";
		String rev =" " ;
		for(int i=s1.length()-1;i>=0;i--) {
			rev= rev+s1.charAt(i);
		}
		System.out.println(rev);
	}

}
