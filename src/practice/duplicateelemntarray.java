package practice;

public class duplicateelemntarray {
	public static void main(String[] args) {
		int a[]= {45,65,65,45};
		for(int i= 0;i<a.length;i++) {
			for(int j= i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					System.out.println("duplicate elemne:"+a[i]);
				}
			}
		}
	}

}
