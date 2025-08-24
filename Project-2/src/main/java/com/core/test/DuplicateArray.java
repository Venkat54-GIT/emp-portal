package com.core.test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class DuplicateArray {

	public static void main(String[] args) {
		int[] nums = {1,2,0,3,4,3}; 
		int[] expectedNums = {0,1,2,3,4}; 

		int k = removeDuplicates(nums); 
		System.out.println(k);
		assert k == expectedNums.length;
		for (int i = 0; i < k; i++) {
		    assert nums[i] == expectedNums[i];
		}
		
	}
	
	public static int removeDuplicates(int[] nums) {
		System.out.println(Arrays.toString(nums));
		Set<Integer> s=new HashSet<Integer>();
		for(int i=0;i<nums.length;i++){
            s.add(nums[i]);
        }
		System.out.println(s);
		System.out.println("added");
		return s.size();
	}

}
