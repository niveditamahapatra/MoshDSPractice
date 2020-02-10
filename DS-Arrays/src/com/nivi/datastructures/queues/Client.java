package com.nivi.datastructures.queues;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayQueue arrayQueue = new ArrayQueue(5);
		
		  arrayQueue.enqueue(10); 
		  arrayQueue.enqueue(20); 
		  arrayQueue.enqueue(30);
		  arrayQueue.enqueue(40);
		  arrayQueue.enqueue(50);
		  
		  arrayQueue.print();
		  
		  System.out.println("*****************PERFORMING ARRAY DEQUEUE******************");
		  arrayQueue.dequeue();
		  
		  arrayQueue.dequeue();
		  arrayQueue.dequeue();
		  //arrayQueue.dequeue();
		  //arrayQueue.dequeue();
		  arrayQueue.print();
		  
		  System.out.println("Peeking the element "+arrayQueue.peek());
		  System.out.println("Is array empty?"+arrayQueue.isEmpty());
		  System.out.println("Is array full?"+arrayQueue.isFull());
		  System.out.println(arrayQueue);
		  
		  CircularQueue circularQueue = new CircularQueue(5);
		  circularQueue.enqueue(100);
		  circularQueue.enqueue(200);
		
		  circularQueue.enqueue(300); circularQueue.enqueue(400);
		  circularQueue.enqueue(500); 
		  circularQueue.dequeue();
		  circularQueue.enqueue(600); 
		  
		  circularQueue.dequeue();
		  circularQueue.dequeue();
		  circularQueue.enqueue(700); 
		  circularQueue.enqueue(800); 
		  //circularQueue.enqueue(900); 
		  System.out.println(circularQueue.toString());
		  
		  
		  QueuewithTwoStacks queuewithTwoStacks = new QueuewithTwoStacks();
		  queuewithTwoStacks.enqueue(1000);
		  queuewithTwoStacks.enqueue(2000);
		  queuewithTwoStacks.enqueue(3000);
		  queuewithTwoStacks.enqueue(4000);
		  queuewithTwoStacks.enqueue(5000);
		  System.out.println(queuewithTwoStacks.dequeue());
		  System.out.println(queuewithTwoStacks);
		  
		  
		  PriorityQueue priorityQueue = new PriorityQueue(5);
		  priorityQueue.insert(50);
		  priorityQueue.insert(10);
		  	  
		  
		   
		

	}

}
