package com.nivi.datastructures.queues;

import java.util.Arrays;

public class CircularQueue {
	
	private int rear;
	private int front;
	private int  count;
	private int items[];
	
	public CircularQueue(int size) {
		// TODO Auto-generated constructor stub
		count=0;
		items=new int[size];
	}
	
	public void enqueue(int item) {
		
		  if(count==items.length) throw new IllegalStateException("Queue is full");
		 
		items[rear]=item;
		rear=(rear+1)%items.length;
		count++;
	}
	
	public int dequeue() {
		
		  if(front==-1) throw new IllegalStateException("Queue is empty");
		 
		int popped= items[front];
		items[front]=0;
		front=(front+1)%items.length;
		count--;
		return popped;
	}
	

	@Override
	public String toString() {
		return "CircularQueue [toString()=" + Arrays.toString(items) + "]";
	}
	
	
	

}
