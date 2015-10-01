package com.asiainfo.algorithms.slidingwindowmaximum;

public class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
		int[] retNums=new int[nums.length-k+1];
		if(k<1)return new int[0];
		if(nums.length<k)return new int[0];
		int end=nums.length-1;
		int retEnd=retNums.length-1;
		for(int i=0,n=(retNums.length+1)/2;i<n;i++){
			int startMax=nums[i];
			int endMax=nums[end-i];
			for(int j=0;j<k;j++){
				if(nums[j+i]>startMax){
					startMax=nums[j+i];
				}
				if(end-k!=i&&nums[end-i-j]>endMax){
					endMax=nums[end-i-j];
				}
			}
			retNums[i]=startMax;
			retNums[retEnd-i]=endMax;
		}
	        return retNums;
    }
}
