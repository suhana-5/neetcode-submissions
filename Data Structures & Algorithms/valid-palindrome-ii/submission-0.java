class Solution {
    public boolean validPalindrome(String s) {
        int left=0;
        int right=s.length()-1;
        while(left<right){
            char e=s.charAt(left);
            char f=s.charAt(right);
            if(e!=f){
                return isPalin(s,left+1,right)|| isPalin(s,left,right-1);
            }else{
                left=left+1;
                right=right-1;
            }
        }return true;
    }
    public boolean isPalin(String s,int left,int right){
        while(left<right){
            if(s.charAt(left)!=s.charAt(right)){
                return false;
            }
            left=left+1;
            right=right-1;
        }
        return true;
    }
}