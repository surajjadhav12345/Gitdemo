package Collection;

import java.util.ArrayList;


public class arraylist {
public static void main(String[] args) {
	ArrayList al= new ArrayList();
	al.add("suraj");
	al.add(100);
	al.add(null);
	al.add("ahish");
	al.add("suraj");
	System.out.println(al);
	System.out.println(al.size());
	System.out.println(al.isEmpty());
	System.out.println(al.contains(100));
	
	al.add(2, 400);
	System.out.println(al);
	System.out.println(al.get(3));
	al.remove(3);
	System.out.println(al);
}
}

