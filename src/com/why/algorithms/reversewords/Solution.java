package com.why.algorithms.reversewords;

public class Solution {
    public String reverseWords(String s) {
    	  s=s.trim();
		  String[] arr=s.split(" ");
		  StringBuffer ret=new StringBuffer();
		  for(int i=arr.length-1;i>=0;i--){
			  if(arr[i].equals(""))continue;
			  ret.append(arr[i]);
			  if(i!=0)ret.append(" ");
		  }
		return ret.toString();
  }
}
