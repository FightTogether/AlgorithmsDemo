package com.why.algorithms.sort;


public class HeapSort {
	public static void sort(int[] array) {
		// 构建最大堆
		buildHeap(array);
		// 循环，每次把根节点和最后一个节点调换位置
		for (int i = array.length-1; i >= 0; i--) {
			//每次排序后都把最大值置换到最后一个位置,这就是最大堆的原因
			int tmp = array[0];
			array[0] = array[i];
			array[i] = tmp;

			// 堆的长度减少1，排除置换到最后位置的根节点
			heapify(array, 0, i);
		}
	}

	// 根据输入数组构建一个最大堆
	public static void buildHeap(int[] array) {
		//构建一个最大堆，由于叶子节点没有子节点，所以只针对能当所有父节点遍历，即可构建出来最大堆
		for (int i = array.length / 2 - 1; i >= 0; i--) {
			//由于堆调整heapify()函数会默认递归,所以最终的一定是个最大堆
			heapify(array, i, array.length);
		}
	}

	
	/**
	 * 堆调整，使其生成最大堆
	 * 		A
	 *	   / \
	 *    /   \
	 *   B-----C
	 *   
	 *   以下操作主要是对ABC这三个父子节点间的操作，即比较出来，把最大的值放到A处即可满足最大堆的性质。
	 */
	public static void heapify(int[] array, int parentNodeIndex, int heapSize) {
		int leftChildNodeIndex = parentNodeIndex * 2+1;
		// 右子节点索引
		int rightChildNodeIndex =( parentNodeIndex +1 )* 2;
		//默认最大索引为为父节点，此处赋值的目的是最终要判断最终A处的值是否改变
		int largestNodeIndex = parentNodeIndex;
	
		//默认和父节点（A）比较，然后把最大值的index赋值给largestNodeIndex
		if (leftChildNodeIndex < heapSize&& array[leftChildNodeIndex] > array[largestNodeIndex]) {
			largestNodeIndex = leftChildNodeIndex;
		}
		
		/**这边的 array[rightChildNodeIndex] > array[largestNodeIndex]  注意：是 array[largestNodeIndex]
		 * 原因是因为要和当前最大的值比较，而不是纯粹的和父节点比较(很大一部分可能这个时候父节点已经不是最大值了)
		**/
		if (rightChildNodeIndex < heapSize&& array[rightChildNodeIndex] > array[largestNodeIndex]) {
			largestNodeIndex = rightChildNodeIndex;
		}
		//如果当前A处已经不是最大index了，则把最大值放到A处
		if (largestNodeIndex != parentNodeIndex) {
			int temp = array[largestNodeIndex];
			array[largestNodeIndex] = array[parentNodeIndex];
			array[parentNodeIndex] = temp;
			//此时largestNodeIndex所对应的值已经不是最大值了，而是交换前A的值，此时要比较他和他现在的子节点间的大小关系，使用递归。
			heapify(array, largestNodeIndex, heapSize);
		}

	}
}
