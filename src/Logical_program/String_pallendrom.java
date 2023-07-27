package Logical_program;

public class String_pallendrom {
	public static void main(String[] args) {
		String s1= "Suraj";
		String rev =" " ;
		for(int i=s1.length()-1;i>=0;i--) {// lenth() used to mesure lenth of string
			rev= rev+s1.charAt(i);
		}
		System.out.println(rev);
		if(s1.equals(rev)) {
			System.out.println("it is the pallendrom");
		}
		else {
			System.out.println("It is not pallandrom");
		}

}
}
