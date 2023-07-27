package practice;

import java.util.Scanner;

import Inheritance.a;

public class Count_occurence {
public static void main(String[] args) {
	 int n[]= {45,45,56,56,56};
	 int x=45;
	 int count=0;
     
     for(int i = 0; i < n.length; i++)
     {
         if(n[i] == x)
         {
             count++;
         }
     }
     System.out.println("Number of Occurrence of the Element:"+count);
 } 
	
}

