package com.why.algorithms.sort;



public class StraightInsertSort {
	/**
	 * ��չһ������ĳ���,��һ������ֵ����?
	 * ����ÿ������,ָ��array[i+1]=array[i];
	 * 
	 * ��һ���������һ��ֵ,����ô��?
	 * ����ԭ������ΪolaArray,����Ϊlength,�µ�ֵΪnewValue;����һ��������newArray,����Ϊlength+1,
	 * ����ԭ��������������,��ֵnewArray[length]=newValue;
	 * 
	 * 
	 * ��һ���Ѿ��ź��������,����һ����ֵ,������ֵҲ�����ź����?
	 * ������ֵΪnewValue,ԭ������oldArray,����Ϊlength,������ΪnewArray,�ȸ���ԭ�����Ԫ��,
	 * �ٰ�newValue�Ӻ���ǰ�Ƚ�,(�±�Ϊlength-1���±�Ϊ0)������������Ǹ�(array[length-1])��,��ϲ��,�������κ�����,
	 * ����������ǵĻ�,�͵ð�ֵ����,�������Ϊarray[length]=array[length-1]. Ȼ���ٵ����ڶ���,����������,������n��.
	 * ����һ��ѭ��,
	 * 		for( int i=n;i>=0;i--){
	 * 			//to do  something
	 * 			}
	 * ������תͨ��,ÿ��һ��һ������ȥ,array[i+1]=array[i], ����ס��ǰ��λ��
	 * (pos),����ȱ�ĵط�Ӧ����newValue��ʱλ��,�������ǲ������ڸ�ֵ,��ѭ��������ֵ,��Ϊ���п��ܷ����ƶ�.
	 * 
	 * 
	 */
	public int[] sort(int[] array){
		int n=array.length;
		for(int i=1;i<n;i++){//���ѭ��
			int curNum=array[i];//ȡ����ǰҪ���ڲ�ѭ�����õ�����
			int pos=i;
			for(int j=i-1;j>=0;j--){//�ڲ�ѭ��  ÿ���ѭ��һ�Σ��ڲ�ѭ���У������ĳ��Ⱦ�+1
				if(array[j]>curNum){
					array[j+1]=array[j];
					pos=j;
				}
			}
			array[pos]=curNum;
		}
		return array;
	}
}
