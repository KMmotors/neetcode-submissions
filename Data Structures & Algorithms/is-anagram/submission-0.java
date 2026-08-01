class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }

        StringBuilder s1 = new StringBuilder(s);
        StringBuilder t1=new StringBuilder(t);

        char[] arr1=s1.toString().toCharArray(); 
         char[] arr2=t1.toString().toCharArray();
         Arrays.sort(arr1);
         Arrays.sort(arr2);

         return Arrays.equals(arr1,arr2);

    }
}
