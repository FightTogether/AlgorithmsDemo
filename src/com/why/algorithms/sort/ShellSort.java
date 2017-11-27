package com.why.algorithms.sort;


public class ShellSort {
	public int[] sort(int[] array) {
		int n = array.length;
		for (int gap = n; gap > 0; gap = gap / 2) {
			for(int m=0;m<gap;m++){
				for(int i=m+gap;i<n;i+=gap){
					int curNum=array[i];
					int pos=i;
					for(int j=i-gap;j>=0;j-=gap){
						if(array[j]>curNum){
							array[j+gap]=array[j];
							pos=j;
						}
					}
					array[pos]=curNum;
				}
			}

		}
		return array;
	}
}
