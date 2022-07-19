package com.selin.Predicate.PredicateObject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PersonRepository {
	public static List<Person> filterPerson(List<Person> list, Predicate<Person> perdicate){
		return list.stream().filter(perdicate).collect(Collectors.toList());
	}

}
