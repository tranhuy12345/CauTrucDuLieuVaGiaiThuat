
import java.util.Stack;


public class EncodeString {

    
    public static void main(String[] args) {
        EncodeString es = new EncodeString();
        es.encodeString("aaaaaaabbbcccdd");
    }
    /*
    input String s;
    Stack st
    char[] c = s->Character;
    for i -> c.length
        if(st.isEmpty || st.peek == c[i])
            st.pust(i)
        else
            int count = 0;
            while(!st.isEmpty)
                count++;
            
        in ra st.peek
        st.pop()
    */
    public void encodeString(String s){
        s = s + "@";
        Stack<Character> st = new Stack<>();
        char[] c = s.toCharArray();
        for (int i = 0; i < c.length; i++) {
            if(st.isEmpty() || st.peek()==c[i]){
                st.push(c[i]);
                
            }else{
                int count = 0;
                String in = "";
                while (!st.isEmpty()) {                    
                    count++;
                    in = st.peek()+ "";
                    st.pop();
                }
                System.out.print(in + count);
                st.push(c[i]);
                               
            }
        }
    }
}
