package com.why.algorithms.sort;


public class BubbleSort {
	public static void sort(int[] array) {
		for(int i=0,n=array.length-1;i<n;i++){
			//ÿһ��������󣬾ͻ��и�������������ȥ
			for(int j=0;j<n-i;j++){
				if(array[j]>array[j+1]){
					swap(array, j, j+1);
				}
			}
		}
	}
	public static void swap(int[] array,int idxA,int idxB){
		int temp=array[idxA];
		array[idxA]=array[idxB];
		array[idxB]=temp;
	}
}
