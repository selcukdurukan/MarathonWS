package com.bilgeadam.boost.marathon2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public abstract class Workers {

	private String name;
	private String lastname;
	private int startingYear;
	private int startingMonth;
	private int startingDay;
	private int finishingYear;
	private int finishingMonth;
	private int finishingDay;
	Occupation job;
	static int counter = 0;
	int a = 0;
	String b = "";

	String recordNumber() {
		if (counter == 9999) {
			counter = 0;
		}
		if (this.a > 0) {
			return b;
		}
		String number = String.format("%04d", ++counter);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy");
		this.a++;
		return this.b = starting().format(formatter) + " / " + number;
	}

	LocalDate starting() {
		LocalDate d = LocalDate.of(startingYear, startingMonth, startingDay);
		return d;
	}

	LocalDate finishing() {
		LocalDate d = LocalDate.of(finishingYear, finishingMonth, finishingDay);
		return d;
	}

	public Workers(String name, String lastname, int startingYear, int startingMonth, int startingDay,
			int finishingYear, int finishingMonth, int finishingDay, Occupation job) {
		super();
		this.name = name;
		this.lastname = lastname;
		this.startingYear = startingYear;
		this.startingMonth = startingMonth;
		this.startingDay = startingDay;
		this.finishingYear = finishingYear;
		this.finishingMonth = finishingMonth;
		this.finishingDay = finishingDay;
		this.job = job;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public int getStartingYear() {
		return startingYear;
	}

	public void setStartingYear(int startingYear) {
		this.startingYear = startingYear;
	}

	public int getStartingMonth() {
		return startingMonth;
	}

	public void setStartingMonth(int startingMonth) {
		this.startingMonth = startingMonth;
	}

	public int getStartingDay() {
		return startingDay;
	}

	public void setStartingDay(int startingDay) {
		this.startingDay = startingDay;
	}

	public int getFinishingYear() {
		return finishingYear;
	}

	public void setFinishingYear(int finishingYear) {
		this.finishingYear = finishingYear;
	}

	public int getFinishingMonth() {
		return finishingMonth;
	}

	public void setFinishingMonth(int finishingMonth) {
		this.finishingMonth = finishingMonth;
	}

	public int getFinishingDay() {
		return finishingDay;
	}

	public void setFinishingDay(int finishingDay) {
		this.finishingDay = finishingDay;
	}

	public Occupation getJob() {
		return job;
	}

	public void setJob(Occupation job) {
		this.job = job;
	}

	public static int getCounter() {
		return counter;
	}

	public static void setCounter(int counter) {
		Workers.counter = counter;
	}

	@Override
	public String toString() {
		return "Workers [name=" + name + ", lastname=" + lastname + ", startingDate=" + starting() + ", finishingDate="
				+ finishing() + ", job=" + job + ", ID=" + recordNumber() + "]";
	}

}
