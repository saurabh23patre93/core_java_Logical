package com.nt.string;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		String s;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string ");
		s=sc.nextLine();
		System.out.println("After reverse string is::");
		for(int i=s.length();i>0;--i) {
			System.out.print(s.charAt(i-1));
		}

	}

}
