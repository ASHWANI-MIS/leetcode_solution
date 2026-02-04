class Solution {
    public String minWindow(String s, String t) {
        if (s.length() < t.length()) return "";

        // Step 1: Frequency map of t
        HashMap<Character, Integer> tMap = new HashMap<>();
        for (char c : t.toCharArray()) {
            tMap.put(c, tMap.getOrDefault(c, 0) + 1);
        }

        int required = tMap.size(); // distinct chars needed
        int formed = 0;

        HashMap<Character, Integer> windowMap = new HashMap<>();

        int left = 0, right = 0;
        int minLen = Integer.MAX_VALUE;
        int start = 0;

        // Step 2: Expand window
        while (right < s.length()) {
            char c = s.charAt(right);
            windowMap.put(c, windowMap.getOrDefault(c, 0) + 1);

            if (tMap.containsKey(c) &&
                windowMap.get(c).intValue() == tMap.get(c).intValue()) {
                formed++;
            }

            // Step 3: Shrink window
            while (left <= right && formed == required) {
                if (right - left + 1 < minLen) {
                    minLen = right - left + 1;
                    start = left;
                }

                char lc = s.charAt(left);
                windowMap.put(lc, windowMap.get(lc) - 1);

                if (tMap.containsKey(lc) &&
                    windowMap.get(lc) < tMap.get(lc)) {
                    formed--;
                }
                left++;
            }

            right++;
        }

        return minLen == Integer.MAX_VALUE
                ? ""
                : s.substring(start, start + minLen);
    }
}
