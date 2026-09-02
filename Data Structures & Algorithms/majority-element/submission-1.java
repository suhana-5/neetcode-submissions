class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int s=0;
        int e=nums.length-1;
        while(s<e){
          int m=s+(e-s)/2;
        if(nums[m]==nums[m+1]){
            return nums[m+1];
        }return nums[m];
         }return nums[0];
          }
}