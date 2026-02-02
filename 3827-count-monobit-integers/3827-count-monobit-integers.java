class Solution {
    public int countMonobit(int n) {
        int count = 0;

    
        for (int i = 0; i <= n; i++) {
    
            if (isMonobitInteger(i)) {
                count++;
            }
        }

        return count;
    }

    private boolean isMonobitInteger(int num) {
    
        return (num & (num + 1)) == 0;
    }
}
