package com.why.algorithms.sort;


public class HeapSort {
	public static void sort(int[] array) {
		// ��������
		buildHeap(array);
		// ѭ����ÿ�ΰѸ��ڵ�����һ���ڵ����λ��
		for (int i = array.length-1; i >= 0; i--) {
			//ÿ������󶼰����ֵ�û������һ��λ��,��������ѵ�ԭ��
			int tmp = array[0];
			array[0] = array[i];
			array[i] = tmp;

			// �ѵĳ��ȼ���1���ų��û������λ�õĸ��ڵ�
			heapify(array, 0, i);
		}
	}

	// �����������鹹��һ������
	public static void buildHeap(int[] array) {
		//����һ�����ѣ�����Ҷ�ӽڵ�û���ӽڵ㣬����ֻ����ܵ����и��ڵ���������ɹ�����������
		for (int i = array.length / 2 - 1; i >= 0; i--) {
			//���ڶѵ���heapify()������Ĭ�ϵݹ�,�������յ�һ���Ǹ�����
			heapify(array, i, array.length);
		}
	}

	
	/**
	 * �ѵ�����ʹ����������
	 * 		A
	 *	   / \
	 *    /   \
	 *   B-----C
	 *   
	 *   ���²�����Ҫ�Ƕ�ABC���������ӽڵ��Ĳ��������Ƚϳ�����������ֵ�ŵ�A�������������ѵ����ʡ�
	 */
	public static void heapify(int[] array, int parentNodeIndex, int heapSize) {
		int leftChildNodeIndex = parentNodeIndex * 2+1;
		// ���ӽڵ�����
		int rightChildNodeIndex =( parentNodeIndex +1 )* 2;
		//Ĭ���������ΪΪ���ڵ㣬�˴���ֵ��Ŀ��������Ҫ�ж�����A����ֵ�Ƿ�ı�
		int largestNodeIndex = parentNodeIndex;
	
		//Ĭ�Ϻ͸��ڵ㣨A���Ƚϣ�Ȼ������ֵ��index��ֵ��largestNodeIndex
		if (leftChildNodeIndex < heapSize&& array[leftChildNodeIndex] > array[largestNodeIndex]) {
			largestNodeIndex = leftChildNodeIndex;
		}
		
		/**��ߵ� array[rightChildNodeIndex] > array[largestNodeIndex]  ע�⣺�� array[largestNodeIndex]
		 * ԭ������ΪҪ�͵�ǰ����ֵ�Ƚϣ������Ǵ���ĺ͸��ڵ�Ƚ�(�ܴ�һ���ֿ������ʱ�򸸽ڵ��Ѿ��������ֵ��)
		**/
		if (rightChildNodeIndex < heapSize&& array[rightChildNodeIndex] > array[largestNodeIndex]) {
			largestNodeIndex = rightChildNodeIndex;
		}
		//�����ǰA���Ѿ��������index�ˣ�������ֵ�ŵ�A��
		if (largestNodeIndex != parentNodeIndex) {
			int temp = array[largestNodeIndex];
			array[largestNodeIndex] = array[parentNodeIndex];
			array[parentNodeIndex] = temp;
			//��ʱlargestNodeIndex����Ӧ��ֵ�Ѿ��������ֵ�ˣ����ǽ���ǰA��ֵ����ʱҪ�Ƚ����������ڵ��ӽڵ��Ĵ�С��ϵ��ʹ�õݹ顣
			heapify(array, largestNodeIndex, heapSize);
		}

	}
}
