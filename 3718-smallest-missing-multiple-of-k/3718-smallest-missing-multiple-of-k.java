class Solution {
    public int missingMultiple(int[] nums, int k) {
        int multiple = k;
        HashSet<Integer> set = new HashSet<>();

        for( int n : nums){
            set.add(n);
        }

        while(set.contains(multiple)) multiple += k;
        return multiple;
    }
}