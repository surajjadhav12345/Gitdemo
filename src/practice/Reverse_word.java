package practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Reverse_word {
public static void main(String[] args) {
	String input = " Suraj Jadhav";
	List<String> words = Arrays.asList(input.split(" "));
	Collections.reverse(words);
	String result = "";
	for(String word : words) {
	  
	   result += word;
	}
	System.out.println("given string: "+input);
	System.out.println(result);
}
}