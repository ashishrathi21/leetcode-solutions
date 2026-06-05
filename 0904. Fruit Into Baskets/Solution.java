// 0904. Fruit Into Baskets
// Difficulty : Medium
// Runtime    : 56 ms
// Memory     : 70.3 MB
// URL        : https://leetcode.com/problems/fruit-into-baskets/

class Solution {
    public int totalFruit(int[] fruits) {
        int left =0;
        int maxLen = 0;

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int right=0; right<fruits.length; right++){
            map.put(fruits[right], map.getOrDefault(fruits[right],0)+1);

            while(map.size()>2){
                map.put(fruits[left],map.get(fruits[left])-1);

                if(map.get(fruits[left])==0){
                    map.remove(fruits[left]);
                }
                left ++;
            }
            int len = right-left+1;
            maxLen = Math.max(maxLen, len);
        }
        return maxLen;
    }
}