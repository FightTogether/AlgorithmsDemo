package com.asiainfo.algorithms.sort;

import com.asiainfo.algorithms.utils.ArrayUtils;

public class QuickSort {
	public static void sort(int[] array) {
		quicksort(array, 1, array.length-1);
	}

	public static void quicksort(int[] array, int l, int r) {
		if(l>r)return;
		int i = l, j = r;
		int x = array[l];//x中存的就是基准数
		while (i != j) {
			//顺序很重要，要先从右边开始找 
			while (i < j && array[j] >= x)j--;
			//再找右边的 
			while (i < j && array[i] <= x)i++;
			// 交换两个数在数组中的位置
			if (i < j) {
				int temp = array[i];
				array[i] = array[j];
				array[j] = temp;
			}
		}
		//最终将基准数归位 
		array[l] = array[i];
		array[i]=x;
		
		quicksort(array,0,i-1);//继续处理左边的，这里是一个递归的过程     
		quicksort(array,i+1,r);//继续处理右边的 ，这里是一个递归的过程 
	}
	public static void main(String[] args) {
		int[] array=ArrayUtils.generateNoRepeatArray(20, 40, 10);
		ArrayUtils.printf(array);
		sort(array);
		ArrayUtils.printf(array);
		
	}
}
