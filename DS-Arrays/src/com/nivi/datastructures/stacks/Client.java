package com.nivi.datastructures.stacks;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * MyStack stack = new MyStack(); System.out.println(stack.reverse("NIVI"));
		 * System.out.println(stack.balancedExpression(")("));
		 * System.out.println(stack.balancedExpressionforAll("{(<)}"));
		 * 
		 * StackArray stackArray = new StackArray(); stackArray.push(10);
		 * stackArray.push(20); stackArray.print(); //stackArray.pop();
		 * stackArray.print(); System.out.println(stackArray.peek());
		 * System.out.println("IS the stack empty?"+stackArray.isEmpty());
		 * //stackArray.pop();
		 * System.out.println("IS the stack empty?"+stackArray.isEmpty());
		 * System.out.println(stackArray.min());
		 */
		/*
		 * SpecialStack specialStack = new SpecialStack(); specialStack.push(100);
		 * specialStack.push(200); specialStack.push(50); specialStack.pop();
		 * 
		 * System.out.println(specialStack.toString());
		 * System.out.println("Minimum element is"+specialStack.minimum());
		 */
		
		TwoStacks twoStacks = new TwoStacks(5);
		twoStacks.push1(2);
		
		twoStacks.push1(4);
		twoStacks.push1(6);
		twoStacks.push2(100);
		
		twoStacks.push2(200);
		//twoStacks.push2(300);
		twoStacks.print();
		
		System.out.println(twoStacks.pop1());
		System.out.println(twoStacks.pop1());
		System.out.println(twoStacks.pop2());
		System.out.println(twoStacks.pop2());
		System.out.println(twoStacks.pop1());
		System.out.println(twoStacks.pop2());
		System.out.println(twoStacks.pop1());
		
		
		

	}

}
