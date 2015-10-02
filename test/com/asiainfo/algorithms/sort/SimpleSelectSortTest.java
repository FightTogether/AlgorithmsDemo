package com.asiainfo.algorithms.sort;

import com.asiainfo.algorithms.utils.ArrayUtils;

public class SimpleSelectSortTest {
	public static void main(String[] args) {
		int[] nums=ArrayUtils.generateNoRepeatArray(10, 20, 5);
		ArrayUtils.printf(nums);
		SimpleSelectSort sort=new SimpleSelectSort();
		sort.sort(nums);
		ArrayUtils.printfAryAsc(nums);
		ArrayUtils.printf(nums);
	}
}
