package com.selin.BinaryOperator;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class BinaryOperator2 {

	public static void main (String[] args){

		Integer [] numbers ={1,2,3,4,5,6};

		System.out.println(math(Arrays.asList(numbers),0,(a, b)-> a+b));
		System.out.println(math(Arrays.asList(numbers),0,Integer::sum));

	}

	public static <T> T math(List<T> list, T init, BinaryOperator<T> accumulator){
		T result= init;

		for(T t: list){
			result=accumulator.apply(result,t);
		}

		return result;
	}
}
