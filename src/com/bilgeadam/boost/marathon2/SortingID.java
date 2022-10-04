package com.bilgeadam.boost.marathon2;

import java.util.Comparator;

public class SortingID implements Comparator<Workers> {

	@Override
	public int compare(Workers o1, Workers o2) {
		return o1.recordNumber().compareTo(o2.recordNumber());
	}

}
