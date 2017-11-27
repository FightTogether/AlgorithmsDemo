package com.why.algorithms.evaluatereversepolishnotation;

import java.util.Stack;

public class Solution {
    public int evalRPN(String[] s) {
        String operators="+-*/";
		Stack<Integer> myStack=new Stack<Integer>();
		for(int i=0,n=s.length;i<n;i++){
			if(operators.contains(s[i])){

				int a=myStack.pop();
				int b=myStack.pop();
				int res=eval(b,a,s[i].toCharArray()[0]);
				myStack.push(res);
				continue;
			}
		myStack.push( Integer.parseInt(s[i]));
		}
		if(myStack.isEmpty())return 0;
		return myStack.pop();
		
    }
    public static int eval(int a,int b,char operator){
		int result = 0;
		switch(operator){
		case '+':result=a+b;break;
		case '-':result=a-b;break;
		case '*':result=a*b;break;
		case '/':result=a/b;break;
		default:break;
		}
		return result;
	}
}