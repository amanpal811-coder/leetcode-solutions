class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        char [] arr = s.toCharArray();

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == '(' || arr[i] == '[' || arr[i] == '{'){
                stack.push(arr[i]);
            }
            else{
                if(stack.isEmpty()){
                    return false;
                }
                char top = stack.pop();

                if(arr[i] == ')' && top != '(') return false;
                if(arr[i] == ']' && top != '[') return false;
                if(arr[i] == '}' && top != '{') return false;
            }
        }
        return stack.isEmpty();
    }
}