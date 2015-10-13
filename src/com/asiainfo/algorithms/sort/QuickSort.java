package com.asiainfo.algorithms.sort;


public class QuickSort {
	public static void sort(int[] array) {
		quicksort(array, 0, array.length-1);
	}

	public static void quicksort(int[] array, int l, int r) {
		if(l>r)return;
		int i=l,j=r,x=array[l];//x�д�ľ��ǻ�׼�� 
		while(i!=j){
			//˳�����Ҫ��Ҫ�ȴ��ұ߿�ʼ�� 
			while(i<j&&array[j]>=x)j--;
			 //�����ұߵ� 
			while(i<j&&array[i]<=x)i++;
			 //�����������������е�λ�� 
			 if(i<j)swap(array, i, j);
		}
	    //���ս���׼����λ 
		 swap(array, l, i);
		//����������ߵģ�������һ���ݹ�Ĺ��� 
		 quicksort(array, l, i-1);
		//���������ұߵ� ��������һ���ݹ�Ĺ��� 
		 quicksort(array, i+1, r);
	}
	public static void swap(int[] array,int idxA,int idxB){
		int temp=array[idxA];
		array[idxA]=array[idxB];
		array[idxB]=temp;
	}
}
