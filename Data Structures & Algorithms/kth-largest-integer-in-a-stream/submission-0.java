class KthLargest {
    int k = 0;
    List<Integer> nums = new ArrayList<>();

    public KthLargest(int k, int[] nums) {
        this.k = k-1;

        for (int i = nums.length -1; i >= 0; i--){
            this.nums.add(nums[i]);
        }
        this.nums.sort(Comparator.reverseOrder());
    }
    
    public int add(int val) {
        nums.add(val);
        this.nums.sort(Comparator.reverseOrder());
        return this.nums.get(k);
    }
}
