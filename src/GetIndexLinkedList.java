
public class GetIndexLinkedList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        GetIndexLinkedList gil = new GetIndexLinkedList();
        gil.linkedList4(arr, 0);
    }
    public void linkedList4(int[] arr,int k){
        java.util.LinkedList list = new java.util.LinkedList();
        for (int i : arr) {
            list.add(i);
        }
        if(k>=0 && k<arr.length){
            System.out.println(list.get(k));
        }
        
    }
}
