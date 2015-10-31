package com.asiainfo.algorithms.bullsandcows;

public class Solution {
	final String  bullUnit="A",cowUnit="B";
	public String getHint(String secret, String guess) {
		int bulls=0,cows=0,all=0;
		int buketNum=10;
		int ascII0=48;
		if(isBlank(secret)||isBlank(guess)){
			return getBullsAndCows(bulls, cows);
		}
		int length=secret.length();
		if(length!=guess.length())return null;
		int[] secBukets=new int[buketNum];
		int[] gueBukets=new int[buketNum];
		for(int i=0,n=length;i<n;i++){
			char secC=secret.charAt(i);
			char gueC=guess.charAt(i);
			secBukets[secC-ascII0]++;
			gueBukets[gueC-ascII0]++;
			if(secC==gueC){
				bulls++;
			}
		}
		for(int i=0;i<buketNum;i++){
			if(secBukets[i]==0)continue;
			all+=secBukets[i]<=gueBukets[i]?secBukets[i]:gueBukets[i];
		}
		cows=all-bulls;
		return getBullsAndCows(bulls, cows);
	}
	public String getBullsAndCows(int bulls,int cows){
		return new StringBuffer().append(bulls).append(bullUnit).append(cows).append(cowUnit).toString();
	}
	private boolean isBlank(String s){
		if(s==null||s.isEmpty())return true;
		return false;
	}
}
