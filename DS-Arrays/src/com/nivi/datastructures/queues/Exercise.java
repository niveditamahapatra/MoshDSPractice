package com.nivi.datastructures.queues;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Queue;
import java.util.Stack;

import com.sun.org.apache.xpath.internal.axes.ReverseAxesWalker;

public class Exercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> queue = new ArrayDeque<Integer>();
		Exercise exercise = new Exercise();
		queue.add(10);
		queue.add(20);
		queue.add(30);
		queue.add(40);
		System.out.println(queue);
		//System.out.println("Reversed queue is "+exercise.reverseusingstacks(queue));
		System.out.println(exercise.reverseusingqueueandstack(queue));
		exercise.reverseusingqueueandstack(queue);
		System.out.println(queue);
	}
	
	public Stack<Integer> reverseusingstacks(Queue<Integer> queue) {
		Stack<Integer> stack1 = new Stack<Integer>();
		while(!queue.isEmpty()) {
			stack1.push(queue.poll());
		}
		Stack<Integer> stack2 = new Stack<Integer>();
		while(!stack1.isEmpty()) {
			stack2.push(stack1.pop());
		}
		return stack2;
	}
	
	public Queue<Integer> reverseusingqueueandstack(Queue<Integer> queue) {
		Stack<Integer> stack = new Stack<Integer>();
		while(!queue.isEmpty()) {
			stack.push(queue.poll());
		}
		while(!stack.isEmpty()) {
			queue.add(stack.pop());
		}
		return queue;
	}

}
