package com.nt.test;

import java.util.Scanner;

public class FindPrimeNumber {
	public static void main(String[] args) {
		int i=2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number:");
		int num=sc.nextInt();
		boolean flag=false;
		while (i<=num/2) {
			if (num%i==0) {
				flag=true;
				break;
			}
		++i;
		}
		if (!flag) {
			System.out.println("Number is prime");
		} else {
			System.out.println("Number is not prime");
		}
	}
}
