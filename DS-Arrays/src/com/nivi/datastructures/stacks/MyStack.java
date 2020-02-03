package com.nivi.datastructures.stacks;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class MyStack {
	
	Stack<Character> in = new Stack<Character>();
	Stack<Character> out = new Stack<Character>();
	final List<Character> leftBrackets = Arrays.asList('(','{','<','[');
	final List<Character> rightBrackets = Arrays.asList('(','{','<','[');
	
	private boolean isLeftBracket(Character ch) {
		return leftBrackets.contains(ch);
	}
	
	private boolean isRightBracket(Character ch) {
		return rightBrackets.contains(ch);	
	}
	
	private boolean checkbrackets(Character ch,Character top) {
		return ch==top;
		
	}
	
	public String reverse(String input) {
		if(input==null)
			throw new IllegalArgumentException();
		Stack<Character> in=new Stack<Character>();
		for(int i=0;i<input.length();i++) {
			in.push(input.charAt(i));
		}
		StringBuffer reverse = new StringBuffer();
		while(!in.isEmpty()) {
			reverse.append(in.pop());
		}
		return reverse.toString();
	}
	
	public boolean balancedExpression(String input) {
		Stack<Character> in = new Stack<Character>();
		Stack<Character> out = new Stack<Character>();
		for(char ch:input.toCharArray()) {
			if(ch=='(') {
				in.push(ch);
			}
			if(ch==')' && !in.empty())
				in.pop();
			
		}
		return in.isEmpty();
	}
	
	public boolean balancedExpressionforAll(String input) {
		for(Character ch:input.toCharArray()) {
			if(isLeftBracket(ch))
				in.push(ch);
			if(isRightBracket(ch)) {
				if(in.empty())
					return false;
				Character top=in.pop();
				if(!checkbrackets(ch,top))
					return false;
			}
			
		}
		return in.empty();
	}

}
