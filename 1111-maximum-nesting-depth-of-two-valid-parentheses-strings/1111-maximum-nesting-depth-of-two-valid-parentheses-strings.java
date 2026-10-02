class Solution {
    public int[] maxDepthAfterSplit(String seq) {
        int res[] = new int[seq.length()];

        for(int i=1; i<seq.length(); i++){
            res[i] = (i ^ seq.charAt(i)) & 1;
        }

        return res;
    }
}