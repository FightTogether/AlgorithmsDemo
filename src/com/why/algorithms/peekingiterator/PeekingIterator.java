package com.why.algorithms.peekingiterator;

import java.util.ArrayList;
import java.util.Iterator;

// Java Iterator interface reference:
// https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html
class PeekingIterator implements Iterator<Integer> {
	public ArrayList<Integer> collection=new ArrayList<Integer>();
	int index=0;
	public PeekingIterator(Iterator<Integer> iterator) {
	    // initialize any member here.
		while(iterator.hasNext()){
			collection.add(iterator.next());
		}
	}

    // Returns the next element in the iteration without advancing the iterator.
	public Integer peek() {
		return collection.get(index);
	}

	// hasNext() and next() should behave the same as in the Iterator interface.
	// Override them if needed.
	@Override
	public Integer next() {
		if(hasNext())
			return collection.get(index++);
		return null;
	}

	@Override
	public boolean hasNext() {
		return index<collection.size();
	}

	@Override
	public void remove() {
		collection.remove(index);
	}
}