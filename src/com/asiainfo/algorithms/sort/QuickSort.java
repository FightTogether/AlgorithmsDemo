package com.asiainfo.algorithms.sort;

import com.asiainfo.algorithms.utils.ArrayUtils;

public class QuickSort {
	public static void sort(int[] array) {
		quicksort(array, 1, array.length-1);
	}

	public static void quicksort(int[] array, int l, int r) {
		if(l>r)return;
		int i = l, j = r;
		int x = array[l];//x�д�ľ��ǻ�׼��
		while (i != j) {
			//˳�����Ҫ��Ҫ�ȴ��ұ߿�ʼ�� 
			while (i < j && array[j] >= x)j--;
			//�����ұߵ� 
			while (i < j && array[i] <= x)i++;
			// �����������������е�λ��
			if (i < j) {
				int temp = array[i];
				array[i] = array[j];
				array[j] = temp;
			}
		}
		//���ս���׼����λ 
		array[l] = array[i];
		array[i]=x;
		
		quicksort(array,0,i-1);//����������ߵģ�������һ���ݹ�Ĺ���     
		quicksort(array,i+1,r);//���������ұߵ� ��������һ���ݹ�Ĺ��� 
	}
	public static void main(String[] args) {
		int[] array=ArrayUtils.generateNoRepeatArray(20, 40, 10);
		ArrayUtils.printf(array);
		sort(array);
		ArrayUtils.printf(array);
		
	}
}
