class Solution {
    public int dominantIndices(int[] nums) {
        int n=nums.length;
        int dominant=0;
        for(int i=0;i<n-1;i++){
           int rytsum=0;
            int   rytcount=0;

        

        for(int j=i+1;j<n;j++){
            rytsum+= nums[j];
            rytcount++;

        }
        double avg=(double) rytsum / rytcount;
        if(nums[i]>avg){
            dominant++;
        }
        
    }
    return dominant;
}
}