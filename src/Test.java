import static org.junit.jupiter.api.Assertions.*;

class Test {

	@org.junit.jupiter.api.Test
	void test() {
		int[] nums = new int[] {1,2,3,4,5,6,7,8,9};
		int[] nums1 = new int[] {20,30,40,50,60};
		int[] nums2 = new int[] {3,12,16,29,43,67,82,99};
		int[] nums3 = new int[] {};
		
		Search.linear(nums, 3);
		Search.linear(nums, 18);
		Search.linear(nums1, 40);
		Search.linear(nums1, 39);
		Search.linear(nums2, 43);
		Search.linear(nums2, 112);
		Search.linear(nums3, 12);
		Search.linear(nums3, 2);
		
		Search.binary(nums, 8);
		Search.binary(nums, 12);
		Search.binary(nums1, 30);
		Search.binary(nums1, 89);
		Search.binary(nums2, 16);
		Search.binary(nums2, 103);
		Search.binary(nums3, 54);
		Search.binary(nums3, 13);
	
	}

}
