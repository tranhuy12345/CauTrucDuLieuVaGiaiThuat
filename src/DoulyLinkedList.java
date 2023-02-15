
public class DoulyLinkedList {

    
    public static void main(String[] args) {
        DoulyLinkedList l = new DoulyLinkedList();
        l.doublylinkedList(1);
    }
    
    public void doublylinkedList(int n){
        java.util.LinkedList list = new java.util.LinkedList();
        for (int i = n; i >= 1; i--) {
            list.addLast(i);
        }
        for (int i = 2; i <= n; i++) {
            list.addLast(i);
        }
        System.out.println(list.toString());
    }
    
}
