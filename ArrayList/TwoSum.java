package ArrayList;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
	//Brute Force Space 1 Time N^2
	public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
        	for(int j = 0; i <nums.length; i++) {
        		if (nums[j] == target - nums[i]) {
        			return new int[] {i,j};
        		}
        	}
        }
        throw new IllegalArgumentException("No two sum solution");
    } 
	//Hash T O(n); S O(n)
	public int[] twoSumHash(int[] nums, int target) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			map.put(nums[i], i);
		}
		for (int i = 0; i < nums.length; i++) {
			int complement = target - nums[i];
			if (map.containsKey(complement) && 
					map.get(complement) != i) {
				return new int[] {i, map.get(complement)};
			}
		}
		throw new IllegalArgumentException("No two sum solution");
	}
	//ÅÅÐò×önlogn Ë«Ö¸Õë
	public int[] twoSum2point(int[] numbers, int target) {
		int[] result = new int[2];
		Arrays.sort(numbers);
		int first = 0, second = numbers.length - 1;
		while (first < second) {
			if (numbers[first] + numbers[second] == target) {
				result[0] = numbers[first];
				result[1] = numbers[second];
				return result;
			}
			if (numbers[first] + numbers[second] > target) {
				second--;
			}
			if (numbers[first] + numbers[second] < target) {
				first++;
			}
		}
		return result;
	}
	public static void main(String[] args) {
		TwoSum ts = new TwoSum();		
		int[] output = ts.twoSumHash(new int[] {1,3,5,7,9},10);
		for (int i = 0; i<output.length; i++) {
			System.out.println(output[i]);
		}
	}
}
