
public class RemoveIndexLinkedList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        RemoveIndexLinkedList ril = new RemoveIndexLinkedList();
        ril.linkedList3(arr, 3);
    }
    public void linkedList3(int[] arr,int k){
        java.util.LinkedList list = new java.util.LinkedList();
        for (int i : arr) {
            list.add(i);
        }
        if(k>=0 && k<arr.length){
            list.remove(k);
        }
        System.out.println(list.toString());
    }
    
}
