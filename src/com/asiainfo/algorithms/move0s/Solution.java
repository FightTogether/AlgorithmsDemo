package com.asiainfo.algorithms.move0s;

public class Solution {
	// �����ƶ����飬����ǰ������0��ʱ��ֱ�����������������ƶ����飬���Ǹ���С��δ��յ�ֵ�������
	public void moveZeroes(int[] nums) {
		/*
		 * ���г���0��ʱ�򣬾�Ӧ���ƶ����ݡ� emptyIndex ���Ǽ�¼�˳���0֮��δ�������С���±�(δ��ֵ��)
		 */
		int emptyIndex = -1;
		for (int i = 0, n = nums.length; i < n; i++) {
			if (nums[i] == 0) {
				// ֻ�е�һ�γ���0��ʱ�򣬸�emptyIndex��ֵ
				if (emptyIndex < 0) {
					emptyIndex = i;
				}
				continue;
			}
			if (emptyIndex > -1) {
				// ������0֮�󣬾�Ҫ��ʼ�����ƶ�����
				nums[emptyIndex] = nums[i];
				nums[i] = 0;
				emptyIndex++;
			}

		}
	}

}
