package Logical_program;

public class Armstorm_number {
	public static void main(String[] args) {
		int num = 153;
		int count=0;
		int temp = num;
		
		int sum=0;
		
		for (int i = num ; i>0 ;i=i/10) {
			if(i>0) {
				count++;
			}
		}
		System.out.println(count);
		while (temp>0) {
			int multi =1;	
		int rem = temp%10;
		for (int i=1 ; i<=count ; i++) {
			multi = multi * rem;
			
		}
		sum= sum + multi;
		
		temp = temp/10;
	}
		System.out.println(sum);
	}
}

