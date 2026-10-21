class Solution {
    public int search(int[] nums, int target) {
        
        if (nums.length == 1 && nums[0] == target){
            return 0;
        }
        
        int mid;
        int curr;
        int low = 0;
        int high = nums.length-1;
        
        while (low <= high) {
            
            mid = (low + high) / 2;
            curr = nums[mid];

            if (curr == target){
                return mid;
            } else if (curr < target){
                low = mid +1;
            } else {
                high = mid -1;
            }
        }

        return -1;
    }
}
