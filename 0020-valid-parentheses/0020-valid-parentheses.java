class Solution {
    public boolean isValid(String s) {
        Stack<Character>stack= new Stack<>();

        char[] a=s.toCharArray();

        for(char x : a){
            if(x=='(' || x=='[' || x=='{'){
                stack.push(x);
            }
            else{
                if(stack.isEmpty()){
                    return false;
                }
            
            char top=stack.pop();

            if(x==')' && top !='(') return false;
            if(x=='}' && top!='{') return false;
            if(x==']' && top!='[')return false;
        }
        }
        return stack.isEmpty();

        
    }
}