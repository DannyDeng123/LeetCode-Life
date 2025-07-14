package com.leetcode.life;

import java.util.HashMap;

public class No0001TwoSum {
	public static void main(String[] args) {
		int[] nums = {2,7,5,11};
		int target = 9;
		
		for(int i : twoSun(nums, target)) {
			System.out.println(i);
		}
	}
	
	public static int[] twoSun(int[] nums,  int target) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++) {
			if(map.containsKey(target-nums[i])) {
				return new int[] {map.get(target-nums[i]), i};
			}else {
				map.put(nums[i], i);
			}
		}
		return new int[0];
	}
}
