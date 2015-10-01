package com.asiainfo.algorithms.utils;

import java.util.Random;

public class Generate {
	private int min=0;
	private int max=0;
	private Random random;
	public Generate(){
		this.min=Integer.MIN_VALUE;
		this.max=Integer.MAX_VALUE;
		this.random=new Random();
	}
	public Generate(int min,int max){
		this.min=min;
		this.max=max;
		this.random=new Random();
	}
	public Generate(int min,int max,Random random){
		this.min=min;
		this.max=max;
		this.random=random;
	}
	public int getRandomNums(){
		return getRandomNums(min, max, random);
	}
	private int getRandomNums(int min,int max,Random random){
		return min+random.nextInt(max-min);
	}
	public int[] generateRandomNums(int min,int max,int length,boolean reperat){
		if(max<min)throw new IllegalArgumentException("��Сֵ���ܴ������ֵ");
		if(!reperat&&(max-min)<length)throw new IllegalArgumentException("���鳤�Ȳ��ܴ������ֵ����Сֵ֮��");
		if(length==0)throw new IllegalArgumentException("���鳤�Ȳ���Ϊ0");
		int[] nums=new int[length];
		for(int i=0;i<length;i++){
			int currentNum=getRandomNums(min,max,random);
			//����������ظ�
			if(!reperat){
				//ֻ�е����ظ�ʱ��ѭ���Ž���
				while(true){
					if(!isReperat(nums,currentNum,i+1))break;
					currentNum=getRandomNums(min,max,random);
				}
			}
			nums[i]=currentNum;
		}
		return nums;
	}
	public int getRandomNums(int min, int max) {
		return getRandomNums(min, max, random);
		}
	public boolean isReperat(int[] array,int num,int currentLength){
		for(int i=0;i<currentLength;i++){
			if(array[i]==num)return true;
		}
		return false;
	}
	public int[] generateRandomNoRepeatNums(int min,int max,int length){
		return generateRandomNums(min, max, length, false);
	}
	public int[] generateRandomInts(int maxNum,int length){
		if(length==0)throw new IllegalArgumentException("���鳤�Ȳ���Ϊ0");
		int[] nums=new int[length];
		for(int i=0;i<length;i++){
			nums[i]=random.nextInt(maxNum);
		}
		return nums;
	}
	public static void printf(int[] nums){
		System.out.println(transArray2String(nums));
	}
	public static String transArray2String(int[] nums){
		StringBuffer stringBuffer=new StringBuffer();
		for(int i=0,n=nums.length;i<n;i++){
			if(i!=0){
				stringBuffer.append(",");
			}
			stringBuffer.append(nums[i]);
		}
		return stringBuffer.toString();
	}
	
	public static void main(String[] args) {
		int[] nums=new Generate().generateRandomInts(10,10);
		printf(nums);
		System.exit(0);
	}
}
