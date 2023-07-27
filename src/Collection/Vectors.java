package Collection;

import java.util.Vector;

public class Vectors {
	public static void main(String[] args) {//ULC
		Vector v=new Vector();//Object creation
		v.add("Suraj");
		v.add(100);
		v.add("Nilesh");
		v.add("Null");
		v.add("A");
		v.add("Suraj");
		System.out.println(v);
		System.out.println(v.size());//To check the size
		System.out.println(v.capacity());//to check the capacity
		System.out.println(v.isEmpty());//to check wether ti is emplty or not
		System.out.println(v.contains(100));//false
		System.out.println(v.get(4));//it will fetch index value
		v.add(2, "Nitin");//inseration of element(right shift operation)
		System.out.println(v);
		v.remove(3);//remove the data(left shift operation)
		v.set(1,"karthik");//modify, update or replce the data
		System.out.println(v);
	}

}
