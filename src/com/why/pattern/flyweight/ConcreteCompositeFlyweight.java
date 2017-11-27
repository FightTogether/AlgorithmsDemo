package com.why.pattern.flyweight;

import java.util.HashMap;
import java.util.Iterator;

public class ConcreteCompositeFlyweight implements Flyweight {
	private HashMap<Character,Flyweight> files=new HashMap<Character,Flyweight>();
	 /**
     * 增加一个新的单纯享元对象到聚集中
     */
	public void add(Character state,Flyweight flyweight){
		files.put(state, flyweight);
	}
	/**
     * 外蕴状态作为参数传入到方法中
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
