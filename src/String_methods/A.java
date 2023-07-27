package String_methods;

public class A {
	public static void main(String[] args) {
		String s1="Velocity";
		String s2="VELOCITY";
		String s3= "city";
		
		System.out.println(s2.length());
		
		System.out.println(s1.toUpperCase());
		
		System.out.println(s2.toLowerCase());
		
		System.out.println(s1.equals(s2));
		
		System.out.println(s2.equalsIgnoreCase(s1));
		
		System.out.println(s1.contains(s3));
		
		System.out.println(s1.charAt(7));
		
		System.out.println(s2.indexOf("t"));// giving -1 index
		
		System.out.println(s1.lastIndexOf("t"));
		
		System.out.println(s1.startsWith("vy"));
		
		System.out.println(s2.endsWith("TY"));
		
		System.out.println(s2.substring(5));
		
		System.out.println(s2.concat(s3));
		
		System.out.println(s2.replace("CITY", "RURAL"));
	}

}
