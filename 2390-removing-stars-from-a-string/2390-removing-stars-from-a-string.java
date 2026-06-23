class Solution {
    public String removeStars(String s) {

        Stack<Character> strStack = new Stack<>();
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='*'){
                strStack.pop();
            }else{
                strStack.push(s.charAt(i));
            }
        }

        StringBuilder str = new StringBuilder();

        while(!strStack.isEmpty()){
            str.append(strStack.pop());
        }

        return str.reverse().toString();
    }
}