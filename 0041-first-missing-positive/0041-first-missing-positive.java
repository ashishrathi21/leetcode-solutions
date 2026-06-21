class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int need =1;

        for(int num : nums){

            if(num < need) continue;

            if(need == num) need++;
            else if(num > need) return need;
        }
        return need;
    }
}