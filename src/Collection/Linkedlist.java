package Collection;

import java.util.LinkedList;

public class Linkedlist {
public static void main(String[] args) {	
LinkedList l =new LinkedList();

l.add("prathmesh");
l.add("W10");
l.add("krishna");
l.add("W10");
l.add(null);
l.add("sunday");

System.out.println(l);
System.out.println(l.size());
System.out.println(l.isEmpty());
System.out.println(l.contains("prathmesh"));
System.out.println(l.get(4));
l.add(3, "Shubhangi");
l.remove(5);
System.out.println(l);
l.set(5, "Suraj");
System.out.println(l);


}



}
