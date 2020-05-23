package hector0707;

public class firstLastMatch {
	
	public boolean firstLastMatch(int[] nums) {
		
		if(nums[0] == nums[nums.length - 1]) {
			return true;
		} else if (nums == null) { 
			return false;
		}
		
		
		return false;
		
	}

}
