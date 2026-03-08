class Solution {
    public int[] searchRange(int[] nums, int target) {

        int first = -1, last = -1;
        int left = 0, right = nums.length - 1;

        // Find first position
        while (left <= right) {
            int mid = (left + right) / 2;

            if (nums[mid] >= target) {
                if (nums[mid] == target) first = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        left = 0;
        right = nums.length - 1;

        // Find last position
        while (left <= right) {
            int mid = (left + right) / 2;

            if (nums[mid] <= target) {
                if (nums[mid] == target) last = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return new int[]{first, last};
    }
}