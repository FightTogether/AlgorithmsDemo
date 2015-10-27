package com.asiainfo.algorithms.search;

import com.asiainfo.algorithms.sort.MergeSort;
import com.asiainfo.algorithms.utils.ArrayUtils;

public class BinarySearch {
	public static int search(int[] ary,int number){
		int left=0;
		int right=ary.length;
		int mid=(left+right)/2;
		while(true){
			if(right-left==1)return left;
			if(ary[mid]>number){
				right=mid;
			}else if(ary[mid]<number){
				left=mid;
			}else{
				break;
			}
			System.out.println(left+"  "+right);
			mid=(left+right)/2;
		}
		return mid;
	}
	public static void main(String[] args) {
		int[] ary=ArrayUtils.generateNoRepeatArray(10, 50, 10);
		int number=ary[5];
		System.out.println("要找的数为:=====>"+number);
		ArrayUtils.printf(ary);
		MergeSort.sort(ary);
		ArrayUtils.printf(ary);
		int index=search(ary, number);
		System.out.println(index+"====>"+ary[index]);
	}
}
