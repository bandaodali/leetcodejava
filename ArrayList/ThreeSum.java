package ArrayList;

import java.util.Arrays;

public class ThreeSum {
	
	public static void main(String[] args) {
		public int[] threeSum(int[] nums, int target) {
			int[] result = new int[3];
			if (nums.length < 3) {
				return nums;
			}
			Arrays.sort(nums);
			for (int i = 0; i < nums.length-2; i++) {
				TwoSum ts = new TwoSum();
				ts.twoSum2point(nums[i+1..], target-nums[i]);
				if (two has result) {
					result = {nums[i], TwoSum result};
				}
			}
		}
	}

}
