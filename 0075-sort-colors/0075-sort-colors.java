class Solution {
    public void sortColors(int[] nums) {
        int l=0;
        int mid =0;
        int high =nums.length-1;

        while(mid <=high){
            if(nums[mid]==0){
                nums[mid]=nums[l];
                nums[l]=0;
                l++;
                mid++;
            }
            else if(nums[mid]==1){
                mid ++; 
            }
            else{
                nums[mid]=nums[high];
                nums[high] =2;
                high--;
            }
        }
    }
}