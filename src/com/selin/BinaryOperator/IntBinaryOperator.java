package com.selin.BinaryOperator;

import java.util.function.IntBinaryOperator;

class IntBinaryOperator1 {
	public static void main (String[] args){
		int[] numbers ={3,4,2,4,5};
		System.out.println(sum(numbers,0,(a,b)-> a+b));
		System.out.println(sum(numbers,0,Integer::sum));
	}

	public static int sum (int[] num, int x, IntBinaryOperator accumulator){
		int result = x;
		for(int t : num){
			result=accumulator.applyAsInt(result,t);
		}
		return result;
	}
}
