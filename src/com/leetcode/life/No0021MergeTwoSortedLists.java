package com.leetcode.life;

import com.leetcode.life.util.ListNode;

public class No0021MergeTwoSortedLists {
	public static void main(String[] args) {
		ListNode n13 = new ListNode(4);
		ListNode n12 = new ListNode(2, n13);
		ListNode n11 = new ListNode(1, n12);
		
		ListNode n23 = new ListNode(4);
		ListNode n22 = new ListNode(3, n23);
		ListNode n21 = new ListNode(1, n22);
		
//		mergeTwoLists(n12, n21);
	}

	public static ListNode recursionMergeTwoLists(ListNode list1, ListNode list2) {
		
		if(list1!=null && list2!=null) {
			if(list1.val < list2.val) {
				list1.next = recursionMergeTwoLists(list1.next, list2);
				return list1;
			}else {
				list2.next = recursionMergeTwoLists(list1, list2.next);
				return list2;
			}
		}
		
		if(list1 == null) {
			return list2;
		}
		return list1;
    }
	
	public static ListNode iterativeMergeTwoLists(ListNode list1, ListNode list2) {
		ListNode dummyHead = new ListNode(0);
		ListNode current = dummyHead;
		
		while(list1!=null && list2!=null) {
			if(list1.val <= list2.val) {
				current.next = list1;
				list1 = list1.next;
			}else {
				current.next = list2;
				list2 = list2.next;
			}
			current = current.next;
		}
		
		if(list1 != null) {
			current.next = list1;
		}else {
			current.next = list2;
		}
		
		return dummyHead.next;
	}
}
