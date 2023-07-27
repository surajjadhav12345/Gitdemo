package Letters;

public class Makin_Uppercase {
public static void main(String[] args) {
	String s1= "suraj is clever";
	String words[]= s1.split("\\s");
	String Capletter= "";
	
	for(String word:words) {
		
		String FirstLetter = word.substring(0,1);
	    String RemainingLetter = word.substring(1);
	    
	    Capletter+=FirstLetter.toUpperCase()+RemainingLetter+" ";
	}
	System.out.println(Capletter);
}
}
