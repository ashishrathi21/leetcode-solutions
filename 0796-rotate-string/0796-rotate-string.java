class Solution {
    public boolean rotateString(String s, String goal) {
         
        if(s.length() != goal.length()) return false;

        String concatenatedString = s + s;

        if(concatenatedString.contains(goal)) return true;
        else return false;
    }
}