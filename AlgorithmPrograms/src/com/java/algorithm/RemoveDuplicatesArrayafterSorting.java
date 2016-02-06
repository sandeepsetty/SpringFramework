package com.java.algorithm;

import java.util.Scanner;

public class RemoveDuplicatesArrayafterSorting {
	 public static void main(String []args){
		   int n, temp;
		   Scanner scan = new Scanner(System.in);
		   System.out.println("Enter the no. of elements in an array");
	       n=scan.nextInt();
	       int array[] = new int[n];
	       System.out.println("Enter the numbers in the array:");
	       for(int i=0; i<n;i++){
	    	   array[i]=scan.nextInt();
	       }
	       for(int i=0; i<n;i++){
	    	   for(int j=i+1;j<n;j++){
	    		   if(array[i]>array[j]){
	    			   temp=array[i];
	    			   array[i]=array[j];
	    			   array[j]=temp;
	    		   }
	    	   }
	       }
	   
	       System.out.println("Array after descending the numbers:");
	       for(int i=0;i<n;i++){
	    	   System.out.println(array[i]);
	       }
	       
	       System.out.println("After removing duplicates from the array:");
	       int d=0;
	       array[d]=array[0];
	       for(int i=0;i<array.length;i++)
	       {
	           if (array[d]!=array[i])
	           {
	               d++;
	               array[d]=array[i];
	           }
	       }
	   for (int i=0;i<=d;i++ )
	   {
	       System.out.print(array[i]+"\t");
	   }
	   }
}
