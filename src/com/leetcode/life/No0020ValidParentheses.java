package com.leetcode.life;

import java.util.HashMap;
import java.util.Stack;

public class No0020ValidParentheses {
	public static void main(String[] args) {
		System.out.println(isValid("){"));
	}
	
	
	public static boolean isValid(String s) {
		if(s.length()%2 == 0) {
			Stack stack = new Stack();
		     HashMap map = new HashMap();
		     map.put(')', '(');
		     map.put(']', '[');
		     map.put('}', '{');

		     for(char c : s.toCharArray()) {
		    	 if(map.containsValue(c)) {
		    		 stack.push(c);
		    	 }else if(map.containsKey(c)) {
		    		 if(stack.isEmpty() || map.get(c) != stack.pop()) {
		    			 return false;
		    		 }
		    	 }
		     }
		     
		     return stack.isEmpty();
		}else {
			return false;
		}
	}
}
