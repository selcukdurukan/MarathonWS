package com.bilgeadam.boost.marathon2;

public class HourslyWorkers extends Workers {

	public HourslyWorkers(String name, String lastname, int startingYear, int startingMonth, int startingDay,
			int finishingYear, int finishingMonth, int finishingDay, double salary, int workingHours) {
		super(name, lastname, startingYear, startingMonth, startingDay, finishingYear, finishingMonth, finishingDay,
				Occupation.WORKERS);
		this.salary = salary;
		this.workingHours = workingHours;
	}

	private double salary;
	private int workingHours;
	double a;

	public double getSalary() {
		return this.salary;
	}

	public double setSalary() {
		a++;
		if (a > 1) {
			return this.salary;
		}
		return this.salary = this.salary * 1.08 * this.workingHours;
	}

	public int getWorkingHours() {
		return workingHours;
	}

	public void setWorkingHours(int workingHours) {
		this.workingHours = workingHours;
	}

	@Override
	public String toString() {
		return "HourslyWorkers [salary=" + setSalary() + ", workingHours=" + workingHours + ", toString()="
				+ super.toString() + "]";
	}

}
