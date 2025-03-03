class Solution {
    // time: O(n), space: O(1)
    public int[] pivotArray(int[] nums, int pivot) {
        int n = nums.length, k = 0;
        int[] res = new int[n];
        
        // smaller
        for(int i = 0; i < n; i ++){
            if(nums[i] < pivot) {
                res[k ++] = nums[i];
            }
        }
        // equal
        for(int i = 0; i < n; i ++){
            if(nums[i] == pivot) {
                res[k ++] = nums[i];
            }
        }
        // larger
        for(int i = 0; i < n; i ++){
            if(nums[i] > pivot){
                res[k ++] = nums[i];
            }
        }
        
        return res;
    }
}