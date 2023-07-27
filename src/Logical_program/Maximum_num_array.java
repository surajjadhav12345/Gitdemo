package Logical_program;

public class Maximum_num_array {
public static void main(String[] args) {
	int arr[]= {45,35,28};
	
	System.out.println();
	int max= arr[0];
	for(int i=0;i<arr.length;i++) {
	 System.out.println(arr[i]);
		if(arr[i]>max) { 
			max= arr[i];
			
		}
	}
	System.out.println("Maximum number is: "+max);
}
}
