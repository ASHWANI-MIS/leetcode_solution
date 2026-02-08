class Solution {
    public int findPeakElement(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            // If mid is greater than next element,
            // peak lies on the left (including mid)
            if (nums[mid] > nums[mid + 1]) {
                right = mid;
            } 
            // Otherwise, peak lies on the right
            else {
                left = mid + 1;
            }
        }

        // left == right is a peak index
        return left;
    }
}
