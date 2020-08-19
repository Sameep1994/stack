import java.util.Stack;

public class StockSpan {
    public static void main(String[] args) {
        int [] a ={15,13,12,14,16,8,6,4,10,30};
        span(a);
    }
//here we are inserting elements from array 1 by 1 and pushing the index in stack
//compare it with stack elements and remove the elements whenever they are less than curr element
//stack top always contains the largest element
//for frst element its always 1
    public static void span(int[] a){
        Stack<Integer> s = new Stack<Integer>();
        s.push(0);
        for(int i=1;i<a.length;i++){
            while(s.empty()==false &&
            a[s.peek()]<=a[i]){
                s.pop();
            }
            int span = (s.empty())?(i+1):(i-s.peek());
            System.out.println(span);
            s.push(i);
        }
    }
}
