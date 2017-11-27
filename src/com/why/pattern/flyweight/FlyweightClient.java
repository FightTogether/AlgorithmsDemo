package com.why.pattern.flyweight;

import java.util.ArrayList;
import java.util.List;

public class FlyweightClient {
	public static void main(String[] args) {
		  Flyweight fly = FlyweightFactory.factory(new Character('a'));
	        fly.operation("First Call");
	        
	        fly = FlyweightFactory.factory(new Character('b'));
	        fly.operation("Second Call");
	        
	        fly = FlyweightFactory.factory(new Character('a'));
	        fly.operation("Third Call");
	        System.out.println("---------------------------------------------------");
	        List<Character> compositeState = new ArrayList<Character>();
	        compositeState.add('a');
	        compositeState.add('b');
	        compositeState.add('c');
	        compositeState.add('a');
	        compositeState.add('b');
	        Flyweight  fly2=CompositeFlyweightFactory.factory(compositeState);
	        Flyweight  fly3=CompositeFlyweightFactory.factory(compositeState);
	        fly.operation("Composite Call");
	        System.out.println("---------------------------------");        
	        System.out.println("复合享元模式是否可以共享对象：" + (fly2 == fly3));
	        
	        Character state = 'a';
	        Flyweight fly4 = CompositeFlyweightFactory.factory(state);
	        Flyweight fly5 = CompositeFlyweightFactory.factory(state);
	        System.out.println("单纯享元模式是否可以共享对象：" + (fly4 == fly5));
	}
}
