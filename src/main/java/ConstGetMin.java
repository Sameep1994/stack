import java.util.Stack;

public class ConstGetMin {
    public static Stack<Integer> ms = new Stack<Integer>();
    public static Stack<Integer> as = new Stack<Integer>();
    public static void main(String[] args) {
        insertVal(2);
        insertVal(4);
        System.out.println(getMin());
        insertVal(1);
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

    public static void removeval(){
        if(as.peek()==ms.peek()){
            as.pop();
        }
        ms.pop();
    }
}
