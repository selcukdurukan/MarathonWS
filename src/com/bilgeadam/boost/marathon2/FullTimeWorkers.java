package com.bilgeadam.boost.marathon2;

public class FullTimeWorkers extends Workers {

	private double salary;
	double a;
 
	public double getSalary() {
		return salary;
	}
 
	
	public double setSalary() {
		a++;
		if (a > 1) {
			return this.salary;
		}
		return this.salary = this.salary * 1.25;
	}

	public FullTimeWorkers(String name, String lastname, int startingYear, int startingMonth, int startingDay,
			int finishingYear, int finishingMonth, int finishingDay, double salary) {
		super(name, lastname, startingYear, startingMonth, startingDay, finishingYear, finishingMonth, finishingDay,
				Occupation.WORKERS);
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "FullTimeWorkers [salary=" + setSalary() + ", toString()=" + super.toString() + "]";
	}

}
