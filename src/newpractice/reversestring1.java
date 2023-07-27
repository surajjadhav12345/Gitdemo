package newpractice;

import java.util.ArrayList;

public class reversestring1 {
public static void main(String[] args) {
	String s= "Suraj";
	String rev= " ";
	StringBuilder sb = new StringBuilder();
	sb.append(s);
	sb= sb.reverse();
	rev= sb.toString();
	ArrayList<String> ab= new ArrayList<String>();
	ab.add(s);
	ab.add(rev);
	System.out.println(ab);
	System.out.println(ab.toString());
}
}
