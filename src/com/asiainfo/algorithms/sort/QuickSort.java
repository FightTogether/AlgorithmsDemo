package com.asiainfo.algorithms.sort;


public class QuickSort {
	public static void sort(int[] array) {
		quicksort(array, 0, array.length-1);
	}

	public static void quicksort(int[] array, int l, int r) {
		if(l>r)return;
		int i=l,j=r,x=array[l];//x中存的就是基准数 
		while(i!=j){
			//顺序很重要，要先从右边开始找 
			while(i<j&&array[j]>=x)j--;
			 //再找右边的 
			while(i<j&&array[i]<=x)i++;
			 //交换两个数在数组中的位置 
			 if(i<j)swap(array, i, j);
		}
	    //最终将基准数归位 
		 swap(array, l, i);
		//继续处理左边的，这里是一个递归的过程 
		 quicksort(array, l, i-1);
		//继续处理右边的 ，这里是一个递归的过程 
		 quicksort(array, i+1, r);
	}
	public static void swap(int[] array,int idxA,int idxB){
		int temp=array[idxA];
		array[idxA]=array[idxB];
		array[idxB]=temp;
	}
}
