package com.selin.BiFunction;

import java.util.function.BiFunction;
import java.util.function.Function;


public class BiFunctionTURFunctionTR2 {
	//2.2 BiFunction<T, U, R> + Function<T, R>
	public static void main(String[] args) {
		String rslt = powToString(
				2,3,
				(a,b) -> Math.pow(a,b),
				(r) -> "Result:" + String.valueOf(r)
		);
		System.out.println(rslt);
	}
	public static <R> R powToString(Integer a, Integer b, BiFunction<Integer, Integer,Double> biFunction1, Function<Double,R> function1){
		return biFunction1.andThen(function1).apply(a,b);
	}
}