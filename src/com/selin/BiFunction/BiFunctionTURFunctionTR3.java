package com.selin.BiFunction;

import java.util.function.BiFunction;
import java.util.function.Function;


public class BiFunctionTURFunctionTR3 {
	//2.3 BiFunction<T, U, R> + Function<T, R>
	public static void main(String[] args) {
		String pow = convertMethod(
				2, 4,
				(a,b) -> Math.pow(a,b),
				(r) ->"a^b: " + String.valueOf(r)
		);
		System.out.println(pow);

		String multiply = convertMethod(
				2,4,
				(a,b) -> a*b,
				(r) -> "a*b: "+ r
		);
		System.out.println(multiply);

		String sumString = convertMethod(
			"a","b",
				(a,b) -> a+b,
				(r) ->  r+"cde"
		);
		System.out.println(sumString);

		String sumString2 = convertMethod(
				"100","200",
				(a,b) -> a+b,
				(r) ->  r
		);
		System.out.println(sumString2);
	}

	public static <A, B, R1, R2> R2 convertMethod(A a, B b, BiFunction<A, B, R1> function1, Function<R1, R2> function2){
		return function1.andThen(function2).apply(a, b);
	}
}