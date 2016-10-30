public class Solution {
    public String reverseString(String s) {
        StringBuilder S1 = new StringBuilder();
        for (int i = s.length()-1; i >=0; i--) {
            S1.append(s.charAt(i));
        }
        String s2 = S1.toString();
        return s2;
    }
}
