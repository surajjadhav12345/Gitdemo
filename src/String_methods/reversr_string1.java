package String_methods;

public class reversr_string1 {
	public static void main(String[] args) {
		String s1 = "Mahesh";
		String rev = " ";
		
		for(int i=s1.length()-1;i>=0;i--) {
			rev= rev+s1.charAt(i);
		}
		
		System.out.println(rev);
		
	}

}
