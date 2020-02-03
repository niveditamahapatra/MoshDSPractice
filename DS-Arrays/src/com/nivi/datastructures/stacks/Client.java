package com.nivi.datastructures.stacks;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyStack stack = new MyStack();
		System.out.println(stack.reverse("NIVI"));
		System.out.println(stack.balancedExpression(")("));
		System.out.println(stack.balancedExpressionforAll("{(<)}"));

	}

}
