
import java.util.*;

public class BaiTap1 {

    public static void main(String[] args) {
        BaiTap1 b = new BaiTap1();
        b.reverseString("hui");

    }

    public void stackBinry(int n) {
        Stack<Integer> st = new Stack<>();

        while (n != 0) {
            int t = n % 2;
            st.add(t);
            n = n / 2;
        }
        while (!st.empty()) {
            System.out.print(st.peek());
            st.pop();
        }

    }

    public void encodeString(String s) {
        s = s + "@";
        char[] cs = s.toCharArray();
        System.out.println(s);
        Stack<Character> st = new Stack<>();
        int i = 0;
        int count = 0;
        while (i < cs.length - 1) {
            st.push(cs[i]);
            i++;
            count++;
            if (st.peek() != cs[i]) {
                System.out.print(st.peek().toString() + count);
                count = 0;
            }

        }
    }

    public void encodeString2(String s) {
        s = s + "@";
        char[] cs = s.toCharArray();
        String str = "";
        System.out.println(s);
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < cs.length; i++) {
            if (st.empty() || st.peek() == cs[i]) {
                st.push(cs[i]);
            } else {
                int count = 0;
                str = str + st.peek();
                while (!st.empty()) {
                    count++;
                    st.pop();
                }
                str = str + count;
                st.push(cs[i]);
            }
        }
        System.out.println(str);
    }

    public void queue(int[] arr, int k) {
        Queue<Integer> q = new ArrayDeque<>();
        for (int i = 0; i < arr.length; i++) {
            q.offer(arr[i]);
            System.out.println(q.toString());
        }
        for (int j = 0; j < k; j++) {
            int x = q.element();
            q.remove();
            q.add(x);

        }
        System.out.println(q.toString());

    }

    public boolean checkPrime(int a) {
        if (a < 2) {
            return false;
        }
        for (int i = 2; i < a; i++) {
            if ((a % i) == 0) {
                return false;
            }
        }
        return true;
    }

    public void superPrimeNumber(int n) {
        Queue<Integer> q = new ArrayDeque<>();
        for (int i = 2; i <10; i++) {
            if (checkPrime(i)) {
                q.offer(i);
            }
        }
        System.out.println(q.toString());
        while (!q.isEmpty()) {
            for (int i = 1; i <= 9; i++) {
                int x = ((q.peek()*10) + i);
                if (x <= n && checkPrime(x)) {
                    q.add(x);                   
                }               
            }
            System.out.print(q.peek()+ " ");
            q.remove();
            System.out.println(q.toString());
        }

    }
    
    public void reverseString(String s){
        char[] c = s.toCharArray();
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < c.length; i++) {
            st.push(c[i]);
        }
        System.out.println(st.toString());
        while(!st.empty()){
            System.out.printf("%c",st.peek());
            st.pop();
        }
    }
}
