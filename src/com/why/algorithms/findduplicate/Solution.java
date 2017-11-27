package com.why.algorithms.findduplicate;

public class Solution {
	 public int findDuplicate(int[] nums) {
		 for(int i=0, n=nums.length;i<n;i++){
			 int num=nums[i];
			 for(int j=i+1;j<n;j++){
				 if(num==nums[j]){
					 return num;
				 }
			 }
		 }
		 throw new RuntimeException("not find the duplicate number");
	    }
	 public static void main(String[] args) {
		 Solution solution=new Solution();
		 int[] nums=new int[]{1,2,3,4,5,5,6,7};
		 int duplicate=solution.findDuplicate(nums);
		 System.out.println(duplicate);
	}
}
