package com.bilgeadam.boost.marathon2;

import java.util.Comparator;

public class SortingName implements Comparator<Workers>{

	@Override
	public int compare(Workers o1, Workers o2) {
		return o1.getName().compareTo(o2.getName());
	}

}
