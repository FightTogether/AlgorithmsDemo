package com.why.algorithms.sortcolors;

import com.why.algorithms.utils.ArrayUtils;

public class Soluction {
	public static void sortColors(int[] nums){
		//Ͱ     ��3��Ͱ
		int[] colorCounts=new int[3];
		for(int i=0,n=nums.length;i<n;i++){
			//�ڶ�Ӧ��Ͱ��������ǣ�+1
			colorCounts[nums[i]]++;
		}
		int m=0;
		//���ֵ��ԭ���飬����ԭ����
		for(int i=0;i<3;i++){
			for(int j=colorCounts[i];j>0;j--){
				nums[m]=i;
				m++;
			}
		}
	}
	public static void main(String[] args) {
		int[] nums=new int[]{1,2,0,2,1,2,0,1,1,2,0,0,2};
		ArrayUtils.printf(nums);
		sortColors(nums);
		ArrayUtils.printf(nums);
	}
}
