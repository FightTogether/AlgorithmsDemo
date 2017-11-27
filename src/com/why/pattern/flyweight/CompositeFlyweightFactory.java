package com.why.pattern.flyweight;

import java.util.HashMap;
import java.util.List;

public class CompositeFlyweightFactory {
	private static HashMap<Character,Flyweight> files=new HashMap<Character,Flyweight>();
	public static Flyweight factory(Character state){
		if(!files.containsKey(state)){
			files.put(state, new ConcreteFlyweight(state));
		}
		return files.get(state);
	}
	public static Flyweight factory(List<Character> states){
		ConcreteCompositeFlyweight flyweight=new ConcreteCompositeFlyweight();
		for(Character state:states){
			flyweight.add(state, factory(state));
		}
		return flyweight;
	}
}
