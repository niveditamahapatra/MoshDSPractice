package com.nivi.datastructures.linkedlist;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class LinkedList {
	private Node first;
	private Node last;
	private int size;
	
	private class Node{
		private int value;
		private Node next;
		
		private Node(int item) {
			value=item;
		}
	}
	
	public void addFirst(int item) {
		Node node = new Node(item);
		if(first==null) {
			first=last=node;
		}
		else {
			node.next=first;
			first=node;
		}
		size++;
		
	}
	
	public void addLast(int item) {
		Node node = new Node(item);
		if(last==null)
			first=last=node;
		last.next=node;
		last=node;
		size++;
	}
	
	public void deleteFirst() throws Exception {
		if(first==null)
			throw new Exception("We have nothing to delete!");
		Node nodeToBeDelted=first;
		first=nodeToBeDelted.next;
		nodeToBeDelted=null;
		size--;
	}
	
	public void deleteLast() throws Exception {
		if(last==null)
			throw new Exception("We have nothing to delete!");
		Node nodeToBeDelted=last;
		Node temp=first;
		Node previousNode=null;
		while(temp!=last) {
			previousNode=temp;
			temp=temp.next;
		}
		previousNode.next=null;
		last=previousNode;
		nodeToBeDelted=null;
		size--;
	}
	
	public boolean contains(int item) throws Exception {
		Node temp=first;
		if(first==null)
			throw new Exception("Linkedlist is empty!");
		while(temp!=null) {
			if(temp.value==item) {
				return true;
			}
			temp=temp.next;	
		}
		return false;
	}
	
	public int indexOf(int item) throws Exception {
		if(first==null)
			throw new Exception("Linkedlist is empty!");
		Node temp=first;
		int index=0;
		int count=0;
		while(temp!=null) {
			if(temp.value==item) {
				index=count;
				return index;
			}
			temp=temp.next;
			count++;
		}
		return -1;
	}
	
	public int sizeofList() {
		return size;
	}
	
	public int[] toArray(LinkedList linkedList) {
		int[] array=new int[size];
		Node temp=first;
		int index=0;
		while(temp!=null) {
			array[index++]=temp.value;
			temp=temp.next;
			}
		return array;	
	}
	
	public void reverse() {
		if(size==0) {
			throw new NoSuchElementException("List is empty");
		}
		Node p=null;
		Node c=first;
		Node n;
		while(c!=null) {
			n=c.next;
			c.next=p;
			p=c;
			c=n;
		}
		last=first;
		last.next=null;
		first=p;
	}
	
	public void printMiddle() {
		Node temp=first;
		ArrayList<Integer> list = new ArrayList<Integer>();
		if(size%2==0) {
			for(int i=0;i<(size/2)-1;i++) {
				temp=temp.next;
			}
			list.add(temp.value);
			temp=temp.next;
			list.add(temp.value);
		}
		else {
			for(int i=0;i<(size/2);i++) {
				temp=temp.next;
			}
			list.add(temp.value);	
		}
		System.out.println(list);
	}
	
	void printMiddlewithOnePass() {
		Node a=first;
		Node b=first;
		while(b!=last && b.next!=last) {
			a=a.next;
			b=b.next.next;	
		}
		if(b==last) {
			System.out.println("Middle node is "+a.value);
		}
		else {
			System.out.println("Middle nodes are "+a.value+", "+a.next.value);
		}
	}
	
	public void print() {
		Node temp=first;
		while(temp!=null) {
			System.out.println(temp.value);
			temp=temp.next;
		}
	}

}
