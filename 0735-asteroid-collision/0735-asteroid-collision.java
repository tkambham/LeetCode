class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        int flag = 0;
        Stack<Integer> stack = new Stack<>();
        for(int i = 0;i<asteroids.length;i++){
            flag = 0;
            while(!stack.isEmpty() && stack.peek()>0 && asteroids[i]<0){
                if(Math.abs(asteroids[i]) == Math.abs(stack.peek())){
                    stack.pop();
                    flag = 1;
                    break;
                }
                if(Math.abs(asteroids[i])>stack.peek()){
                    stack.pop();
                    continue;
                }
                else if(Math.abs(asteroids[i])<stack.peek()){
                    flag = 1;
                    break;
                }
            }
            if(flag==0){
                stack.push(asteroids[i]);
            }
        }
        int[] result = new int[stack.size()];
        for(int i = result.length-1;i>=0;i--){
            result[i]=stack.pop();
        }
        return result;
    }
}