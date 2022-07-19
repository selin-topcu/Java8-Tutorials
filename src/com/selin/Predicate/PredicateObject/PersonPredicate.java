package com.selin.Predicate.PredicateObject;

import java.util.Arrays;
import java.util.List;

public class PersonPredicate {
	public static void main (String[] args){
		Person p1 = new Person(1,"Enola","Holmes");
		Person p2 = new Person(2,"Jack","Sparrow");
		Person p3 = new Person(3,"Hypatia","Philosopher");

		List<Person> person = Arrays.asList(new Person[]{p1,p2,p3});

		List<Person> result = PersonRepository.filterPerson(person, x->x.getName().startsWith("J"));
		System.out.println(result.get(0).getName());
	}

}
