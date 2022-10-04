package com.bilgeadam.boost.marathon2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class RunProgram {
	private Scanner sc;
	private static List<HourslyWorkers> hourslyList = new ArrayList<>();
	private static List<FullTimeWorkers> fulltimeList = new ArrayList<>();

	public static void main(String[] args) {
		
		FullTimeWorkers w = new FullTimeWorkers("Bake", "Cooper", 2005, 05, 01, 2012, 06, 12, 15000);
		FullTimeWorkers w1 = new FullTimeWorkers("Aimothy", "Cunningham", 2000, 10, 12, 2022, 02, 12, 5000);
		FullTimeWorkers w2 = new FullTimeWorkers("Ctella", "Benedict", 2015, 03, 29, 2018, 11, 25, 10000);
		fulltimeList.add(w);
		fulltimeList.add(w1);
		fulltimeList.add(w2);
		
		
		HourslyWorkers w3 = new HourslyWorkers("Jane","Adams", 2007,8, 25, 2001, 01, 10, 150, 160);
		HourslyWorkers w4 = new HourslyWorkers("Ali","Cemal", 2005, 07, 10, 2011, 9, 12, 50, 80);
		HourslyWorkers w5 = new HourslyWorkers("John","Daniel", 2003, 10, 10, 2020, 01, 01, 100, 10);
		hourslyList.add(w3);
		hourslyList.add(w4);
		hourslyList.add(w5);
		
		while (true) {
			System.out.println("\t\t//////////////////////////////////");
			System.out.println("\t\t////PERSONEL MANAGEMENT SYSTEM////");
			System.out.println("\t\t//////////////////////////////////");
			System.out.println("\t1)Add new employee");
			System.out.println("\t2)Looking at employee list");
			System.out.println("\t3)Looking at monthy personel's salary: ");
			System.out.println("\t4)For exit");
			System.out.println();
			System.out.print("Please write number to run your program: ");
			Scanner sc = new Scanner(System.in);
			int input = sc.nextInt();

			
			switch (input) {
			case 1:
				addEmployee();
				break;
			case 2:
				lookEmployee();
				break;
			case 3:
				lookSalary();
				break;
			case 4:
				System.out.println("Bye.....");
				System.exit(0);
				break;
			default:
				System.out.println("Something going wrong...");
				break;
			}
		}
	}
	private static void addEmployee() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Which person would you create? (Please push 1 to create hourly or push 2 to create full-time): ");
		int input = sc.nextInt();
		sc.nextLine();
		if (input==1) {
			System.out.print("Please write her/his first name: ");
			String firstName = sc.nextLine();
			System.out.print("Please write her/his last name: ");
			String lastNamename = sc.nextLine();
			System.out.print("Please write starting year (yyyy): ");
			int startingYear = sc.nextInt();
			System.out.print("Please write starting month (mm): ");
			int startingMonth = sc.nextInt();
			System.out.print("Please write starting day (dd): ");
			int startingDay = sc.nextInt();
			System.out.print("Please write finishing year (yyyy): ");
			int finishingYear = sc.nextInt();
			System.out.print("Please write finishing month (mm): ");
			int finishingMonth = sc.nextInt();
			System.out.print("Please write finishing day (dd): ");
			int finishingDay = sc.nextInt();
			System.out.print("Please write her/his hourly salary: ");
			double salary = sc.nextDouble();
			System.out.print("Please write her/his worling hours: ");
			int hours = sc.nextInt();
			hourslyList.add(new HourslyWorkers(firstName, lastNamename, startingYear, startingMonth, startingDay, finishingYear, finishingMonth, finishingDay, salary, hours));
			
		} else if (input==2){
			System.out.print("Please write her/his first name: ");
			String firstName = sc.nextLine();
			System.out.print("Please write her/his last name: ");
			String lastNamename = sc.nextLine();
			System.out.print("Please write starting year (yyyy): ");
			int startingYear = sc.nextInt();
			System.out.print("Please write starting month (mm): ");
			int startingMonth = sc.nextInt();
			System.out.print("Please write starting day (dd): ");
			int startingDay = sc.nextInt();
			System.out.print("Please write finishing year (yyyy): ");
			int finishingYear = sc.nextInt();
			System.out.print("Please write finishing month (mm): ");
			int finishingMonth = sc.nextInt();
			System.out.print("Please write finishing day (dd): ");
			int finishingDay = sc.nextInt();
			System.out.print("Please write her/his monthly salary: ");
			double salary = sc.nextDouble();
			fulltimeList.add(new FullTimeWorkers(firstName, lastNamename, startingYear, startingMonth, startingDay, finishingYear, finishingMonth, finishingDay, salary));
		} else {
			System.out.println("You should have pushed 1 or 2 to create new employee.");
		}
	}
	private static void lookSalary() {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.print("What time do you wanna see payroll? Please write date (yyyy-MM-dd): ");
			String inputDate = sc.next();
			LocalDate input = formatDate(inputDate);
			
			fulltimeList.stream().filter(d -> ChronoUnit.DAYS.between(d.starting(), input) > 0)
			.filter(d -> ChronoUnit.DAYS.between(d.finishing(), input) < 0)
			.forEach(d -> System.out.println(" " + d.getName() + " " + d.getLastname() + " : "+  d.getSalary()));
			
			hourslyList.stream().filter(d -> ChronoUnit.DAYS.between(d.starting(), input) > 0)
			.filter(d -> ChronoUnit.DAYS.between(d.finishing(), input) < 0)
			.forEach(d -> System.out.println(" " + d.getName() + " " + d.getLastname() + " : "+  d.getSalary()));
		} catch (Exception e) {
			System.out.println("There is no person in this date.");
		}
	}
	private static LocalDate formatDate(String date) {
		LocalDate d = LocalDate.parse(date, DateTimeFormatter.ISO_LOCAL_DATE);
		return d;
	}
	private static void lookEmployee() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("\t1)to sort using name \n\t2)to sort using starting date \n\t4)to sort using ID");
		int input = sc.nextInt();
		if (input == 1) {
			Collections.sort(fulltimeList, new SortingName());
			Collections.sort(hourslyList, new SortingName());
		} else if (input == 2){
			Collections.sort(fulltimeList, new SortingStartingDate());
			Collections.sort(hourslyList, new SortingStartingDate());
		}else if (input==3) {
			Collections.sort(fulltimeList, new SortingID());
			Collections.sort(hourslyList, new SortingID());
		}else {
			System.out.println("Something going wrong...");
		}
		sc.nextLine();
		for (FullTimeWorkers fullTimeWorkers : fulltimeList) {
			System.out.println(fullTimeWorkers);
		}
		for (HourslyWorkers hours : hourslyList) {
		System.out.println(hours);
	}
		
	}

}
