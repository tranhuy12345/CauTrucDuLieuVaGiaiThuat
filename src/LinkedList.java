
public class LinkedList {

    
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        LinkedList l = new LinkedList();
        l.printLinkedList(arr);
    }
    public void printLinkedList(int[] arr){
        java.util.LinkedList linkedList = new java.util.LinkedList();
        for (int i = 0; i < arr.length; i++) {
            linkedList.add(arr[i]);
        }
        for (Object object : linkedList) {
            System.out.print(object+ " ");
        }
    }
}
