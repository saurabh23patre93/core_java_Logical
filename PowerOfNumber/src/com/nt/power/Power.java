package com.nt.power;

public class Power {

	public static void main(String[] args) {
		int base=3,exponent=4;
		double result=1;
		
//		for(;exponent!=0;--exponent)
//			result*=base;
		result=Math.pow(base,exponent);
		
		System.out.println("Ans "+result);
	}

}
