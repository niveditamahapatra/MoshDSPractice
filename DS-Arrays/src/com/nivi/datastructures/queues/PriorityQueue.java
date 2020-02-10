package com.nivi.datastructures.queues;

import java.util.Arrays;

public class PriorityQueue {
	private int[] array;
	private int count;
	
	public PriorityQueue(int size) {
		// TODO Auto-generated constructor stub
		count=0;
		array = new int[size];
	}
	
	public void insert(int item) {
		if(count==array.length)
			throw new IllegalStateException("PQ is full");
		if(count==0)
			array[count++]=item;
		if(item>array[count-1])
			array[count]=item;
		else {
			for(int i=count-1;i>0;i--) {
				array[i+1]=array[i];
			}
			array[count]=item;
		}
		count++;
		
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return Arrays.toString(array);
	}
	
	

}
