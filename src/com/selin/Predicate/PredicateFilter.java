package com.selin.Predicate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PredicateFilter {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,6,7,8,9);
		List<Integer> collect = list.stream().filter(x -> x>5).collect(Collectors.toList());
		System.out.println(collect);
	}
}
