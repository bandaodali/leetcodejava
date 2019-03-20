package ArrayList;

public class reverseArray {
	//O(n)	
	public void reverseArray(int[] nums) {
		int first = 0, end = nums.length - 1;
		while (first < end) {
			swap(nums, first++, end--);
			
		}
	}
	public void swap(int[] nums, int first, int end) {
		int temp = nums[first];
		nums[first] = nums[end];
		nums[end] = first;
	}
	//number 
	//ÆæÅ¼ÅÅĞò
	public static void main(String[] args) {
		
	}

}
