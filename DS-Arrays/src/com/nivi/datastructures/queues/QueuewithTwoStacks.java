package com.nivi.datastructures.queues;

import java.util.Arrays;
import java.util.Stack;

public class QueuewithTwoStacks {
	
	private Stack<Integer> stack1;
	private Stack<Integer> stack2;
	
	public QueuewithTwoStacks() {
		// TODO Auto-generated constructor stub
		stack1=new Stack<Integer>();
		stack2=new Stack<Integer>();
	}
	
	public void enqueue(int item) {
		stack1.push(item);
	}
	
	public int dequeue() {
		if(isEmpty()) {
			throw new IllegalStateException();
		}
		while(!stack1.isEmpty() && stack2.isEmpty())
			stack2.push(stack1.pop());
		return stack2.pop();
	}
	
	public boolean isEmpty() {
		return stack1.isEmpty()&& stack2.isEmpty();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return stack1.toString();
	}
	
	
	
	
	
	

}
