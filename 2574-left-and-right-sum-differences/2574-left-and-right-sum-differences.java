class Solution {
    public int[] leftRightDifference(int[] nums) {
        int prefixSum[] = new int [nums.length];
        int suffixSum[] = new int [nums.length];

        prefixSum[0] = 0;

        for(int i=1; i<prefixSum.length; i++){
            prefixSum[i] = nums[i-1] + prefixSum[i-1];
        }

        suffixSum[nums.length - 1] = 0;

        for(int i=suffixSum.length - 2; i>=0; i--){
            suffixSum[i] = nums[i+1] + suffixSum[i+1];
        }

        int answer[] = new int[nums.length];

        for(int i=0; i<answer.length; i++){
            answer[i] = Math.abs(prefixSum[i] - suffixSum[i]);
        }

        return answer;
    }
}