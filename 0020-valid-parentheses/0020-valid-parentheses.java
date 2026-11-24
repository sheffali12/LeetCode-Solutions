class Solution {
    public boolean isValid(String s) {
        
        if(s.length()%2 != 0){
            return false;
        } 

        Deque<Character> stack = new ArrayDeque<>();

        for(char ch : s.toCharArray()){
            switch(ch){

                case'(' : stack.push(')') ; break ;
                case'{' : stack.push('}') ; break;
                case'[' : stack.push(']') ; break;

                default:
                if(stack.isEmpty() || stack.pop() != ch)return false;
            }
        } 

        return stack.isEmpty();
    }
}