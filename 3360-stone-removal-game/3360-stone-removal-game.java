class Solution {
    public boolean canAliceWin(int n) {
        int temp =n;
        int take =10;
        while(take > 0){
            int a = temp-take;
           if(a<0) return false;
           temp =a;
           take--;//10 sse 9 then 8....

           int b= temp-take;
           if(b<0) return true;
           temp=b;
           take--;
        }
        return false;
    }
}