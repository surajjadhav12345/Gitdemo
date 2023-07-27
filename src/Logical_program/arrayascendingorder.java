package Logical_program;

import java.util.Arrays;

public class arrayascendingorder {
	public static void main(String[] args) {
		int [] arr= new int[]{4,67,45,34,56,4,3,6};
		for(int i=0;i<arr.length;i++) {
			for(int j= i+1;j<arr.length;j++) {
				int temp=0;
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
							
				}
			}
			System.out.println(arr[i]);
			
		}
		
		System.out.println("second largest number:"+arr[1]);
	}

}
