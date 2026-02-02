class Solution {
    public int finalElement(int[] nums) {
        int[] kalumexora = nums;
        int n= kalumexora.length;
        return Math.max(kalumexora[0],kalumexora[n-1]);
        
    }
}