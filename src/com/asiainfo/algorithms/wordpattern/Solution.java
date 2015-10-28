package com.asiainfo.algorithms.wordpattern;


public class Solution {
	public boolean wordPattern(String pattern, String str) {
		if(str==null||"".equals(str))return false;
		if(pattern==null||"".equals(pattern))return false;
		String[] strs=str.split(" ");
		char[] patterns=pattern.toCharArray();
		if(strs.length!=patterns.length)return false;
		int letterLength=26;
		String[] match=new String[letterLength];
		for(int i=0,n=strs.length;i<n;i++){
			char c=patterns[i];
			String word=strs[i];
			String matchStr=match[c%letterLength];
			if(matchStr==null){
				match[c%letterLength]=word;
				continue;
			}else{
				if(!word.equals(matchStr)){
					return false;
				}
			}
		}
		for(int i=0;i<letterLength;i++){
			String word=match[i];
			if(word==null)continue;
			for(int j=i+1;j<letterLength;j++){
				if(word.equals(match[j]))return false;
			}
		}
		return true;
	}
}
