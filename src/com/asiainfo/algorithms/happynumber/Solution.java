package com.asiainfo.algorithms.happynumber;

public class Solution {
	public boolean isHappy(int n) {
		do{
			n=(int) happyNum(n);
//			System.out.println(n);
		}while(n>10);
		return n==1;
	}
	public long happyNum(int n){
		int d=0;
		long ret=0;
//		System.out.print("n="+n+"====>");
		do{
			try{
				long spNum=splitNum(n, d++);
//				System.out.print(spNum+",");
				ret=ret+square(spNum,2);
			}catch(Exception e){
				if("位数不能大于实际的大小".equals(e.getMessage())){
				}else{
					throw e;
				}
				break;
			}
		}while(true);
//		System.out.println("==>"+ret);
		return ret;
	}
	public long splitNum(int n,int digit){
		long divisor=square(10,digit);
//		System.out.println("被除数"+n+"  除数"+divisor+"  digit"+digit);
		if(n<divisor)throw new IllegalArgumentException("位数不能大于实际的大小");
		return n/divisor%10;
	}
	public long square(long num,int times){
		long retNum=1;
		for(int i=0;i<times;i++){
			retNum=retNum*num;
		}
		return retNum;
	}
	public static void main(String[] args) {
		Solution solution=new Solution();
		System.out.println(solution.isHappy(7));
	}
}
