package com.asiainfo.algorithms.move0s;

public class Solution {
	// 往左移动数组，当当前数字是0的时候，直接挑过，继续往左移动数组，还是给最小的未填空的值继续填空
	public void moveZeroes(int[] nums) {
		/*
		 * 当有出现0的时候，就应该移动数据。 emptyIndex 则是记录了出现0之后未整理的最小的下标(未填值的)
		 */
		int emptyIndex = -1;
		for (int i = 0, n = nums.length; i < n; i++) {
			if (nums[i] == 0) {
				// 只有第一次出现0的时候，给emptyIndex赋值
				if (emptyIndex < 0) {
					emptyIndex = i;
				}
				continue;
			}
			if (emptyIndex > -1) {
				// 当出现0之后，就要开始往左移动数组
				nums[emptyIndex] = nums[i];
				nums[i] = 0;
				emptyIndex++;
			}

		}
	}

}
