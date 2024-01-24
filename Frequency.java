package com.Day3assignment;

import java.util.Scanner;

public class Frequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[5];
		int b[]=new int[5];
		Scanner c= new Scanner(System.in);
		System.out.println("enter array elements");
		int visited=-1;
		for(int i=0;i<5;i++) {
			a[i]=c.nextInt();
		}
		for(int i=0;i<5;i++) 
		{int d=1;
			for(int j=i+1;j<5;j++) {
			
					if(a[i]==a[j]) {
					
						d++;
						b[j]=visited;
						
					}
				}
			  if(b[i] != visited)  
	                b[i] = d;  
	        }  
			for(int i=0;i<b.length;i++) {
				if(b[i]!=visited) {
					System.out.println("   "+a[i]+" :  "+b[i]);
				}
			}
			
		}
		

	}


