
public class LinkedList3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LinkedList3 l = new LinkedList3();
        int[] arr = {1,1,2,1,2,3};
        l.changedTwoValueInLinkedList(arr, 1, 0);
    }
    public void changedTwoValueInLinkedList(int[] arr,int a,int b){
        java.util.LinkedList list = new java.util.LinkedList();
        for (int i : arr) {
            list.add(i);
        }
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i)== (Integer) a){
               list.remove(i);
               list.add(i, b);
            }
        }
        System.out.println(list.toString());
    }
    
}
