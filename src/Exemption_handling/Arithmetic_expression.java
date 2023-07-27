package Exemption_handling;

public class Arithmetic_expression {
public static void main(String[] args) {
	int a =1;
	int b=0;
	
	try {
		int c=a/b;
	}
	
	catch(RuntimeException ref){
	System.out.println("pl enter valid input");
	}    
	
  finally{
  System.out.println("Thanks for using system");
}
	}

}

		
	
	

