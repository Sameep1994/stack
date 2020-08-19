import java.util.Stack;

public class NextGreater {
    public static void main(String[] args) {
        int[] a={5,15,10,8,6,12,9,18};
        nextGt(a);

    }

    public static void nextGt(int[] a){
        Stack<Integer> s = new Stack<Integer>();
        Stack<Integer> ans = new Stack<Integer>();
        s.push(a[a.length-1]);
        for (int i = a.length-1; i >= 0; i--) {
            while (s.empty() == false &&
                    s.peek() <= a[i]) {
                s.pop();
            }
            int span = (s.empty()) ? (-1) : (s.peek());
            ans.push(span);
            s.push(a[i]);
        }
        while(!ans.empty()){
            System.out.println(ans.pop());
        }
    }
}
