class Solution {
    public String mergeAlternately(String word1, String String2) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        int n1 = word1.length();
        int n2 = String2.length();

        while (i < n1 || i < n2) {
            if (i < n1) {
                sb.append(word1.charAt(i));
            }
            if (i < n2) {
                sb.append(String2.charAt(i));
            }
            i++;
        }

        return sb.toString();
    }
}
