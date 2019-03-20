package ArrayList;

public class General {
	//第二小 
	//1.<min 2nd=min min=new
	//2.(min,2ndmin) 2ndmin=new
	int secondMinimum(int[] nums) {
		int min = Math.min(nums[0], nums[1]);
		int secondmin = Math.max(nums[0], nums[1]);
		for (int i = 2; i < nums.length; i++) {
			if (nums[i]<min) {
				secondmin = min;
				min = nums[i];
			} else if (nums[i] < secondmin) {
				secondmin = nums[i];
			}
		}
		return secondmin;
	}
	
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
			nums[end] = temp;
		}
		 
	//奇偶排序
		public void oddEvenSort(int[] nums) {
			int first = 0, end = nums.length-1;
			General gr = new General();
			while (first < end) {			
				while (first < end && nums[first] %2 == 1 ) {
					first++;
				}
				while (first <end && nums[end] %2 == 0 ) {
					end--;
				}
				if (first < end) {
					gr.swap(nums, first++, end--);
				}
			}
		}
	//pivot sort 
		//followup 按顺序
		//(Quicksort)
		public void pivotSort(int[] nums, int pivot) {
			int first = 0, second = nums.length - 1;
			while (first < second) {
				while (first < second && nums[first] <= pivot) {
					first++;
				}
				while (first < second && nums[second] > pivot) {
					second--;
				}
				if (first < second) {
					swap(nums, first++, second--);
				}
			}
		}
	//remove element
	public static void main(String[] args) {
		General gr = new General();
		int[] nums = {4,3,5,2,1,11,0,8,6,9};
		gr.pivotSort(nums,7);
		System.out.println();
	}

}
