class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        
        int low=1;
        int high=maxele(piles);
        int ans=0;

        while(low<=high){
           int mid=low+(high-low)/2;
          long totalhrs=hours(piles,mid);

            if(totalhrs<=h){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }return ans;


    }
    public static int maxele(int[] arr){
        Arrays.sort(arr);
        return arr[arr.length-1];
    }
    public static int hours(int[] arr,int hourss){
        int totalhours=0;
        
        for(int i=0;i<arr.length;i++){
            totalhours+=(int)Math.ceil((double) arr[i]/(double)hourss);
        } return totalhours;

    }
}
