package com.java.algorithm;

import java.util.Scanner;

public class SortingArrayDesc {
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
    		   if(array[i]<array[j]){
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
   }
}
