package practice;

public class arrayascendingorder {
public static void main(String[] args) {
	int a[]={4,34,6,12};
	System.out.println("descending order:");
	for(int i=0;i<a.length;i++) {
		for(int j=i+1;j<a.length;j++) {
			int temp=0;
			if(a[i]>a[j]) {
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
			
			
		}System.out.println(a[i]);
	}
	System.out.println("manimum number:"+a[0]);
	
}
}
