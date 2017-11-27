package com.why.algorithms.sort;



public class StraightInsertSort {
	/**
	 * 扩展一个数组的长度,把一个数组值后移?
	 * 遍历每个数组,指定array[i+1]=array[i];
	 * 
	 * 往一个数组插入一个值,该怎么办?
	 * 设想原来数组为olaArray,长度为length,新的值为newValue;创建一个新数组newArray,长度为length+1,
	 * 复制原先数组至新数组,赋值newArray[length]=newValue;
	 * 
	 * 
	 * 往一个已经排好序的数组,插入一个新值,而且新值也是已排好序的?
	 * 设置新值为newValue,原数组是oldArray,长度为length,新数组为newArray,先复制原数组的元素,
	 * 再把newValue从后往前比较,(下标为length-1到下标为0)如果比最后面的那个(array[length-1])大,恭喜你,不必最任何事情,
	 * 但是如果不是的话,就得把值后移,具体操作为array[length]=array[length-1]. 然后再倒数第二个,倒数第三个,倒数第n个.
	 * 假设一个循环,
	 * 		for( int i=n;i>=0;i--){
	 * 			//to do  something
	 * 			}
	 * 由特殊转通用,每个一个一个比下去,array[i+1]=array[i], 并记住当前的位置
	 * (pos),所空缺的地方应该是newValue临时位置,但是我们并不急于赋值,等循环结束后赋值,因为还有可能发生移动.
	 * 
	 * 
	 */
	public int[] sort(int[] array){
		int n=array.length;
		for(int i=1;i<n;i++){//外层循环
			int curNum=array[i];//取出当前要在内层循环放置的数字
			int pos=i;
			for(int j=i-1;j>=0;j--){//内层循环  每外层循环一次，内层循环中，遍历的长度就+1
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
