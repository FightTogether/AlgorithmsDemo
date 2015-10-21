package com.asiainfo.algorithms.sort;

import com.asiainfo.algorithms.utils.ArrayUtils;

public class MergeSort {


	public static void main(String[] args) {
		int[] data = new int[] { 5, 3, 6, 2, 1, 9, 4, 8, 7 };
		ArrayUtils.printf(data);
		System.out.println("���������飺");
		ArrayUtils.printf(data);
	}
/**
 * ������
 * @param data
 */
	public static void sort(int[] data) {
		sort(data, 0, data.length-1);
	}
	/**
	 * ���η������������������
	 */
	public static void sort(int[] data, int left, int right) {
		//�ҳ��м��
		int center=(left+right)/2;
		//��left���ڵ���rightʱ ֹͣ(�ǳ���Ҫ������ֹͣ������)
		//Ҳ���ǣ����޷������·ֵ�ʱ�򣬾�ֹͣ
		if (left >= right)return;
		//����߽�������
		sort(data, left, center);
		//���ұ߽�������
		sort(data, center+1, right);
		//�ϲ�����������������
		merge(data, left, center, right);
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
		//��ʱ���飬���ڴ洢����������
		int[] tmpAry=new int[data.length];
		//tmpIdx��ǰ��ʱ�������߱�ʶ  markIdxΪ�������Ŀ����������Ҫ����������ʱ���鸴�ƻ�ԭ����ʱ����
		int tmpIdx=left,markIdx=left;
		//�м�index ���ұ��������С�߽�
		int mid=center+1;
		//��������������һ���Ƚ���ʱ���Ϳ�����ѭ��
		while(left<=center&& mid<=right){
			if(data[left]<=data[mid]){
				tmpAry[tmpIdx++]=data[left++];
			}else{
				tmpAry[tmpIdx++]=data[mid++];

			}
		}
		//�ж�����Ƿ�û���꣬û������ֱ��ȫ����ʣ�ิ�Ƹ���ʱ����(��ʵ����ֻ����һ��)
		while(left<=center){
			tmpAry[tmpIdx++]=data[left++];
		}		
		//�ж��ұ��Ƿ�û���꣬û������ֱ��ȫ����ʣ�ิ�Ƹ���ʱ����(��ʵ����ֻ����һ��)
		while(mid<=right){
			tmpAry[tmpIdx++]=data[mid++];
		}
		//����ʱ����(�Ѿ��ź����)ȫ�����ƻ�ԭ����
		while(markIdx<=right){
			data[markIdx]=tmpAry[markIdx++];
		}
		
	}

}
