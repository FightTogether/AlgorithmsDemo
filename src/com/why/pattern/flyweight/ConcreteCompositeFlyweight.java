package com.why.pattern.flyweight;

import java.util.HashMap;
import java.util.Iterator;

public class ConcreteCompositeFlyweight implements Flyweight {
	private HashMap<Character,Flyweight> files=new HashMap<Character,Flyweight>();
	 /**
     * ����һ���µĵ�����Ԫ���󵽾ۼ���
     */
	public void add(Character state,Flyweight flyweight){
		files.put(state, flyweight);
	}
	/**
     * ����״̬��Ϊ�������뵽������
     */
	@Override
	public void operation(String state) {
		Iterator<Character> iterator=files.keySet().iterator();
		while(iterator.hasNext()){
			Character key=iterator.next();
			files.get(key).operation(state);
		}
	}

}
