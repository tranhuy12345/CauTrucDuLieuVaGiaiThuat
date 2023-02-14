
import java.util.ArrayDeque;
import java.util.Queue;


public class MessagePhone {

    public static void main(String[] args) {
        int[] arr = {1,2,3,1,2,3};
        MessagePhone mp = new MessagePhone();
        mp.messagePhone(arr, 2);
    }
    public void messagePhone(int[] arr,int k){
        Queue q = new ArrayDeque();
        for (int i = 0; i < arr.length; i++) {
            if(q.size()<=(k-1)){
               if(!(q.contains(arr[i]))){
                   q.add(arr[i]);
               }
            }else{
                q.remove();
                q.add(arr[i]);
            }
        }
        while(!q.isEmpty()){
            System.out.print(q.peek()+" ");
            q.remove();
        }
    }
}
