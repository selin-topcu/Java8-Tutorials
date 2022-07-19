package com.selin.Predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateAnd {
	public static void main(String[] args) {
		List<Integer> list= Arrays.asList(1,2,4,65,2,35,23,3);
		Predicate<Integer> limit1 = x-> x>5;
		Predicate<Integer> limit2 = x-> x<40;

		List<Integer> collect = list.stream().filter(limit1.and(limit2)).collect(Collectors.toList());
		System.out.println(collect);

	}
}
