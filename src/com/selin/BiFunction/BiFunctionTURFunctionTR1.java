package com.selin.BiFunction;

import java.util.function.BiFunction;
import java.util.function.Function;


public class BiFunctionTURFunctionTR1 {
	public static void main(String[] args) {
		//2.1 BiFunction<T, U, R> + Function<T, R>
		BiFunction<Integer, Integer, Double> powDob = (x, y) -> Math.pow(x, y);
		Function<Double, String> func1 = (input) -> "X prime Y: " + String.valueOf(input);
		System.out.println(powDob.andThen(func1).apply(2, 4));
	}
}