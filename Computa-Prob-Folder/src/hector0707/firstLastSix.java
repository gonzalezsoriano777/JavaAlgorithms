package hector0707;

public class firstLastSix {
	
	public boolean firstLast6() {
		
		int[] nums = {4, 5, 7, 6};
		
		for(int i = 0; i < nums.length; i++) {
			
			if(nums[i] == 6) {
				return true;
			}
			
			if(nums[0] != 6 && nums[nums.length - 1] != 6) {
				return false;
			}
			
		}
		return false;
	}

}
