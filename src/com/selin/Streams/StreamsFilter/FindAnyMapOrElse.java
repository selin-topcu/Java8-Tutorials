package com.selin.Streams.StreamsFilter;

import com.selin.Predicate.PredicateObject.Person;

import java.util.Arrays;
import java.util.List;

public class FindAnyMapOrElse {
	public static void main(String[] args){
		List<Person> person = Arrays.asList(
				new Person(1,"Jack","Harry"),
				new Person(1,"Rose","Seven"),
				new Person(1,"Adam","Eric")
		);

		String result1 = person.stream()
				.filter(x->"Jack".equals(x.getName()))  // jack == ?
				.map(Person::getName)                   // if return name
				.findAny()                              // find return
				.orElse(null);                    // else null

		String result2 = person.stream()
				.filter(x->"Selin".equals(x.getName()))
				.map(Person::getName)
				.findAny()
				.orElse(null);

		System.out.println(result1);
		System.out.println(result2);
	}
}
