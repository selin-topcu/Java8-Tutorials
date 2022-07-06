package com.selin.BinaryOperator;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class BinaryOperator1 {

	public static void main (String[] args){
		BiFunction<Integer, Integer, Integer> sumBiFunc= (a,b) -> a+b;
		System.out.println(sumBiFunc.apply(5,6));

		BinaryOperator<Integer> sumBinaryOpFunc= (a, b) -> a+b;
		System.out.println(sumBinaryOpFunc.apply(5,6));

	}

}
