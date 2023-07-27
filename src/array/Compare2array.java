package array;

import java.util.Arrays;

public class Compare2array {
	public static void main(String[] args) {
		String[] array1 = {"Suraj","Nilesh"};
	      String[] array2 = {"Suraj"};
	      String[]  array3= {" "}
	 
	   //    System.out.println("Array1 : "+Arrays.toString(array1));
	     //  System.out.println("Array2 : "+Arrays.toString(array2));
	 
	      
	        for (int i = 0; i < array1.length; i++)
	        {
	            for (int j = 0; j < array2.length; j++)
	            {
	                if(array1[i] == (array2[j]))
	                {
	                 System.out.println("Common element is : "+(array1[i]));
	                 }
	                
	            }
	        }

}
}
