class Solution {
    public void reverseString(char[] s) {
        
       int t=0;
       int e=s.length-1;
        while(t<e){
              swap(s,t,e);
             t++;
             e--;
            
        }
    }public void swap(char[] s,int t,int e){
        char temp=s[t];
        s[t]=s[e];
        s[e]=temp;
    }
}