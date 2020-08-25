import java.util.Stack;

public class ConstGetMin {
    public static Stack<Integer> ms = new Stack<Integer>();
    public static Stack<Integer> as = new Stack<Integer>();
    public static void main(String[] args) {
        insertVal(512);
        insertVal(-1024);
        insertVal(-1024);
        insertVal(512);
        removeval();
        System.out.println(getMin());
        removeval();
        System.out.println(getMin());
        removeval();
        System.out.println(getMin());
    }

    public static int getMin(){
        int min = as.peek();
        return min;
    }

    public static void insertVal(int val){
        ms.push(val);
        if(as.empty()){
            as.push(val);
        }
        else if(ms.peek()<=as.peek()){
            as.push(val);
        }
    }
//note its imp to store the peek values in int and then compare
    public static void removeval(){
        int a_min = as.peek();
        int m_min = ms.peek();
        if(a_min == m_min){
            as.pop();
        }
        ms.pop();
    }
}
