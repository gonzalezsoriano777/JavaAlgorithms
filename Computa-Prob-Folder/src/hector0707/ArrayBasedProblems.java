package hector0707;

import java.util.ArrayList;

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
	
	public int[] fix34(int[] nums) {
		
		 ArrayList<Integer> others = new ArrayList<Integer>();

		    for (int i = 0; i < nums.length; i++ )
		    {
		        if ( nums[i] != 3 && nums[i] != 4 )
		            others.add(nums[i]);
		    }       

		    int[] result = new int[nums.length];

		   
		    for ( int i = 0; i < nums.length - 1; i++ )
		    {
		        if ( nums[i] == 3)
		        {
		            result[i] = 3;
		            result[i+1] = 4;
		        }           
		    }

		    
		    int j = 0;
		    for ( int i = 0; i < result.length; i++ )
		    {
		        if ( result[i] == 0 )
		        {               
		            int temp = others.get(j);
		            j++;
		            result[i] = temp;
		        }

		    }

		    return result;
		
	}

}
