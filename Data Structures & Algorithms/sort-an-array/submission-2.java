class Solution {
    public int[] sortArray(int[] nums) {
        for(int i=1;i<nums.length;i++){
            for(int j=i;j>0;j--){
                if(nums[j-1]>nums[j]){
                    swap(nums,j,j-1);
                }else{
                    break;
                }
        }}return nums;
        }
    }public static void swap(int[] nums,int first,int last){
        int temp=nums[first];
        nums[first]=nums[last];
        nums[last]=temp;
    
}