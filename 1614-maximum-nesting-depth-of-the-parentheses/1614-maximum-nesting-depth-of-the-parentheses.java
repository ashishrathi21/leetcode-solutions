class Solution {
    public int maxDepth(String s) {
        Stack<Character> stack = new Stack<>();

        int max = 0;
        int count = 0;

        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '('){
                stack.push('(');
                count ++;

                if(count > max){
                    max ++;
                }
            }else if(s.charAt(i) == ')'){
                stack.pop();
                count--;
            }
        }

        return max;
    }
}