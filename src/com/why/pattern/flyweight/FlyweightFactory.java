package com.why.pattern.flyweight;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {
    private static Map<Character,Flyweight> files = new HashMap<Character,Flyweight>();
    
    public static Flyweight factory(Character state){
    	if (!files.containsValue(state)) {
    		files.put(state, new ConcreteFlyweight(state));
		}
    	return files.get(state);
    }
}
