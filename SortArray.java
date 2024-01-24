package com.Day3assignment;

import java.util.Scanner;

public class SortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[5];
		int b[]=new int[5];
		Scanner c= new Scanner(System.in);
		System.out.println("enter array elements");
		
		for(int i=0;i<5;i++) {
			a[i]=c.nextInt();
		}
		for(int i=0;i<5;i++) 
		{
			for(int j=i+1;j<5;j++) {
				if(a[i]>a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			}
			for(int i=0;i<5;i++) {
				System.out.print(a[i]);
			}

	}

}
