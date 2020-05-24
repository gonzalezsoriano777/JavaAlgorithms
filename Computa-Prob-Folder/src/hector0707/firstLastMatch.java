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
	
	public boolean commonIndexes(int[] a, int[] b) {
		
		if(a[0] == b[0] || 
				a[a.length - 1] == b[b.length - 1]) {
			return true;
		}
		
		return false;
	}

}
