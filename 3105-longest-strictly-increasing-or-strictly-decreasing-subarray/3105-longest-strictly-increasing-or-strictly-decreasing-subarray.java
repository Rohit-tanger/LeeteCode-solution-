class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int n = nums.length;
        
        int max =1;
        int asc=1,dec=1;
        for(int i=1;i<n;i++){
            if(nums[i]>nums[i-1]){
                asc++;
                dec=1;
            }
            else if(nums[i]<nums[i-1]){
                dec++;
                asc=1;
            }
            else{
                dec=1;
                asc =1;
            }
            max = Math.max(max,Math.max(asc,dec));
        }
        return max;
    }
}