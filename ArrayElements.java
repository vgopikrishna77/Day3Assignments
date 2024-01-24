package com.Day3assignment;
import java.util.*;
public class ArrayElements {

	public static void main(String[] args) {
		int a[]=new int[5];
		Scanner c= new Scanner(System.in);
		System.out.println("enter array elements");

		for(int i=0;i<5;i++) {
			a[i]=c.nextInt();
		}
		for(int i=0;i<5;i++) {
			System.out.println(a[i]);
			
		}
		// TODO Auto-generated method stub

	}

}
