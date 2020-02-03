package com.nivi.datastructures.arrays;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Array array = new Array(3);
		array.insert(10);
		array.insert(20);
		array.insert(30);
		array.insert(40);
		array.insert(50);
		array.print();
		array.removeAt(2);
		array.print();
		System.out.println(array.indexOf(50));
	}

}
