package com.selin.Predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateTest {
	public static void main(String[] args) {
		System.out.println(StringProcess.filter(Arrays.asList("a","bb","cc"),x-> x=="a"));
	}

}

class StringProcess{
	static List<String> filter(List<String> list, Predicate<String> predicate){
		return list.stream().filter(predicate::test).collect(Collectors.toList());

	}
}
