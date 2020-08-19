import static java.lang.System.exit;

public class TwoStack {
    int[] a = new int[6];
    int top1=-1,top2=a.length;

    public static void main(String[] args) {

    }
//we have given a single array and we have to implement two stacks using it
//we maintain two pointers at each end and grow stacks from both ends to middle
    public void push1(int x){
        if(top1<top2-1){
            top1++;
            a[top1]=x;
        }
    }

    public void push2(int x){
        if(top2<top1-1){
            top2++;
            a[top2]=x;
        }
    }

    public int pop1(){
        if(top1>=0){
            int x = a[top1];
            top1--;
            return x;
        }
        else{
            exit(1);
        }
        return -1;
    }

    public int pop2(){
        if(top2<=a.length-1){
            int x = a[top2];
            top2++;
            return x;
        }
        else{
            exit(1);
        }
        return -1;
    }
}
