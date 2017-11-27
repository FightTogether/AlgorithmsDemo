package com.why.algorithms.medianfiinder;

import com.why.algorithms.utils.ArrayUtils;

class MedianFinder {
	int[] colection=null;
	int length=0;
    // Adds a number into the data structure.
    public void addNum(int num) {
    	if(length==0){
    		colection=new int[1];
    		colection[0]=num;
    		length=1;
    		return ;
    	}
    	
    	int[] temp=new int[length+1];
    	int index=0;
    	for(int i=0;i<length;i++){
    		if(index==i&&colection[i]>num){
    			temp[index++]=num;
    		}
    		temp[index++]=colection[i];
    	}
    	if(index==length){
    		temp[index]=num;
    	}
    	colection=temp;
    	length=temp.length;
    }

    // Returns the median of current data stream
    public double findMedian() {
    	if(length==0){
    		throw new RuntimeException("长度不能为空");
    	}
    	if(length%2==1){
    		return colection[length/2];
    	}else{
    		return (colection[length/2-1]+colection[length/2])/2.00;
    	}
    }
    public void printf() {
    	ArrayUtils.printf(colection);
	}
};

// Your MedianFinder object will be instantiated and called as such:
// MedianFinder mf = new MedianFinder();
// mf.addNum(1);
// mf.findMedian();