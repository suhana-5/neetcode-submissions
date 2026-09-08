class Solution {
    public void sortColors(int[] nums) {
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j>0;j--){
                if(nums[j-1]>nums[j]){
                    swap(nums,j-1,j);
                }else{
                    break;
                }
            }
            


        }
 }   public void swap(int[] nums,int first, int last){
        int temp=nums[first];
        nums[first]=nums[last];
        nums[last]=temp;
     } }
