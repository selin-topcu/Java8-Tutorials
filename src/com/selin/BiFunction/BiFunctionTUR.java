package com.selin.BiFunction;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;


public class BiFunctionTUR {
	public static void main(String[] args) {
		//1. BiFunction<T, U, R>
		BiFunction<Integer, Integer, Integer> sumInt = (x1, x2) -> x1 + x2;
		System.out.println(sumInt.apply(5, 6));

		BiFunction<Integer, Integer, Double> powDob = (x, y) -> Math.pow(x, y);
		System.out.println(powDob.apply(2, 4));

		BiFunction<Integer, Integer, List<Integer>> sumList = (x, y) -> Arrays.asList(x + y);
		System.out.println(sumList.apply(5, 5));

	}
}