package practice;

public class largestnumberarray {
	public static void main(String[] args) {
		int a[]= {34,23,43,56};
		int largest=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]>largest) {
				largest=a[i];
				
			}
		}
		System.out.println("largest number:"+largest);
	}

}
