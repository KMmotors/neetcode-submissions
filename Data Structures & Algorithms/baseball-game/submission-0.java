class Solution {
    public int calPoints(String[] operations) {
       Stack<Integer> stack = new Stack<>();
       for(String op:operations){
        if(op.equals("+")){
            
            int top=stack.pop();
            int next=stack.peek();
            int newScore=top+next;
            stack.push(top);
            stack.push(newScore);
        }else if(op.equals("C")){
            stack.pop();
        } else if(op.equals("D")){
            stack.push(2*stack.peek());

        }else{
            stack.push(Integer.parseInt(op));
        }

       }
       int sum=0;
       for(int a:stack){
        sum=sum+a;
       }
       return sum;
    }
}