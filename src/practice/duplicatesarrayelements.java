package practice;

public class duplicatesarrayelements {
	public static void main(String[] args) {
		int a[]= {45,34,45,23,23,45};
		System.out.println("duplicates number are:");
		
		for(int i=0;i<a.length;i++) {
			for (int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
				  System.out.println(a[j]);
				}
			}	
		
		}
	}

}
