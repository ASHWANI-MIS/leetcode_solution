class Solution {
    public int maxProduct(int[] nums) {
        int n=nums.length;
        int leftP=1;
        int rytP=1;
        int ans=nums[0];
        for(int i=0;i<n;i++){
            leftP = leftP == 0 ? 1 : leftP;
            rytP = rytP == 0 ?1: rytP ;
            leftP*=nums[i];
            rytP*=nums[n-1-i];
            ans=Math.max(ans,Math.max(leftP,rytP));
        }
        return ans;
        
    }
}