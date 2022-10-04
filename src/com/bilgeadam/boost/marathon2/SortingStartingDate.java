package com.bilgeadam.boost.marathon2;

import java.util.Comparator;

public class SortingStartingDate implements Comparator<Workers>{

	@Override
	public int compare(Workers o1, Workers o2) {
		return o1.starting().compareTo(o2.starting());
	}
	

}
