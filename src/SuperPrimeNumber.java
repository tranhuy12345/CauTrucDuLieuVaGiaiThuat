
import java.util.ArrayDeque;
import java.util.Queue;


public class SuperPrimeNumber {

    public static void main(String[] args) {
        SuperPrimeNumber spn = new SuperPrimeNumber();
        spn.superPrimeNumber(50);
    }
    
    public boolean checkPrime(int n){
        if(n<2){
            return false;
        }
        for (int i = 2; i < n; i++) {
            if((n%i)==0){
                return false;
            }
        }
        return true;
    }
    public void superPrimeNumber(int n){
        Queue<Integer> q = new ArrayDeque<>();
        for (int i = 2; i < n; i++) {
            if(checkPrime(i)&& i<10){
                q.add(i);
            }
        }
        while (!q.isEmpty()) {            
            for (int i = 1; i <= 9; i++) {
                int x = q.peek()*10 + i;
                if(x<=n && checkPrime(x)){
                    q.add(x);
                }
            }
            System.out.print(q.peek()+ " ");
            q.remove();
        }
    }
    
}
