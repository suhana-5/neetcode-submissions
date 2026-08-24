class Solution {
    public boolean isPalindrome(String s) {
       s= s.toLowerCase();
        int i=0;
       int e=s.length()-1;
        while(i<e){
            
            if(!Character.isLetterOrDigit(s.charAt(i))){
                i++;
                continue;
            }
            if(!Character.isLetterOrDigit(s.charAt(e))){
                e--;
                continue;
            }
            if(s.charAt(i)!=s.charAt(e)){
                return false;
            }
            i++;
            e--;
        }return true;
    }
}
