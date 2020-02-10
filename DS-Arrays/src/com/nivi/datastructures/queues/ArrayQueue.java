package com.nivi.datastructures.queues;

import java.util.Arrays;

public class ArrayQueue {
	private int[] array;
	private int front;
	private int rear;
	private int count;
	
	public ArrayQueue(int size) {
		// TODO Auto-generated constructor stub
		count=0;
		array = new int[size];
	}
	
	public void enqueue(int item) {
		if(rear==array.length)
			throw new IllegalStateException("Array is full");
		array[count++]=item;
		rear=count;	
	}
	
	public void dequeue() {
		if(front==rear)
			throw new IllegalStateException("Array is empty");
		front++;
	}
	
	public int peek() {
		if(this.isEmpty())
			throw new IllegalStateException("Nothing to be deleted!");
		return array[front];
	}
	
	public boolean isEmpty() {
		if(front==rear)
			return true;
		return false;
	}
	
	public boolean isFull() {
		if(rear==array.length)
			return true;
		return false;
	}
	
	public void print() {
		for(int i = front;i<rear;i++)
			System.out.println(array[i]);
	}
	
	@Override
	public String toString() {
		return Arrays.toString(array);
	}

}
