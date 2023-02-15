
public class RemoveValueByLinkedList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        RemoveValueByLinkedList r = new RemoveValueByLinkedList();
        int[] arr = {1,1,2,2,3,3};
        r.removeValue(arr, 2);
    }

    public void removeValue(int[] arr, int k) {
        java.util.LinkedList list = new java.util.LinkedList();
        java.util.LinkedList list2 = new java.util.LinkedList();
        for (int i : arr) {
            list.add(i);
        }
        Integer x = null;

        if (k >= 0 && k < list.size()) {
            x = (Integer) list.get(k);
        }
        System.out.println(x);
        for (int i = 0; i < list.size(); i++) {
            if(x >= (Integer)list.get(i)){
                list2.add(list.get(i));
            }
        }
        

        System.out.println(list2.toString());
    }

}
