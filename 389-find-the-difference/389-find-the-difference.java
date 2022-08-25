class Solution {
    public char findTheDifference(String s, String t) {
      int res= 0;
        int i=0;
        while(i< s.length()){
            res= res^s.charAt(i);
            res= res^t.charAt(i);
            i++;
        }
res= res^t.charAt(i);
    return (char) res;
}}