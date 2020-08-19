import java.util.Stack;

public class BalanceParenthesis {
    public static void main(String[] args) {
        String s = "{[()]}";
        System.out.println(isBal(s));
    }

    public static boolean isBal(String s){
        Stack<Character> stk = new Stack<Character>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('||
            s.charAt(i)=='[' ||
            s.charAt(i)=='{') {
                stk.push(s.charAt(i));
            }else{
                if(stk.empty()==true) {
                    return false;
                }
                else if(match(s.charAt(i),stk.peek())) {
                    return false;
                }
                else {
                    stk.pop();
                }
            }
        }
        return (stk.empty()==true);
    }

    public static boolean match(Character a,Character b){
        return ((a=='(' && b==')')||
                (a=='[' || b==']')||
                (a=='{' || b=='}'));
    }
}
