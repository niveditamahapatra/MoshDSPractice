package com.nivi.datastructures.stacks;

import java.util.Arrays;

public class TwoStacks {
	
	private int[] array;
	private int top1;
	private int top2;
	
	public TwoStacks(int size) {
		// TODO Auto-generated constructor stub
		array=new int[size];
		top1=0;
		top2=size-1;
	}
	
	public void push1(int item1) {
		if(top1<=top2) {
			array[top1]=item1;
			top1++;
		}
		 else
	        { 
	            System.out.println("Stack Overflow"); 
	            System.exit(1); 
	        } 
	}
	
	public void push2(int item2) {
		if(top2>=top1) {
			array[top2]=item2;
			top2--;
		}
		 else
	        { 
	            System.out.println("Stack Overflow"); 
	            System.exit(1); 
	        } 
	}
	
	public int pop1() {
		if(top1==0)
			throw new IllegalStateException("First Stack is empty!");
		return array[--top1];
		
	}
	
	public int pop2() {
		if(top2==array.length-1)
			throw new IllegalStateException("Second Stack is empty!");
		return array[++top2];
		
	}
	
	public void print() {
		System.out.println(Arrays.toString(array));
	}

}
