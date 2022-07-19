package com.selin.Predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateOr {

	public static void main (String[] args){
		List<String> text = Arrays.asList("CC","H","B","BHH");
		Predicate<String> limit1 = x->  x.length() == 2;
		Predicate<String> limit2 = x-> x.startsWith("B");

		List<String> collect = text.stream().filter(limit1.or(limit2)).collect(Collectors.toList());

		System.out.println(collect);
	}
}
