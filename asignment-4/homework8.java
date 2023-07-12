class Solution {
    public int[] shuffle(int[] nums, int n) {
        
        int[] result = new int[nums.length];

        for(int i = 0; i < n; i++){
            result[i*2] = nums[i];
        }

        for(int j = 1; j < n+1; j++) {
            result[(j*2)-1] = nums[n+j-1];
        }
        
        return result;
    }
}