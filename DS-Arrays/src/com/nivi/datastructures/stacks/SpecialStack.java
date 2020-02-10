package com.nivi.datastructures.stacks;

import java.util.Stack;

public class SpecialStack {
	
	private Stack< Integer> stack = new Stack<Integer>();
	private int minEle;
	
	public void push(int x) {
		if(stack.isEmpty()) {
			stack.push(x);
			minEle=x;
		}
		else if(x>=minEle) {
			stack.push(x);
		}
		else {
			stack.push(2*x-minEle);
			minEle=x;
		}
			
	}
	
	public void pop() {
		if(stack.isEmpty())
			throw new IllegalStateException();
		int y=stack.pop();
		if(y<minEle) {
			minEle=2*minEle-y;
		}
	}
	
	public int minimum() {
		if(stack.isEmpty())
			throw new IllegalStateException();
		return minEle;
	}

	@Override
	public String toString() {
		return "SpecialStack [stack=" + stack + ", minEle=" + minEle + "]";
	}
	
	

}
