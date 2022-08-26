package com.bilgeadam.boost.marathon1;

/**
 * @author selcukurukan
 * @version 1.0
 * @email selcukdurukan@outlook.com.tr
 * This program has been created by selcukdurukan at 26.08.2022
 */

import java.util.Scanner;

public class ShapeTest {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		ShapeTest shapeTest = new ShapeTest();
		shapeTest.readInput();
		System.out.println("Bye...");
		sc.close();

	}

	private void readInput() {

		boolean x = true;
		while (x) {
			System.out.println(
					"Lutfen hesaplamak istediginiz seklin (en fazla 4) kenar uzunluklarini giriniz (-1 ile cikis).");

			System.out.print("Lutfen 1. kenar uzunlugunu giriniz (O ile sonlandir):");
			double fSide = sc.nextDouble();

			if (fSide == -1) {
				return;
			}
			if (fSide == 0) {
				System.out.println("Kenarsiz hesaplama olmaz.");
				return;
			}
			if (fSide < 0) {
				x = true;
				System.out.println("Pozitif bir sayi giriniz.");
				System.out.println();
				continue;
			}

			System.out.print("Lutfen 2. kenar uzunlugunu giriniz (O ile sonlandir):");
			double sSide = sc.nextDouble();

			if (sSide == -1) {
				return;
			}
			if (sSide == 0) {
				System.out.println("Tek kenarli hesaplama olmaz.");
				return;
			}
			if (sSide < 0) {
				x = true;
				System.out.println("Pozitif bir sayi giriniz.");
				System.out.println();
				continue;
			}

			System.out.print("Lutfen 3. kenar uzunlugunu giriniz (O ile sonlandir):");
			double tSide = sc.nextDouble();

			if (tSide == -1) {
				return;
			}
			if (tSide == 0) {
				System.out.println("iki kenarli sekil olmaz.");
				return;
			}
			if (tSide < 0) {
				x = true;
				System.out.println("Pozitif bir sayi giriniz.");
				System.out.println();
				continue;
			}

			System.out.print("Lutfen 4. kenar uzunlugunu giriniz (O ile sonlandir):");
			double foSide = sc.nextDouble();

			if (foSide == -1) {
				return;
			}
			if (foSide < 0) {
				x = true;
				System.out.println("Pozitif bir sayi giriniz.");
				System.out.println();
				continue;
			}
			if (foSide == 0) {
				System.out.println("Bu bir ucgendir.");
				double v = (fSide + sSide + tSide) / 2;
				double value1 = Math.sqrt(v);
				double value2 = Math.sqrt((v - fSide));
				double value3 = Math.sqrt((v - sSide));
				double value4 = Math.sqrt((v - tSide));
				double circum = fSide + sSide + tSide;
				double area = value1 * value2 * value3 * value4;
				System.out.println("Ucgenin cevresi: " + circum);
				System.out.println("Ucgenin alani: " + area);
				return;
			}

			if (fSide > 0 && sSide > 0 && tSide > 0 && foSide > 0) {
				System.out.println("Bu bir dortgen");
				double circum = fSide + sSide + tSide + foSide;
				double area = (fSide * sSide * tSide) / foSide;

				System.out.println("1. Seklin cevresi: " + circum);
				System.out.println("1. Seklin alani: " + area);
			}

		}

	}

}
