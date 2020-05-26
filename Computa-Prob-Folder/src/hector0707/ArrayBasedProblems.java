package hector0707;

public class ArrayBasedProblems {
	
	public int maxSpan(int[] nums) {
		
		int span = 0;
		int max = 0;
		
		for(int i = 0; i < nums.length; i++) {
			
			int j = nums.length - 1;
			
			while(nums[i] != nums[j]) 
				
				j--;
				span = j - i + 1;
			
			if(span > max) {
				max = span;
			}
		}
		
		return max;
	}

}
