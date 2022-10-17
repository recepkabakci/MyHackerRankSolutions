package com.recepkabakci;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindTheMedian {


	public static int findMedian(List<Integer>arr) {
		Collections.sort(arr);
		int result=(arr.get(arr.size()/2));
		return result;
	}
	

}
