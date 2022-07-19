package com.selin.Predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateNegate {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,9);

		Predicate<Integer> filter = x-> x==9;

		List<Integer> collect = list.stream().filter(filter.negate()).collect(Collectors.toList());

		System.out.println(collect);
	}
}
