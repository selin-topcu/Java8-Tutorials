package com.selin.Streams.StreamsFilter;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Collect {
	public static void main(String[] args) {
		List<String> arr = Arrays.asList("one","two","three","selin");

		List<String> result= arr.stream().filter(x-> !"selin".equals(x)).collect(Collectors.toList());

		result.forEach(System.out::println);
	}
}
