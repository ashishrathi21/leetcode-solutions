class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        List<Integer> lessNo = new ArrayList<>();
        List<Integer> equalNo = new ArrayList<>();
        List<Integer> greaterNo = new ArrayList<>();

        for(int num : nums){
            if(num < pivot) lessNo.add(num);
            else if(num == pivot) equalNo.add(num);
            else greaterNo.add(num);
        }

        int result[] = new int[nums.length];
        int idx = 0;

        for(int num : lessNo) result[idx++] = num;
        for(int num : equalNo) result[idx++] = num;
        for(int num : greaterNo) result[idx++] = num;
        

        return result;
    }
}