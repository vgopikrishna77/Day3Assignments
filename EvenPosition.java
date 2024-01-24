package com.Day3assignment;

import java.util.Scanner;

public class EvenPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]=new int[5];
		Scanner c= new Scanner(System.in);
		System.out.println("enter array elements");
		
		for(int i=0;i<5;i++) {
			a[i]=c.nextInt();
		}
		
		
		for(int i=0;i<a.length;i++) {
			if(i%2==0) {
				System.out.println(a[i]);
				
			}}
		


	}

}
