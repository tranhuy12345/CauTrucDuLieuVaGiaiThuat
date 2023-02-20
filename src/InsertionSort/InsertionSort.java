
package InsertionSort;

import java.util.ArrayList;

/**
 *
 * @author thuhuytran
 */
public class InsertionSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       ArrayList<Integer> arr = new ArrayList<>();
       arr.add(3);
       arr.add(2);
       arr.add(1);
       arr.add(4);
       arr.add(3);
       arr.add(3);
       InsertionSort i = new InsertionSort();
       i.insertionSort(arr);
       System.out.println(arr.toString());
    }
    public void insertionSort(ArrayList<Integer> list){
        
        for (int i = 1; i < list.size(); i++) {
            int index  = i;
            int value = list.get(i);
            while(index>0 && value<list.get(i-1)){
                int temp1 = list.get(index);
                int temp2 = list.get(index-1);
                list.set(index-1, temp1);
                list.set(index, temp2);
                index--;
            }
            
        }
        
    }
}
