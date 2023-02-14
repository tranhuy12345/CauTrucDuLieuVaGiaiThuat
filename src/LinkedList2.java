
public class LinkedList2 {

    public static void main(String[] args) {
        LinkedList2 l = new LinkedList2();
        int[] arr = {1,2,3};
        l.linkedList2(arr, 2, 100);
    }
    public void linkedList2(int[] arr,int k, int x){
        java.util.LinkedList list = new java.util.LinkedList();
        for (int i : arr) {
            list.add(i);
        }
        if(k>=0 && k<=arr.length){
            list.add(k, x);
        }
        System.out.println(list.toString());
    }
}
