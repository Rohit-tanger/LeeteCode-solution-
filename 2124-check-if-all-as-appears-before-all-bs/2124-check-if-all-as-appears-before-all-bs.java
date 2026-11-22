class Solution {
    public boolean checkString(String s) {
        
        int n = s.length();
        for(int i =1;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch =='a' && s.charAt(i-1)=='b' ) return false;
        }
        return true;
    }
}