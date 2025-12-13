class Solution {
    public int numberOfSteps(int num) {
        if(num == 0){
            return 0;
        }
        if(num % 2 == 0){
            int num1 = numberOfSteps(num/2);
            return 1 + num1;
        }else{
            int num2 = numberOfSteps(num-1);
            return 1 + num2;
        }
    }
}