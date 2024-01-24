package com.Day3assignment;

import java.util.Scanner;

public class LargestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int max;
		int a[]=new int[5];
		Scanner c= new Scanner(System.in);
		System.out.println("enter array elements");
		
		for(int i=0;i<5;i++) {
			a[i]=c.nextInt();
		}
		max=a[0];
		
		for(int i=0;i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];
				
			}}
		System.out.println(max);

	}

}
