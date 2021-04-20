package com.nt.test;

import java.util.Scanner;

public class FibonacciSeriesTest {
	public static void main(String[] args) {
		int a=0,b=1,c,n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the limit ");
		n=sc.nextInt();
		System.out.println();
		for(int i=1;i<=n;i++) {
			System.out.print(a+",");
			c=a+b;
			a=b;
			b=c;
			
		}
	}
}
