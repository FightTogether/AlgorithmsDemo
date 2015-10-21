package com.asiainfo.algorithms.sort;

import com.asiainfo.algorithms.utils.ArrayUtils;

public class MergeSort {


	public static void main(String[] args) {
		int[] data = new int[] { 5, 3, 6, 2, 1, 9, 4, 8, 7 };
		ArrayUtils.printf(data);
		System.out.println("排序后的数组：");
		ArrayUtils.printf(data);
	}
/**
 * 排序函数
 * @param data
 */
	public static void sort(int[] data) {
		sort(data, 0, data.length-1);
	}
	/**
	 * 分治法，对子数组进行排序
	 */
	public static void sort(int[] data, int left, int right) {
		//找出中间点
		int center=(left+right)/2;
		//当left大于等于right时 停止(非常重要，程序停止的条件)
		//也就是，当无法再往下分的时候，就停止
		if (left >= right)return;
		//对左边进行排序
		sort(data, left, center);
		//对右边进行排序
		sort(data, center+1, right);
		//合并排序后的左右子数组
		merge(data, left, center, right);
	}

	/**
	 * 将两个数组进行归并，归并前面2个数组已有序，归并后依然有序
	 * 
	 * @param data
	 *            数组对象
	 * @param left
	 *            左数组的第一个元素的索引
	 * @param center
	 *            左数组的最后一个元素的索引，center+1是右数组第一个元素的索引
	 * @param right
	 *            右数组最后一个元素的索引
	 */
	public static void merge(int[] data, int left, int center, int right) {
		//临时数组，用于存储排序后的数据
		int[] tmpAry=new int[data.length];
		//tmpIdx当前临时数组的左边标识  markIdx为左边坐标的拷贝，在最后要把排序后的临时数组复制回原数组时有用
		int tmpIdx=left,markIdx=left;
		//中间index 做右边子数组的小边界
		int mid=center+1;
		//但两个子数组有一个比较完时，就可跳出循环
		while(left<=center&& mid<=right){
			if(data[left]<=data[mid]){
				tmpAry[tmpIdx++]=data[left++];
			}else{
				tmpAry[tmpIdx++]=data[mid++];

			}
		}
		//判断左边是否没走完，没走完则直接全部把剩余复制给临时数组(其实两个只能走一个)
		while(left<=center){
			tmpAry[tmpIdx++]=data[left++];
		}		
		//判断右边是否没走完，没走完则直接全部把剩余复制给临时数组(其实两个只能走一个)
		while(mid<=right){
			tmpAry[tmpIdx++]=data[mid++];
		}
		//把临时数组(已经排好序的)全部复制回原数组
		while(markIdx<=right){
			data[markIdx]=tmpAry[markIdx++];
		}
		
	}

}
