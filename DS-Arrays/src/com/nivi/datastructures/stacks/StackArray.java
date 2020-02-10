package com.nivi.datastructures.stacks;

import java.util.Arrays;

public class StackArray {
	
	private int[] array;
	private int count=0;
	
	
	public StackArray() {
		// TODO Auto-generated constructor stub
		array = new int[10];
	}
	
	public void push(int item) {
		if(array.length==count)
			throw new StackOverflowError();
		array[count++]=item;
		
	}
	
	public int pop() {
		if(count==0)
			throw new IllegalArgumentException();
		return array[--count];
	}
	
	public int peek() {
		if(count==0) {
			throw new IllegalStateException();
		}
		return array[count-1];
	}
	
	public boolean isEmpty() {
		if(count==0)
			return true;
		return false;
	}
	
	public int min() {
		int min=array[0];
		for(int i:Arrays.copyOf(array, count)) {
			if(i<min)
				min=i;
		}
		return min;
	}
	
	public void print() {
		int[] content= Arrays.copyOfRange(array, 0, count);
		System.out.println("Stack is "+Arrays.toString(content));
	}

}
