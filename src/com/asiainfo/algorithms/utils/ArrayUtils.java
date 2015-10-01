package com.asiainfo.algorithms.utils;


public class ArrayUtils {
	private ArrayUtils(){
		
	}
	public static int[] generateRandomArray(int maxNum,int length){
		return new Generate().generateRandomInts(maxNum, length);
	}
	public static int[] generateNoRepeatArray(int min,int max,int length){
		return new Generate().generateRandomNoRepeatNums(min, max, length);
	}
	public static void printf(int[] nums){
		Generate.printf(nums);
	}
}
