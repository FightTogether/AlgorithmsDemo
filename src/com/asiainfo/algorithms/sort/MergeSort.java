package com.asiainfo.algorithms.sort;

import com.asiainfo.algorithms.utils.ArrayUtils;

public class MergeSort {
	public static void sort(int[] array) {
		int[] aryA = ArrayUtils.generateNoRepeatArray(10, 50, 10);
		int[] aryB = ArrayUtils.generateNoRepeatArray(50, 80, 10);
		ArrayUtils.printf(mergeAry(aryA, aryB));
	}

	public static int[] mergeAry(int[] aryA, int[] aryB) {
		int lenA = aryA.length;
		int lenB = aryB.length;
		int[] aryC = new int[lenA + lenB];
		int i = 0, j = 0;
		for (int m = 0, n = aryC.length; m < n; m++) {
			if (j >= lenB || (i < lenA && aryA[i] <= aryB[j])) {
				aryC[m] = aryA[i];
				i++;
			} else {
				aryC[m] = aryB[j];
				j++;
			}
		}
		return aryC;
	}

	public static void merge(int[] array, int mid) {

		for (int i = 0, n = array.length; i < n; i++) {

		}
	}

	public static void main(String[] args) {
		int[] data = new int[] { 5, 3, 6, 2, 1, 9, 4, 8, 7 };
		ArrayUtils.printf(data);
		mergeSort(data);
		System.out.println("���������飺");
		ArrayUtils.printf(data);
	}

	public static void mergeSort(int[] data) {
		sort(data, 0, data.length - 1);
	}

	public static void sort(int[] data, int left, int right) {
		if (left >= right)
			return;
		// �ҳ��м�����
		int center = (left + right) / 2;
		// �����������еݹ�
		sort(data, left, center);
		// ���ұ�������еݹ�
		sort(data, center + 1, right);
		// �ϲ�
		merge(data, left, center, right);
		ArrayUtils.printf(data);
	}

	/**
	 * ������������й鲢���鲢ǰ��2�����������򣬹鲢����Ȼ����
	 * 
	 * @param data
	 *            �������
	 * @param left
	 *            ������ĵ�һ��Ԫ�ص�����
	 * @param center
	 *            ����������һ��Ԫ�ص�������center+1���������һ��Ԫ�ص�����
	 * @param right
	 *            ���������һ��Ԫ�ص�����
	 */
	public static void merge(int[] data, int left, int center, int right) {
		// ��ʱ����
		int[] tmpArr = new int[data.length];
		// �������һ��Ԫ������
		int mid = center + 1;
		// third ��¼��ʱ���������
		int third = left;
		// �����������һ��Ԫ�ص�����
		int tmp = left;
		while (left <= center && mid <= right) {
			// ������������ȡ����С�ķ�����ʱ����
			if (data[left] <= data[mid]) {
				tmpArr[third++] = data[left++];
			} else {
				tmpArr[third++] = data[mid++];
			}
		}
		// ʣ�ಿ�����η�����ʱ���飨ʵ��������whileֻ��ִ������һ����
		while (mid <= right) {
			tmpArr[third++] = data[mid++];
		}
		while (left <= center) {
			tmpArr[third++] = data[left++];
		}
		// ����ʱ�����е����ݿ�����ԭ������
		// ��ԭleft-right��Χ�����ݱ����ƻ�ԭ���飩
		while (tmp <= right) {
			data[tmp] = tmpArr[tmp++];
		}
	}

	public static void swap(int[] array, int idxA, int idxB) {
		int temp = array[idxA];
		array[idxA] = array[idxB];
		array[idxB] = temp;
	}
}
