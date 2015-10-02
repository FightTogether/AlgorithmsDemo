package com.asiainfo.algorithms.sort;


public class SimpleSelectSort {
	public int[] sort(int[] array) {
		for(int i=0,n=array.length;i<n;i++){
			int pos=i,min=array[i];//最小值的位置和数值
			for(int j=i+1;j<n;j++){
				if(min>array[j]){
					min=array[j];
					pos=j;
				}
			}
			int temp=array[i];
			array[i]=min;
			array[pos]=temp;
		}
		return array;
	}
}
