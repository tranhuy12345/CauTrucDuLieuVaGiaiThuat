
import java.util.ArrayDeque;
import java.util.Queue;


public class QueueBasic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        QueueBasic q = new QueueBasic();
        q.queue(arr, 5);
    }
    /*
    Input: n la so phan tu, k,
    
    */
    public void queue(int[] arr,int k){
        Queue<Integer> q = new ArrayDeque<>();
        for (int i = 0; i < arr.length; i++) {
            q.add(arr[i]);
        }
        System.out.println(q.toString());
        for (int i = 0; i < k; i++) {
            int t = q.peek();
            q.add(t);
            q.remove();
        }
        System.out.println(q.toString());
    }
    
    
}
