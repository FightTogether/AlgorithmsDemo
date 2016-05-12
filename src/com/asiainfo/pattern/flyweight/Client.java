package com.asiainfo.pattern.flyweight;

public class Client {
	public static void main(String[] args) {
		  Flyweight fly = FlyweightFactory.factory(new Character('a'));
	        fly.operation("First Call");
	        
	        fly = FlyweightFactory.factory(new Character('b'));
	        fly.operation("Second Call");
	        
	        fly = FlyweightFactory.factory(new Character('a'));
	        fly.operation("Third Call");;
	}
}
