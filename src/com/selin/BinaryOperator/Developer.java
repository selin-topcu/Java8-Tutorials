package com.selin.BinaryOperator;

import java.math.BigDecimal;

public class Developer {
	String name;
	BigDecimal salary;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getSalary() {
		return salary;
	}

	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}

	public Developer(String name, BigDecimal salary) {
		this.name = name;
		this.salary = salary;
	}
}
