class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int arr[] =new int[10001];
        Stack<Integer> stack = new Stack<>();
        int n = nums2.length;
        for(int i=n-1;i>=0;i--){
            while(!stack.isEmpty()&& stack.peek()<=nums2[i]){
                stack.pop();
            }
        arr[nums2[i]] =stack.isEmpty() ? -1 : stack.peek();
        stack.push(nums2[i]);
        }
        for(int i=0;i<nums1.length;i++){
            nums1[i]=arr[nums1[i]];
        }
 return nums1;
    }
}