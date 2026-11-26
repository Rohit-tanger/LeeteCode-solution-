class Solution {
    public int[] asteroidCollision(int[] nums) {
        Stack<Integer> stack = new Stack<>();

        for(int num :nums){
            boolean destroyed = false;

            while(!stack.isEmpty()&& stack.peek()>0 && num<0){
                if(stack.peek()< -num){
                    stack.pop();
                    continue; // ye  bar ek bar destroy ke bad bad skip kr dega
                }
                else if(stack.peek()== -num){
                    stack.pop(); /// dono ko destroy
                }
                destroyed =true;
                break;
            }
            if(!destroyed) stack.push(num);
        }
        int ans[] = new int[stack.size()];
        for(int i=ans.length-1;i>=0;i--){
            ans[i] = stack.pop();
        }
        return ans;
    }
}