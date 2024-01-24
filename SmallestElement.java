package com.Day3assignment;

import java.util.Scanner;

public class SmallestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int min;
		int a[]=new int[5];
		Scanner c= new Scanner(System.in);
		System.out.println("enter array elements");
		
		for(int i=0;i<5;i++) {
			a[i]=c.nextInt();
		}
		min=a[0];
		
		for(int i=0;i<a.length;i++) {
			if(a[i]<min) {
				min=a[i];
				
			}}
		System.out.println(min);

	}

}
