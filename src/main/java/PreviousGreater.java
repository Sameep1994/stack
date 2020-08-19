import java.util.Stack;

public class PreviousGreater {
    public static void main(String[] args) {
        int[] a ={15,10,18,12,4,6,2,8};
        prevGt(a);
    }

    public static void prevGt(int [] a) {
        Stack<Integer> s = new Stack<Integer>();
        s.push(a[0]);
        for (int i = 0; i < a.length; i++) {
            while (s.empty() == false &&
                    s.peek() <= a[i]) {
                s.pop();
            }
            int span = (s.empty()) ? (-1) : (s.peek());
            System.out.println(span);
            s.push(a[i]);
        }
    }
}
