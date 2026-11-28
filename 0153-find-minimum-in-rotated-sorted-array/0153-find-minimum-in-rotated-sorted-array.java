class Solution {
    public int findMin(int[] nums) {
        int i=0;
        int n = nums.length;
        int j = n-1;
        int ans =0;
        while(i<j){
            int mid =i + (j-i)/2;
            if(nums[mid] <= nums[j]){
                j = mid;
            //  ans = nums[mid];
            }
            else{
                i = mid+1;
            }
        }
        return nums[j];
    //  return ans;
    }
}