
import java.util.Stack;


public class StackBinary {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        StackBinary sb = new StackBinary();
        sb.stackBinary(13);
    }
    
    /*
    input: 1 so n
    Stack st;
    while((n / 2) != 0)
        int t = n % 2
        st.pust(t)
    
    while(!st.empty)
        in -> st.peek();
        st.pop;
    */
    public void stackBinary(int n){
        Stack<Integer> st = new Stack<>();
        int t = 0;
        while(n != 0){
            t = n % 2;
            n = n / 2;
            System.out.println(t);
            st.push(t);
            
        }
        System.out.println(st.toString());
        while(!st.isEmpty()){
            System.out.print(st.peek());
            st.pop();
        }
    }
}
