package com.nivi.datastructures.linkedlist;

import java.util.Arrays;

public class Client {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		LinkedList linkedList = new LinkedList();
		  linkedList.addFirst(10); 
		  linkedList.addFirst(20); 
		  linkedList.addLast(100);
		  linkedList.addLast(200); 
		  linkedList.addFirst(30);
		  //linkedList.addLast(400);
		 
		//linkedList.deleteFirst();
		  //linkedList.deleteLast();
		  //System.out.println(linkedList.contains(00));
		 System.out.println("Index of the value is "+linkedList.indexOf(100)); 
		linkedList.print();
		System.out.println("Size of Linkedlist is "+linkedList.sizeofList());
		linkedList.reverse();
		System.out.println("To array "+Arrays.toString(linkedList.toArray(linkedList)));
		linkedList.printMiddle();
		linkedList.printMiddlewithOnePass();
		

	}

}
