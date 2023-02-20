
package BubbleSort;

import java.util.ArrayList;

public class BubbleSort1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(3);
        arr.add(2);
        arr.add(1);
        arr.add(5);
        arr.add(3);
        BubbleSort1 b = new BubbleSort1();
        b.bubbleSort(arr);
        System.out.println(arr.toString());
    }
    
    public void bubbleSort(ArrayList<Integer> list){
        for (int i = list.size()-1; i >=1; i--) {
            boolean needSwaped = true; // Khong che vong lap trong truong hop mang da sap xep xong -> break
            for (int j = 0; j < i; j++) {
                if(list.get(j)>list.get(j+1)){
                    int temp = list.get(j);
                    int temp2 = list.get(j+1);
                    list.set(j,temp2);
                    list.set(j+1,temp);                
                    needSwaped = false;
                    
                }
            }
            if(needSwaped){
                break;
            }
        }
        System.out.println(list);
    }
    
}
