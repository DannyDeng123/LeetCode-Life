package com.leetcode.life;

public class No14LongestCommonPrefix {
	public static void main(String[] args) {
		String[] strs = {"c","acc","ccc"};
		
		System.out.println(longestCommonPrefix(strs));
	}
	
	public static String longestCommonPrefix(String[] strs) {
		String ans = strs[0];
		
		if(strs.length == 0) {
			return "";
		}else {
			int i = 0;
			while(ans.length() > 0 && i < strs.length) {
				if(!strs[i].startsWith(ans)) {
					ans = ans.substring(0, ans.length() - 1);
					i = 0;
				}
				i++;
			}
			return ans;
		}
	}
}
