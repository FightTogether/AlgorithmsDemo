package com.asiainfo.algorithms.sort;

import com.asiainfo.algorithms.utils.ArrayUtils;

public class MainTest {
	public static void main(String[] args) {
		int[] array = ArrayUtils.generateNoRepeatArray(20, 40, 10);
		ArrayUtils.printf(array);
		BubbleSort.sort(array);
		ArrayUtils.printf(array);
	}
}
