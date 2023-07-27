package practice;

public class Array {
	public static void main(String[] args) {
		int a[]= {23,54,45,34,22};
		int even=0;
		int odd=0;
		for(int i= 0;i<a.length;i++) {
			if(a[i]%2==0) {
				even++;
			}
			else {
				odd++;
			}
		}
        System.out.println("even numbers are:"+even);
	}

}
