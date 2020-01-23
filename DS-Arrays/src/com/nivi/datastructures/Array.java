package com.nivi.datastructures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Array {
	
	private int[] array;
	private int count=0;
	
	public Array(int size){
		array=new int[size];
	}
	
	public void insert(int item) {
		//Check if the array is full
		
		
		if(array.length==count) {
			int[] newarray=new int[count*2];
			for(int i=0;i<count;i++) {
				newarray[i]=array[i];
			}
			newarray[count++]=item;
			array=newarray;
		}
		else {
			array[count++]=item;
		}
	}
	
	public void removeAt(int index) {
		
		
		
		for(int i=index;i<(array.length)-1;i++) {
			array[i]=array[i+1];
		}	
	}
	
	public int indexOf(int item) {
		int element=0;
		for(int i=0;i<array.length;i++) {
			if(array[i]==item) {
				element=i;
			}
		}
		return element;
	}
	
	public void print() {
		System.out.println(Arrays.toString(array));
	}

}
