package com.why.algorithms.utils;


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
	public static void printfAryAsc(int[] ary){
		Generate.printf(isAryAsc(ary));
	}
	public static boolean isAryAsc(int[] array){
		for(int i=1,n=array.length;i<n;i++){
			if(array[i-1]>array[i])return false;
		}
		return true;
	}
}
