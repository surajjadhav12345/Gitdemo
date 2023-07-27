package Logical_program;

public class Number_palindrome {
	public static void main(String[] args) {
	int num=1234;
	int revNum=0;
	
	for(int i=num;i>0;i=i/10) {
		int rem=i%10;
		revNum=revNum*10+rem;
	}
	System.out.println(revNum);
	if(num==revNum) {
		System.out.println("it is palindrome");
	}
	else {
		System.out.println("Number is not palindrome");
		
	}
	
}

}
