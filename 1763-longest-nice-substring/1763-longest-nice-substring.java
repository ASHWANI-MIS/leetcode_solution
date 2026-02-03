//class Solution {
   // public String longestNiceSubstring(String s) {
     //   int n = s.length();
       // String ans = "";

        //for (int i = 0; i < n; i++) {
          //  for (int j = i + 1; j <= n; j++) {
            //    String sub = s.substring(i, j);
              //  if (isNice(sub) && sub.length() > ans.length()) {
                //    ans = sub;
                //}
            //}
        //}
        //return ans;
    //}

   // private boolean isNice(String s) {
     //   java.util.Set<Character> set = new java.util.HashSet<>();
       // for (char c : s.toCharArray()) {
         //   set.add(c);
        //}

       // for (char c : set) {
         //   if (!set.contains(Character.toLowerCase(c)) ||
           //     !set.contains(Character.toUpperCase(c))) {
             //   return false;
            //}
        //}
        //return true;
    //}
//}
class Solution {
    public String longestNiceSubstring(String s) {
        String ans = "";

        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                String sub = s.substring(i, j);
                if (isNice(sub) && sub.length() > ans.length()) {
                    ans = sub;
                }
            }
        }
        return ans;
    }

    boolean isNice(String s) {
        for (char c : s.toCharArray()) {
            if (s.indexOf(Character.toLowerCase(c)) == -1 ||
                s.indexOf(Character.toUpperCase(c)) == -1) {
                return false;
            }
        }
        return true;
    }
}

